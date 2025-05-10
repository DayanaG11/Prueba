package sv.edu.catolica.NetTEAM.entities;


import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

import java.time.DateTimeException;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cita_medica")

public class CitaEntity {
    @Id
    @Column(columnDefinition = "INT",name = "idcita_medica")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcita_medica;

    @Column(columnDefinition = "DATE")
    private Date fecha;

    @Column(columnDefinition = "VARCHAR(200)")
    private String motivo;

    @Column(columnDefinition = "VARCHAR(45)")
    private String estado;

    public Long getIdcita_medica() {
        return idcita_medica;
    }

    public void setIdcita_medica(Long idcita_medica) {
        this.idcita_medica = idcita_medica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
