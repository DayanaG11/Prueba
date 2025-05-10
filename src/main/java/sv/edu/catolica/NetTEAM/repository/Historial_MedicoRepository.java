package sv.edu.catolica.NetTEAM.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.Historial_MedicoEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;

import java.util.Optional;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface Historial_MedicoRepository extends JpaRepository<Historial_MedicoEntity,Long>  {

    @Query(value = "SELECT hm.idhistorial_medico , p.nombre , hm.observacion FROM net_team.historial_medico as hm inner join net_team.paciente as p on hm.id_paciente = p.id_paciente", nativeQuery = true)
    List<Object[]> obtenerHistorialMedico();
}
