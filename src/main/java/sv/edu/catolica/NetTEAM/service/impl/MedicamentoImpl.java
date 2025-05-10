package sv.edu.catolica.NetTEAM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.MedicamentoEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import sv.edu.catolica.NetTEAM.repository.MedicamentoRepository;
import sv.edu.catolica.NetTEAM.repository.MedicoRepository;
import sv.edu.catolica.NetTEAM.service.IMedicamento;
import sv.edu.catolica.NetTEAM.service.IMedico;

import java.util.List;

@Service
public class MedicamentoImpl implements IMedicamento {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    @Override
    public List<MedicamentoEntity> findAll() {
        return medicamentoRepository.findAll();
    }

    @Override
    public MedicamentoEntity save(MedicamentoEntity medicamento){

        return medicamentoRepository.save(medicamento);
    }


}