package sv.edu.catolica.NetTEAM.repository;


import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository

public interface MedicoRepository extends JpaRepository<MedicoEntity,Long> {

  @Query("SELECT m FROM MedicoEntity m WHERE m.nombre LIKE %:nombre%")
    List<MedicoEntity> findByNombreContaining(@Param("nombre") String nombre);
}
