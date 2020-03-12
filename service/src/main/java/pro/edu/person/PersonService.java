package pro.edu.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.edu.PersonRepository;
import pro.edu.model.Person;
import pro.edu.ImportPersonRepository;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

 /*   */

    @Autowired
    ImportPersonRepository importRepository;




/*
    //   @PostConstruct
    void init(){
        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person("Ringo Star", 42),
                        new Person("George Harrison", 40)
                )
        );
        repository.saveAll(persons);
    }

*/

    public List<Person> getAll(){
    System.out.println("---------------Called straight------------------------");
        System.out.println(repository.findAll());
        return  repository.findAll();
    }

    public List<Person> getGarbage(){
        System.out.println("---------------Called   import------------------------");
        System.out.println(importRepository.findAll());
        return  importRepository.findAll();
    }

}

