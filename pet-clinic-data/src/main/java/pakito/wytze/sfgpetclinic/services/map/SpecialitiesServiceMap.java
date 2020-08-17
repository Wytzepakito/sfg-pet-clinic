package pakito.wytze.sfgpetclinic.services.map;

import pakito.wytze.sfgpetclinic.model.Speciality;
import pakito.wytze.sfgpetclinic.services.SpecialitiesService;

import java.util.Set;

public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {

    }




}
