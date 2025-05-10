package sv.edu.catolica.NetTEAM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.repository.CitaRepository;
import sv.edu.catolica.NetTEAM.service.ICita;
import sv.edu.catolica.NetTEAM.service.IMedico;

import java.util.List;

@Service

public class CitaImpl implements ICita {

    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<CitaEntity> findAll() {
        return citaRepository.findAll();
    }

    @Override
    public CitaEntity save(CitaEntity cita_medica){
        return citaRepository.save(cita_medica);
    }

}
