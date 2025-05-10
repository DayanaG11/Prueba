package sv.edu.catolica.NetTEAM.entities;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medico")

public class MedicoEntity {
    @Id
    @Column(columnDefinition = "INT",name = "id_medico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_medico;
    @Column(columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(columnDefinition = "CHAR(100)")
    private String especialidad;

    @Column(columnDefinition = "VARCHAR(10)")
    private String telefono;

    @Column(columnDefinition = "VARCHART(100)")
    private String email;

    public Long getId_medico() {
        return id_medico;
    }

    public void setId_medico(Long id_medico) {
        this.id_medico = id_medico;
    }

    public String getNombre_medico() {
        return nombre;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre = nombre_medico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono_medico(String telefono_medico) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

