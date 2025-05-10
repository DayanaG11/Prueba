package sv.edu.catolica.NetTEAM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.dto.PacienteDto;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;
import sv.edu.catolica.NetTEAM.repository.PacienteRepository;
import sv.edu.catolica.NetTEAM.mapper.PacienteMapper;
import sv.edu.catolica.NetTEAM.service.IPaciente;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class PacienteImpl implements IPaciente{

   /* @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<PacienteEntity> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public PacienteEntity save(PacienteEntity paciente){
        return pacienteRepository.save(paciente);
    }*/
   @Autowired
   private PacienteRepository pacienteRepository;

    @Override
    public List<PacienteDto> findAll() {
        return pacienteRepository.findAll()
                .stream()
                .map(PacienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PacienteDto save(PacienteDto pacienteDTO) {
        PacienteEntity entity = PacienteMapper.toEntity(pacienteDTO);
        PacienteEntity saved = pacienteRepository.save(entity);
        return PacienteMapper.toDTO(saved);
    }

}
