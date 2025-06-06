package sv.edu.catolica.NetTEAM.entities.dto;

import lombok.Data;

import java.io.Serializable; // Buena práctica

@Data

public class PacienteDTO implements Serializable {
    private Long id;
    private String nombre;
    private String edad;
    private String direccion;
    private String telefono;

    // Constructor vacío
    public PacienteDTO() {
    }

    // Constructor con todos los campos (útil para mapeo desde entidad)
    public PacienteDTO(Long id, String nombre, String edad, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    @Override
    public String toString() {
        return "PacienteDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

