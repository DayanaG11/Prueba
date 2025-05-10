package sv.edu.catolica.NetTEAM.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.entities.Historial_MedicoEntity;
import sv.edu.catolica.NetTEAM.service.IHistorial_Medico;
import sv.edu.catolica.NetTEAM.repository.Historial_MedicoRepository;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/process")

public class Historial_MedicoController {

    @Autowired
    private IHistorial_Medico iHistorial_medico;
    private final Historial_MedicoRepository historial_medicoRepository;

    public Historial_MedicoController(Historial_MedicoRepository historial_medicoRepository) {
        this.historial_medicoRepository = historial_medicoRepository;
    }


    /*@Transactional(readOnly = true)//nicia una transacción al comenzar el metodo, solo permite lectura
    @GetMapping("/historial_medico")
    public List<Historial_MedicoEntity> findAll() {
       return iHistorial_medico.findAll();
    }*/

    @Transactional //nicia una transacción al comenzar el metodo
    @PostMapping("/historial_medico")
    public Historial_MedicoEntity save(@RequestBody Historial_MedicoEntity historial_medico){
        return iHistorial_medico.save(historial_medico);
    }

    @GetMapping("/historial_medico")
    public List<Map<String, String>> obtenerHistorialMedico() {
        return iHistorial_medico.obtenerHistorialMedico();
    }



}

