package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.dto.PacienteDto;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;

import java.util.List;

public interface IPaciente {

    List<PacienteDto> findAll();
    PacienteDto save(PacienteDto paciente);


}

