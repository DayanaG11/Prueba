package sv.edu.catolica.NetTEAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.FacturaEntity;
import sv.edu.catolica.NetTEAM.entities.dto.FacturaDetalleDTO;
import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity, Long> {

    @Query("SELECT new sv.edu.catolica.NetTEAM.entities.dto.FacturaDetalleDTO(" +
            "f.id_factura, " +          // Long
            "f.total, " +               // Double
            "f.fecha, " +               // Date
            "f.pagado, " +              // Boolean
            "m.nombre, " +              // String (nombre del medicamento)
            "f.servicios, " +           // String (servicios de la factura)
            "f.metodo_pago, " +         // String (método de pago de la factura)
            "p.nombre) " +              // String (nombre del paciente, ya que no tiene apellido)
            "FROM FacturaEntity f, MedicamentoEntity m, PacienteEntity p " +
            "WHERE f.medicamento = m.id_medicamento AND f.id_paciente = p.idPaciente") // Asegúrate de estos nombres de atributos
    List<FacturaDetalleDTO> findAllFacturaDetails();

    @Query("SELECT new sv.edu.catolica.NetTEAM.entities.dto.FacturaDetalleDTO(" +
            "f.id_factura, " +
            "f.total, " +
            "f.fecha, " +
            "f.pagado, " +
            "m.nombre, " +
            "f.servicios, " +
            "f.metodo_pago, " +
            "p.nombre) " +
            "FROM FacturaEntity f, MedicamentoEntity m, PacienteEntity p " +
            "WHERE f.medicamento = m.id_medicamento AND f.id_paciente = p.idPaciente AND f.id_paciente = :idPaciente")
    List<FacturaDetalleDTO> findFacturaDetailsByPacienteId(int idPaciente); // Parámetro int para f.id_paciente
}