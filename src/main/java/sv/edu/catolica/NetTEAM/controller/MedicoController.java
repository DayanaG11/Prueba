package sv.edu.catolica.NetTEAM.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import sv.edu.catolica.NetTEAM.service.IMedico;

import java.util.List;

@RestController
@RequestMapping("/process")

public class MedicoController {

    @Autowired
    private IMedico iMedico;

    @Transactional(readOnly = true)
    @GetMapping("/medico")
    public List<MedicoEntity> findAll() {
        return iMedico.findAll();
    }

    @Transactional(readOnly = true)
    @GetMapping("/medico/por-nombre")
    public List<MedicoEntity> getMedicosByNombre(@RequestParam String nombre) {
        return iMedico.findByNombreContaining(nombre);
    }

    @Transactional
    @PostMapping("/medico")
    public MedicoEntity save(@RequestBody MedicoEntity medico){
        return iMedico.save(medico);
    }
    @PutMapping("/medico/{id}")
    public ResponseEntity<MedicoEntity> update(@PathVariable Long id, @RequestBody MedicoEntity medico) {
        MedicoEntity existente = iMedico.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        // Actualiza los campos necesarios
        existente.setNombre(medico.getNombre());
        existente.setEspecialidad(medico.getEspecialidad());
        existente.setTelefono(medico.getTelefono());

        MedicoEntity actualizado = iMedico.save(existente);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/medico/{id}")
    public void delete(@PathVariable Long id) {
        iMedico.delete(id);
    }

}
