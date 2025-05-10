package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.entities.PacienteEntity;

import java.util.List;

public interface IPaciente {

    List<PacienteEntity> findAll();

    PacienteEntity save(PacienteEntity paciente);
}

