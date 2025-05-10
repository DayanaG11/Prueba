package sv.edu.catolica.NetTEAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.PacienteEntity;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository <PacienteEntity,Long >{

}
