package sv.edu.catolica.NetTEAM.mapper;

import sv.edu.catolica.NetTEAM.dto.PacienteDto;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;

public class PacienteMapper {

    // Convierte de Entity a DTO
    public static PacienteDto toDTO(PacienteEntity entity) {
        if (entity == null) return null;
        return new PacienteDto(
                entity.getIdPaciente(),
                entity.getNombre(),
                entity.getEdad(),
                entity.getDireccion(),
                entity.getTelefono()
        );
    }

    // Convierte de DTO a Entity
    public static PacienteEntity toEntity(PacienteDto dto) {
        if (dto == null) return null;
        PacienteEntity entity = new PacienteEntity();
        entity.setIdPaciente(dto.getIdPaciente());
        entity.setNombre(dto.getNombre());
        entity.setEdad(dto.getEdad());
        entity.setDireccion(dto.getDireccion());
        entity.setTelefono(dto.getTelefono());
        return entity;
    }
}
