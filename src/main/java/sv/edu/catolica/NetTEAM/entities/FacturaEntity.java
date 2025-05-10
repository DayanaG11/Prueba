package sv.edu.catolica.NetTEAM.entities;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

import java.time.DateTimeException;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "factura")
public class FacturaEntity {
    @Id
    @Column(columnDefinition = "INT",name = "id_factura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;

    @Column(columnDefinition = "DOUBLE")
    private Double total;

    @Column(columnDefinition = "DATETIME")
    private Date fecha;

    @Column(columnDefinition = "BOOLEAN")
    private Boolean pagado = false;

    @Column(columnDefinition = "INT")
    private int medicamento;

    @Column(columnDefinition = "TEXT")
    private String servicios;

    public Long getId_factura() {
        return id_factura;
    }

    public void setId_factura(Long id_factura) {
        this.id_factura = id_factura;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public int getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(int medicamento) {
        this.medicamento = medicamento;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
}
