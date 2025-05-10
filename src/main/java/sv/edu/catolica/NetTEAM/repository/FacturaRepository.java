package sv.edu.catolica.NetTEAM.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.NetTEAM.entities.FacturaEntity;
import sv.edu.catolica.NetTEAM.entities.MedicoEntity;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity,Long> {
}
