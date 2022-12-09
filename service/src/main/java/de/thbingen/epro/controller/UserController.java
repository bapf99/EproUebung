package de.thbingen.epro.controller;

import de.thbingen.epro.models.User;
import de.thbingen.epro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final ArrayList<User> users = new ArrayList<User>();

    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/users")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable int id){
        return users.get(id);
    }
    @GetMapping(value = "/users/{surname}")
    public List<User> getUserBySurname(@PathVariable String surname){
        return userRepository.findBySurname(surname);
    }

    @PostMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user) {
        //users.add(user);
        userRepository.save(user);
        System.out.println("success");
        System.out.println(user);
    }
    @DeleteMapping(value = "/deleteUser/{id}")
    public User deleteUser(@PathVariable int id) {
        return users.remove(id);
    }

}
