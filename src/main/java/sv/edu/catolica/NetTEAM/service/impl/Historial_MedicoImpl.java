package sv.edu.catolica.NetTEAM.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.Historial_MedicoEntity;
import sv.edu.catolica.NetTEAM.service.IHistorial_Medico;
import sv.edu.catolica.NetTEAM.repository.Historial_MedicoRepository;

import java.util.*;

import java.util.List; // Para manejar colecciones de usuarios (si es necesario en el futuro)

import org.springframework.stereotype.Service; // Anotación para indicar que esta clase es un servicio gestionado por Spring


@Service
public class Historial_MedicoImpl implements IHistorial_Medico {

    @Autowired
    private Historial_MedicoRepository historial_medicoRepository;

    @Override
    public List<Historial_MedicoEntity> findAll() {
        return historial_medicoRepository.findAll();
    }

    @Override
    public Historial_MedicoEntity save(Historial_MedicoEntity historial_medico) {
        return historial_medicoRepository.save(historial_medico);
    }

    // Obtener Historial medico

    public List<Map<String, String>> obtenerHistorialMedico() {
        List<Object[]> resultado = historial_medicoRepository.obtenerHistorialMedico();

        List<Map<String, String>> historialMedico = new ArrayList<>();
        for (Object[] fila : resultado) {
            Map<String, String> mapa = new HashMap<>();
            mapa.put("idhistorial_medico", String.valueOf(fila[0]));
            mapa.put("nombre", String.valueOf(fila[1]));
            mapa.put("observacion", String.valueOf(fila[2]));
            historialMedico.add(mapa);
        }

        return historialMedico;
    }

}
