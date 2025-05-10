package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;

import java.util.List;

public interface ICita {

    List<CitaEntity> findAll();

    CitaEntity save(CitaEntity cita_medica);

}
