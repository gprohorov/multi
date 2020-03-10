package pro.edu;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pro.edu.model.Person;

@Repository
public interface ImportPersonRepository extends MongoRepository<Person, String> {
}
