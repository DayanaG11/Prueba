package sv.edu.catolica.NetTEAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.catolica.NetTEAM.entities.dto.CitaDetalleDTO; // Importa tu DTO
import java.util.List;


@Repository

public interface CitaRepository extends JpaRepository<CitaEntity,Long> {

    @Query("SELECT new sv.edu.catolica.NetTEAM.entities.dto.CitaDetalleDTO(" +
            "c.idcita_medica, c.fecha, c.motivo, " + // Campos de CitaEntity
            "p.nombre, " +                          // Campo 'nombre' de PacienteEntity
            "m.nombre) " +                          // Campo 'nombre' de MedicoEntity
            "FROM CitaEntity c, PacienteEntity p, MedicoEntity m " + // Declaración de entidades con alias
            "WHERE c.id_paciente = p.idPaciente AND c.id_medico = m.id_medico") // Condiciones de JOIN
    List<CitaDetalleDTO> findAllCitaDetails();

    // Consulta para obtener detalles de citas filtradas por ID de paciente
    @Query("SELECT new sv.edu.catolica.NetTEAM.entities.dto.CitaDetalleDTO(" +
            "c.idcita_medica, c.fecha, c.motivo, " +
            "p.nombre, " +
            "m.nombre) " +
            "FROM CitaEntity c, PacienteEntity p, MedicoEntity m " +
            "WHERE c.id_paciente = p.idPaciente AND c.id_medico = m.id_medico AND c.id_paciente = :idPaciente")
    List<CitaDetalleDTO> findCitaDetailsByPacienteId(@Param("idPaciente") int idPaciente);



    // Consulta para obtener detalles de citas filtradas por ID de médico
    @Query("SELECT new sv.edu.catolica.NetTEAM.entities.dto.CitaDetalleDTO(" +
            "c.idcita_medica, c.fecha, c.motivo, " + "p.nombre, " + "m.nombre) " +
            "FROM CitaEntity c, PacienteEntity p, MedicoEntity m " +
            "WHERE c.id_paciente = p.idPaciente AND c.id_medico = m.id_medico AND c.id_medico = :idMedico")
    List<CitaDetalleDTO> findCitaDetailsByMedicoId(@Param("idMedico") int idMedico);
}




