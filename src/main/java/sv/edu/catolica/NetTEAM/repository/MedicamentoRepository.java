package sv.edu.catolica.NetTEAM.repository;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.MedicamentoEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;

import java.util.List;


@Repository
public interface MedicamentoRepository extends JpaRepository<MedicamentoEntity,Long> {

  @Query("SELECT p FROM MedicamentoEntity p WHERE p.nombre LIKE %:nombre%")
  List<MedicamentoEntity> findByNombreContaining(@Param("nombre") String nombre);

}
