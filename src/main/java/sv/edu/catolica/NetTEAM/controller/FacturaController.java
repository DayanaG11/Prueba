package sv.edu.catolica.NetTEAM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; // Importar HttpStatus
import org.springframework.http.MediaType; // Importar MediaType
import org.springframework.http.ResponseEntity; // Importar ResponseEntity
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*; // Importar todas las anotaciones de Web
import sv.edu.catolica.NetTEAM.entities.FacturaEntity;
// import sv.edu.catolica.NetTEAM.entities.MedicoEntity; // Si no usas MedicoEntity, puedes quitar este import
import sv.edu.catolica.NetTEAM.entities.dto.FacturaDetalleDTO; // Importar tu DTO
import sv.edu.catolica.NetTEAM.controller.response.MessageResponse; // Importar MessageResponse
import sv.edu.catolica.NetTEAM.service.IFactura;

import java.util.List;

@RestController
@RequestMapping("/process")
public class FacturaController {

    @Autowired
    private IFactura iFactura;



    @Transactional
    @PostMapping("/factura")
    public FacturaEntity save(@RequestBody FacturaEntity factura){
        return iFactura.save(factura);
    }

    @Transactional(readOnly = true)
    @GetMapping(value = "/factura/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageResponse> getAllFacturaDetails() {
        try {
            List<FacturaDetalleDTO> facturaDetails = iFactura.findAllFacturaDetails();

            MessageResponse response = MessageResponse.builder()
                    .message("Detalles de facturas obtenidos exitosamente.")
                    .data(facturaDetails)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            MessageResponse errorResponse = MessageResponse.builder()
                    .message("Error al obtener detalles de facturas: " + e.getMessage())
                    .data(null)
                    .build();
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint para obtener detalles de facturas por ID de paciente
    @Transactional(readOnly = true)
    @GetMapping(value = "/factura/details/paciente/{idPaciente}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageResponse> getFacturaDetailsByPacienteId(@PathVariable int idPaciente) { // Asegúrate de que idPaciente sea 'int' o 'Long' según tu entidad y DB
        try {
            List<FacturaDetalleDTO> facturaDetails = iFactura.findFacturaDetailsByPacienteId(idPaciente);

            if (facturaDetails.isEmpty()) {
                MessageResponse noDataResponse = MessageResponse.builder()
                        .message("No se encontraron detalles de facturas para el paciente con ID: " + idPaciente)
                        .data(null)
                        .build();
                return new ResponseEntity<>(noDataResponse, HttpStatus.NOT_FOUND);
            }

            MessageResponse response = MessageResponse.builder()
                    .message("Detalles de facturas obtenidos exitosamente para el paciente con ID: " + idPaciente)
                    .data(facturaDetails)
                    .build();
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            MessageResponse errorResponse = MessageResponse.builder()
                    .message("Error al obtener detalles de facturas por paciente: " + e.getMessage())
                    .data(null)
                    .build();
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
