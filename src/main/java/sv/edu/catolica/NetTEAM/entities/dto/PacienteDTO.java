package sv.edu.catolica.NetTEAM.entities.dto;

import lombok.Data;

import java.io.Serializable; // Buena práctica

@Data

public class PacienteDTO implements Serializable {
    private Long id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento; // Considera usar java.time.LocalDate
    private String direccion;
    private String telefono;
    private String email;

    // Constructor vacío
    public PacienteDTO() {
    }

    // Constructor con todos los campos (útil para mapeo desde entidad)
    public PacienteDTO(Long id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PacienteDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

