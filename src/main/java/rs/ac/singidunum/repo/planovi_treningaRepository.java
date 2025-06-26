package rs.ac.singidunum.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.singidunum.entity.planovi_treninga;
import java.util.List;

@Repository
public interface planovi_treningaRepository extends JpaRepository<planovi_treninga,Integer> {

    List<planovi_treninga> findAllByDeletedAtIsNull();


}


// nalazi sve entitete koje nalaze uslov, a uslov je da polje deleted at bude null.




