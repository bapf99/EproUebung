package de.thbingen.epro.controller;

import de.thbingen.epro.models.User;
import de.thbingen.epro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private ArrayList<User> users = new ArrayList<User>();

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

    @GetMapping(value = "/users/{firstname}")
    public List<User> getUserByFirstname(@PathVariable String firstname){
        return userRepository.findByFirstname(firstname);
    }

    @PostMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user) {
        //users.add(user);
        userRepository.save(user);
    }

    @DeleteMapping(value = "/deleteUser/{id}")
    public User deleteUser(@PathVariable int id) {
        return users.remove(id);
    }

}
