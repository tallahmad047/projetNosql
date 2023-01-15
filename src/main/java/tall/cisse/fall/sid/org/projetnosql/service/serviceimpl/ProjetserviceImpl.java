package tall.cisse.fall.sid.org.projetnosql.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tall.cisse.fall.sid.org.projetnosql.model.Projet;
import tall.cisse.fall.sid.org.projetnosql.repositories.ProjetRepository;
import tall.cisse.fall.sid.org.projetnosql.service.ProjetService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service
public class ProjetserviceImpl implements ProjetService {
    @Autowired
    ProjetRepository projetRepository;
    @Override
    public void createprojet(List<Projet> emp) {
        projetRepository.saveAll(emp);

    }

    @Override
    public Collection<Projet> getAll() {
        return projetRepository.findAll();
    }

    @Override
    public Optional<Projet> findprojetById(String id) {
        return projetRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        projetRepository.deleteById(id);

    }

    @Override
    public void update(Projet projet) {

    }

    @Override
    public void deleteAll() {

    }
}
