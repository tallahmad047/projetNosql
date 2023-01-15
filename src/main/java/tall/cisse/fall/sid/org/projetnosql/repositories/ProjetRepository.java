package tall.cisse.fall.sid.org.projetnosql.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tall.cisse.fall.sid.org.projetnosql.model.Projet;
@Repository
public interface ProjetRepository extends MongoRepository<Projet, String> {
}
