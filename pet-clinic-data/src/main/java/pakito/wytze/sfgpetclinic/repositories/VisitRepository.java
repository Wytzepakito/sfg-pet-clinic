package pakito.wytze.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pakito.wytze.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
