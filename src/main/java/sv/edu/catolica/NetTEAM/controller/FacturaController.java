package sv.edu.catolica.NetTEAM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.NetTEAM.entities.FacturaEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import sv.edu.catolica.NetTEAM.service.IFactura;


import java.util.List;

@RestController
@RequestMapping("/process")
public class FacturaController {

    @Autowired
    private IFactura iFactura;

    @Transactional(readOnly = true)
    @GetMapping("/factura")
    public List<FacturaEntity> findAll() {
        return iFactura.findAll();
    }

    @Transactional
    @PostMapping("/factura")
    public FacturaEntity save(@RequestBody FacturaEntity factura){
        return iFactura.save(factura);
    }

}
