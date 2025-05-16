package sv.edu.catolica.NetTEAM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;
import sv.edu.catolica.NetTEAM.repository.PacienteRepository;
import sv.edu.catolica.NetTEAM.service.IPaciente;

import java.util.List;

@Service
public class PacienteImpl implements IPaciente{

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<PacienteEntity> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public PacienteEntity save(PacienteEntity paciente){
        return pacienteRepository.save(paciente);
    }

}
