package sv.edu.catolica.NetTEAM.service.impl;

import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.entities.FacturaEntity;
import sv.edu.catolica.NetTEAM.entities.dto.FacturaDetalleDTO; // ¡Importar el DTO!
import sv.edu.catolica.NetTEAM.repository.FacturaRepository; // Importar el repositorio
import sv.edu.catolica.NetTEAM.service.IFactura; // Importar la interfaz de servicio


import java.util.List;
import java.util.Optional;

@Service
public class FacturaImpl implements IFactura {


    private FacturaRepository facturaRepository;

    @Autowired
    public FacturaImpl(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @Override
    public List<FacturaEntity> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }

    @Override
    public Optional<FacturaEntity> findById(Long id) {
        return facturaRepository.findById(id);
    }


    @Override
    public FacturaEntity save(FacturaEntity factura){
        return facturaRepository.save(factura);
    }
    @Override
    public List<FacturaDetalleDTO> findAllFacturaDetails() {

        return facturaRepository.findAllFacturaDetails();
    }

    @Override
    public List<FacturaDetalleDTO> findFacturaDetailsByPacienteId(int idPaciente) {

        return facturaRepository.findFacturaDetailsByPacienteId(idPaciente);
    }
}