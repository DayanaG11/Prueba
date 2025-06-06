package sv.edu.catolica.NetTEAM.entities;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

import java.time.DateTimeException;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
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

    @Column(columnDefinition = "VARCHAR")
    private String metodo_pago;

    @Column(columnDefinition = "INT")
    private int id_paciente;

}
