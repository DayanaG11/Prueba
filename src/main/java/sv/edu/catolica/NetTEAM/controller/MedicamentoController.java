package sv.edu.catolica.NetTEAM.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.entities.MedicamentoEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import sv.edu.catolica.NetTEAM.service.IMedicamento;
import sv.edu.catolica.NetTEAM.service.IMedico;

import java.util.List;
@Data
@RestController
@RequestMapping("/process")
public class MedicamentoController {

    @Autowired
    private IMedicamento iMedicamento;

    @Transactional(readOnly = true)
    @GetMapping("/medicamento")
    public List<MedicamentoEntity> findAll() {
        return iMedicamento.findAll();
    }

    @Transactional(readOnly = true)
    @GetMapping("/medicamento/por-nombre")
    public List<MedicamentoEntity> getMedicamentosByNombre(@RequestParam String nombre) {
        return iMedicamento.findByNombreContaining(nombre);
    }

    @Transactional
    @PostMapping("/medicamento")
    public MedicamentoEntity save(@RequestBody MedicamentoEntity medicamento){
        return iMedicamento.save(medicamento);
    }

    @PutMapping("/medicamento/{id}")
    public ResponseEntity<MedicamentoEntity> update(@PathVariable Long id, @RequestBody MedicamentoEntity medicamento) {
        MedicamentoEntity existente = iMedicamento.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        // Actualiza los campos necesarios
        existente.setNombre(medicamento.getNombre());
        existente.setDescripcion(medicamento.getDescripcion());
        existente.setDosis(medicamento.getDosis());
        existente.setEfectos_secundarios(medicamento.getEfectos_secundarios());

        MedicamentoEntity actualizado = iMedicamento.save(existente);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/medicamento/{id}")
    public void delete(@PathVariable Long id) {
        iMedicamento.delete(id);
    }

}
