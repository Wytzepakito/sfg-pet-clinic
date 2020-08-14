package pakito.wytze.sfgpetclinic.services;

import pakito.wytze.sfgpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
