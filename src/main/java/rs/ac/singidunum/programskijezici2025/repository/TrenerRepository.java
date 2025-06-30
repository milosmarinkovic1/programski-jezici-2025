package rs.ac.singidunum.programskijezici2025.repository;

import rs.ac.singidunum.programskijezici2025.model.Trener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrenerRepository extends JpaRepository<Trener, Long> {
}
