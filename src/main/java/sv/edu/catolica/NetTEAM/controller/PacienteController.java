package sv.edu.catolica.NetTEAM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.controller.response.MessageResponse;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;
import sv.edu.catolica.NetTEAM.service.IPaciente;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process")
public class PacienteController {

    @Autowired
    private IPaciente iPaciente;
//GET
    @Transactional(readOnly = true)
    @GetMapping(value = "/paciente", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageResponse> getPaciente() {
         MessageResponse response = MessageResponse.builder()
                .message("Proceso realizado con éxito.")
                .data(iPaciente.findAll()) // Aquí iProducto.findAll() devolverá ProductDTOs o ProductEntities
                .build();

        return ResponseEntity.ok(response); // Devuelve un HTTP 200 OK con el cuerpo de MessageReponse
    }


    @Transactional(readOnly = true)
    @GetMapping("/paciente")
    public List<PacienteEntity> findAll() {
        return iPaciente.findAll();
    }



//POST
    @Transactional
    @PostMapping("/paciente")
    public PacienteEntity save(@RequestBody PacienteEntity paciente){
        return iPaciente.save(paciente);
    }

}
