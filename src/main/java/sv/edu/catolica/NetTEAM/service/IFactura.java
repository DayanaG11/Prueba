package sv.edu.catolica.NetTEAM.service;

import sv.edu.catolica.NetTEAM.entities.FacturaEntity;
import sv.edu.catolica.NetTEAM.entities.dto.FacturaDetalleDTO;
import java.util.List;
import java.util.Optional;
import java.util.List;

public interface IFactura {

    List<FacturaEntity> findAll();

    FacturaEntity save(FacturaEntity factura);

   List<FacturaDetalleDTO> findAllFacturaDetails();
    List<FacturaDetalleDTO> findFacturaDetailsByPacienteId(int idPaciente);
}
