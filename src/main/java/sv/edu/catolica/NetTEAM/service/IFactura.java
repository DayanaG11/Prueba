package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.entities.FacturaEntity;

import java.util.List;

public interface IFactura {

    List<FacturaEntity> findAll();

    FacturaEntity save(FacturaEntity factura);
}
