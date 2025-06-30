package rs.ac.singidunum.programskijezici2025.repository;

import rs.ac.singidunum.programskijezici2025.model.PlanTreninga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanTreningaRepository extends JpaRepository<PlanTreninga, Long> {
}
