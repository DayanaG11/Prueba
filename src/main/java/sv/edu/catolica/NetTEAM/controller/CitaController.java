package sv.edu.catolica.NetTEAM.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import sv.edu.catolica.NetTEAM.service.ICita;
import sv.edu.catolica.NetTEAM.service.IMedico;

import java.util.List;

@RestController
@RequestMapping("/process")

public class CitaController {

    @Autowired
    private ICita iCita;

    @Transactional(readOnly = true)
    @GetMapping("/cita_medica")
    public List<CitaEntity> findAll() {
        return iCita.findAll();
    }

    @Transactional
    @PostMapping("/cita_medica")
    public CitaEntity save(@RequestBody CitaEntity cita_medica){
        return iCita.save(cita_medica);
    }

}
