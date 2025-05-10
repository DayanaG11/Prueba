package sv.edu.catolica.NetTEAM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;
import sv.edu.catolica.NetTEAM.service.IPaciente;

import java.util.List;

@RestController
@RequestMapping("/process")
public class PacienteController {

    @Autowired
    private IPaciente iPaciente;

    @Transactional(readOnly = true)
    @GetMapping("/paciente")
    public List<PacienteEntity> findAll() {
        return iPaciente.findAll();
    }


    @Transactional
    @PostMapping("/paciente")
    public PacienteEntity savePaciente(@RequestBody PacienteEntity paciente) {
        return iPaciente.save(paciente);
    }
}
