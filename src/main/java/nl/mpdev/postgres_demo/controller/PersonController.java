package nl.mpdev.postgres_demo.controller;

import nl.mpdev.postgres_demo.model.Person;
import nl.mpdev.postgres_demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  @Autowired
  PersonRepository personRepository;

  @PostMapping("/addPerson")
  public void addPerson(@RequestBody Person person) {
    personRepository.save(person);
  }

  @GetMapping("/person")
  public ResponseEntity getAllPersons() {
    return ResponseEntity.ok(personRepository.findAll());
  }

}
