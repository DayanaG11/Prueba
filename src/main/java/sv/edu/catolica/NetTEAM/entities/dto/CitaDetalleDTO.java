package sv.edu.catolica.NetTEAM.entities.dto;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data // Anotación de Lombok para generar getters, setters, etc.
public class CitaDetalleDTO implements Serializable {
    private Long idcita_medica;
    private Date fecha;
    private String motivo;
    private String nombrePaciente;
    private String nombreMedico;

    public CitaDetalleDTO(Long idcita_medica, Date fecha, String motivo, String nombrePaciente, String nombreMedico) {
        this.idcita_medica = idcita_medica;
        this.fecha = fecha;
        this.motivo = motivo;
        this.nombrePaciente = nombrePaciente;
        this.nombreMedico = nombreMedico;
    }

    // Constructor vacío (recomendado para deserialización por frameworks)
    public CitaDetalleDTO() {}
}
