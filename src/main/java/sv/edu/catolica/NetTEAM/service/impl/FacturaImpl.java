package sv.edu.catolica.NetTEAM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.FacturaEntity;
import sv.edu.catolica.NetTEAM.repository.FacturaRepository;
import sv.edu.catolica.NetTEAM.service.IFactura;


import java.util.List;

@Service
public class FacturaImpl implements IFactura {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<FacturaEntity> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public FacturaEntity save(FacturaEntity factura){
        return facturaRepository.save(factura);
    }
}