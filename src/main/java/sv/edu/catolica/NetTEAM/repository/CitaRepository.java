package sv.edu.catolica.NetTEAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.CitaEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;

@Repository

public interface CitaRepository extends JpaRepository<CitaEntity,Long> {
}
