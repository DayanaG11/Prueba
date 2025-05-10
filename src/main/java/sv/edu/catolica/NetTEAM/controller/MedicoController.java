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

    @Transactional
    @PostMapping("/medico")
    public MedicoEntity save(@RequestBody MedicoEntity medico){
        return iMedico.save(medico);
    }

}
