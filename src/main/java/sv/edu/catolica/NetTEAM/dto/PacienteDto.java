package sv.edu.catolica.NetTEAM.dto;

public class PacienteDto {
    private Long idPaciente;
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;

    // Constructor vacío necesario para frameworks (como Jackson).
    public PacienteDto() {}

    // Constructor con todos los campos, útil para crear DTOs rápidamente.
    public PacienteDto(Long idPaciente, String nombre, int edad, String direccion, String telefono) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters estándar.


    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
