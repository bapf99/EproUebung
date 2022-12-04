package de.thbingen.epro.controller;

import de.thbingen.epro.models.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    private ArrayList<User> users = new ArrayList<User>();

    @GetMapping(value = "/users")
    public ArrayList<User> getAllUsers(){
        return users;
    }

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable int id){
        return users.get(id);
    }

    @PostMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public int addUser(@RequestBody User user) {
        users.add(user);
        return users.indexOf(user);
    }

    @DeleteMapping(value = "/deleteUser/{id}")
    public User deleteUser(@PathVariable int id) {
        return users.remove(id);
    }

}
