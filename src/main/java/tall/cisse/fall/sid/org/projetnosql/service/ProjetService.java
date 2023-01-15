package tall.cisse.fall.sid.org.projetnosql.service;

import org.springframework.stereotype.Service;
import tall.cisse.fall.sid.org.projetnosql.model.Projet;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service

public interface ProjetService {
    public void createprojet(List<Projet> emp);


    public Collection<Projet> getAll();


    public Optional<Projet> findprojetById(String id);


    public void deleteById(String id);


    public void update(Projet projet);


    public void deleteAll();
}
