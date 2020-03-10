package pro.edu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.edu.model.Person;
import pro.edu.person.PersonService;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService service;
/*

    @RequestMapping("/api/person/list")
    public List<Person> getAll() {
        return service.getAll();
    }
*/

    @RequestMapping("/api/garbage/list")
    public List<Person> getTrash() {
        return service.getGarbage();
    }
}
