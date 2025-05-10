package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.entities.MedicamentoEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;

import java.util.List;

public interface IMedicamento {

    List<MedicamentoEntity> findAll();

    MedicamentoEntity save(MedicamentoEntity medicamento);
}
