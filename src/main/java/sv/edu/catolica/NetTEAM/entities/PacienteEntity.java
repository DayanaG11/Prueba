package sv.edu.catolica.NetTEAM.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="paciente")
public class PacienteEntity {

    @Id

    @Column(columnDefinition = "INT", name = "id_paciente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;
    @Column(columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(columnDefinition = "INT")
    private int edad;

    @Column(columnDefinition = "VARCHAR(150)" )
    private String direccion;

    @Column(columnDefinition = "VARCHAR(10)")
    private String telefono;

}
