package sv.edu.catolica.NetTEAM.entities.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data

public class FacturaDetalleDTO implements Serializable {
    private Long idFactura;
    private Double total;
    private Date fecha;
    private Boolean pagado;
    private String nombreMedicamento;
    private String tipoServicio; // Asumo que esto es f.servicios
    private String metodoPago;
    private String nombrePaciente; // Solo el nombre, sin apellido

    // Constructor vacío
    public FacturaDetalleDTO() {
    }

    // Constructor para mapeo desde la consulta del repositorio
    public FacturaDetalleDTO(Long idFactura, Double total, Date fecha, Boolean pagado,
                             String nombreMedicamento, String tipoServicio, String metodoPago,
                             String nombrePaciente) { // Solo nombrePaciente, no concatenado
        this.idFactura = idFactura;
        this.total = total;
        this.fecha = fecha;
        this.pagado = pagado;
        this.nombreMedicamento = nombreMedicamento;
        this.tipoServicio = tipoServicio; // Corregir si f.servicios se mapea a otro campo en DTO
        this.metodoPago = metodoPago;
        this.nombrePaciente = nombrePaciente;
    }

    @Override
    public String toString() {
        return "FacturaDetalleDTO{" +
                "idFactura=" + idFactura +
                ", total=" + total +
                ", fecha=" + fecha +
                ", pagado=" + pagado +
                ", nombreMedicamento='" + nombreMedicamento + '\'' +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                '}';
    }
}