package sv.edu.catolica.NetTEAM.service;


import sv.edu.catolica.NetTEAM.entities.Historial_MedicoEntity;

import java.util.List;
import java.util.Map;

public interface IHistorial_Medico {

    List<Historial_MedicoEntity> findAll();
    List<Map<String, String>> obtenerHistorialMedico();
    Historial_MedicoEntity save(Historial_MedicoEntity historial_medico);

}
