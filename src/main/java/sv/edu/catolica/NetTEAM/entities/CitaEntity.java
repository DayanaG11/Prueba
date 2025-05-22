package sv.edu.catolica.NetTEAM.entities;


import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

import java.time.DateTimeException;
@Data
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

    @Column(columnDefinition = "INT")
    private int id_paciente;

    @Column(columnDefinition = "INT")
    private int id_medico;

}
