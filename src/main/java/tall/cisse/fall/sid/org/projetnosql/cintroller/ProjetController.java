package tall.cisse.fall.sid.org.projetnosql.cintroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tall.cisse.fall.sid.org.projetnosql.model.Projet;
import tall.cisse.fall.sid.org.projetnosql.service.serviceimpl.ProjetserviceImpl;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/projet")
public class ProjetController {

    @Autowired
    @Qualifier(value = "projetserviceImpl")

   private   ProjetserviceImpl service ;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());



    /**
     * Method to fetch all users from the db.
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<Projet> getAll() {
        System.out.println("-------> : getAllUsers");
        logger.debug("Getting all users.");
        return service.getAll();
    }
    /**
     * Method to fetch user by id.
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Projet> getById(@PathVariable(value= "id") String id) {
        logger.debug("Getting projets with projet-id= {}.", id);
        return service.findprojetById(id);
    }
}
