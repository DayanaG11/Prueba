package sv.edu.catolica.NetTEAM.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository

public interface MedicoRepository extends JpaRepository<MedicoEntity,Long> {

  @Query("SELECT m FROM MedicoEntity m WHERE m.nombre LIKE %:nombre%")
  List<MedicoEntity> findByNombreContaining(@Param("nombre") String nombre);
}
