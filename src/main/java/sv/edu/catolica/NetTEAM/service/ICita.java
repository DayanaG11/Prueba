package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.entities.dto.CitaDetalleDTO;
import java.util.Optional;
import java.util.List;

public interface ICita {

    List<CitaEntity> findAll();

    CitaEntity save(CitaEntity cita_medica);

    Optional<CitaEntity> findById(Long id);

    void deleteById(Long id);

    List<CitaDetalleDTO> findAllCitaDetails();
    List<CitaDetalleDTO> findCitaDetailsByPacienteId(int idPaciente);
    List<CitaDetalleDTO> findCitaDetailsByMedicoId(int idMedico);


}
