package pakito.wytze.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pakito.wytze.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
