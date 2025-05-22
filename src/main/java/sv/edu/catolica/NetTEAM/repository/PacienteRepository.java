package sv.edu.catolica.NetTEAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository <PacienteEntity,Long >{
    @Query("SELECT p  FROM PacienteEntity p WHERE p.nombre < :nombre" )
    List<PacienteEntity> findByNombre(@Param("nombre")  String nombre);
}
