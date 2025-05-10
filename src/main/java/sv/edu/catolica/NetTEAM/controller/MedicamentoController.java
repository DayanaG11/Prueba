package sv.edu.catolica.NetTEAM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.entities.MedicamentoEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import sv.edu.catolica.NetTEAM.service.IMedicamento;
import sv.edu.catolica.NetTEAM.service.IMedico;

import java.util.List;

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

    @Transactional
    @PostMapping("/medicamento")
    public MedicamentoEntity save(@RequestBody MedicamentoEntity medicamento){
        return iMedicamento.save(medicamento);
    }

}
