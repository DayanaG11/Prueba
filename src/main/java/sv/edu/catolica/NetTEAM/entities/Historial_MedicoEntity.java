package sv.edu.catolica.NetTEAM.entities;


import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

import java.time.DateTimeException;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historial_medico")
public class Historial_MedicoEntity {

    @Id
    @Column(columnDefinition = "INT",name = "idhistorial_medico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idhistorial_medico;

    @Column(columnDefinition = "INT")
    private Long id_paciente;

    @Column(columnDefinition = "TEXT(255)")
    private String observacion;

    public Long getIdhistorial_medico() {
        return idhistorial_medico;
    }

    public void setIdhistorial_medico(Long idhistorial_medico) {
        this.idhistorial_medico = idhistorial_medico;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


}
