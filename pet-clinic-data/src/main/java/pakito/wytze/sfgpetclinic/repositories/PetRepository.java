package pakito.wytze.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pakito.wytze.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
