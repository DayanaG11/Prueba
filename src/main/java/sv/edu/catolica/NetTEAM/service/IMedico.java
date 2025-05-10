package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.entities.MedicoEntity;

import java.util.List;

public interface IMedico {

    List<MedicoEntity> findAll();

    MedicoEntity save(MedicoEntity medico);
}
