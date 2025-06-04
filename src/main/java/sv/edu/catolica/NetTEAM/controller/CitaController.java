package sv.edu.catolica.NetTEAM.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.controller.response.MessageResponse;
import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.entities.dto.CitaDetalleDTO;
import sv.edu.catolica.NetTEAM.service.ICita;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/process")

public class CitaController {

    @Autowired
    private ICita iCita;

    /*@Transactional(readOnly = true)
    @GetMapping("/cita_medica")
    public List<CitaEntity> findAll() {
        return iCita.findAll();
    }*/

    @Transactional(readOnly = true)
    @GetMapping(value = "/citas/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageResponse> getAllCitaDetails() {
        try {
            List<CitaDetalleDTO> citaDetails = iCita.findAllCitaDetails();
            MessageResponse response = MessageResponse.builder()
                    .message("Detalles de citas obtenidos exitosamente.")
                    .data(citaDetails)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            MessageResponse errorResponse = MessageResponse.builder()
                    .message("Error al obtener detalles de citas: " + e.getMessage())
                    .data(null)
                    .build();
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @Transactional
    @PostMapping("/cita_medica")
    public CitaEntity save(@RequestBody CitaEntity cita_medica){
        return iCita.save(cita_medica);
    }

    @PutMapping("/cita_medica/{id}")
    public ResponseEntity<CitaEntity> update(@PathVariable Long id, @RequestBody CitaEntity cita_medica) {
        Optional<CitaEntity> existente = iCita.findById(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        // Actualiza los campos necesarios
        existente.get().setFecha(cita_medica.getFecha());
        existente.get().setMotivo(cita_medica.getMotivo());
        existente.get().setEstado(cita_medica.getEstado());

        CitaEntity actualizado = iCita.save(existente.orElse(null));
        return ResponseEntity.ok(actualizado);
    }

   @DeleteMapping("/cita_medica/{id}")
    public void delete(@PathVariable Long id) {
        iCita.deleteById(id);
    }

}
