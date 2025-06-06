package sv.edu.catolica.NetTEAM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.entities.dto.CitaDetalleDTO;
import sv.edu.catolica.NetTEAM.repository.CitaRepository;
import sv.edu.catolica.NetTEAM.service.ICita;
import java.util.Optional;
import java.util.List;

@Service

public class CitaImpl implements ICita {

    private CitaRepository citaRepository;

    @Autowired
    public CitaImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public List<CitaEntity> findAll() {
        return citaRepository.findAll();
    }

    @Override
    public CitaEntity save(CitaEntity cita_medica){
        return citaRepository.save(cita_medica);
    }

    @Override
    public Optional<CitaEntity> findById(Long id) {
        return citaRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        citaRepository.deleteById(id);
    }


    @Override
    public List<CitaDetalleDTO> findAllCitaDetails() {
        return citaRepository.findAllCitaDetails();
    }

    @Override
    public List<CitaDetalleDTO> findCitaDetailsByPacienteId(int idPaciente) {
        return citaRepository.findCitaDetailsByPacienteId(idPaciente);
    }

    @Override
    public List<CitaDetalleDTO> findCitaDetailsByMedicoId(int idMedico) {
        return citaRepository.findCitaDetailsByMedicoId(idMedico);
    }

}
