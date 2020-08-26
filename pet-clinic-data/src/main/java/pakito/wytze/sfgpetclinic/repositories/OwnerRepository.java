package pakito.wytze.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pakito.wytze.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastname);
}
