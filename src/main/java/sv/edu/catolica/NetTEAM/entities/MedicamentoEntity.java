package sv.edu.catolica.NetTEAM.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicamento")
public class MedicamentoEntity {

    @Id
    @Column(columnDefinition = "INT",name = "id_medicamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_medicamento;

    @Column(columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(columnDefinition = "VARCHAR(250)")
    private String descripcion;

    @Column(columnDefinition = "VARCHAR(45)")
    private String dosis;

    @Column(columnDefinition = "VARCHAR(250)")
    private String efectos_secundarios;


}
