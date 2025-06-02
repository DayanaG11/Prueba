package sv.edu.catolica.NetTEAM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import sv.edu.catolica.NetTEAM.service.IMedico;
import sv.edu.catolica.NetTEAM.repository.MedicoRepository;

import java.util.List;

@Service
public class MedicoImpl implements IMedico {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public List<MedicoEntity> findAll() {
        return medicoRepository.findAll();
    }

    @Override
    public MedicoEntity save(MedicoEntity medico){
        return medicoRepository.save(medico);
    }

    @Override
    public List<MedicoEntity> findByNombreContaining(String nombre) {
        return medicoRepository.findByNombreContaining(nombre);
    }

    @Override
    public MedicoEntity findById(Long id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        medicoRepository.deleteById(id);
    }
}
