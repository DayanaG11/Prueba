package sv.edu.catolica.NetTEAM.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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


    public Long getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(Long id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getEfectos_secundarios() {
        return efectos_secundarios;
    }

    public void setEfectos_secundarios(String efectos_secundarios) {
        this.efectos_secundarios = efectos_secundarios;
    }
}
