package br.com.springboot.controllers;

import java.util.*;

import br.com.springboot.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.springboot.model.User;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> user(@PathVariable("id") Long id) {
        return this.userRepository.findById(id);
    }

    @PostMapping("/")
    public User user(@RequestBody User user) {
       return this.userRepository.save(user);
    }

    @GetMapping("/list")
    public List<User> list() {
        return this.userRepository.findAll();
    }

    @GetMapping("/list{id}")
    public List<User> listMoreThan(@PathVariable("id") Long id) {
        return this.userRepository.findByGreaterThan(id);
    }

    @GetMapping("/findByName{name}")
    public List<User> findByName(@PathVariable("name") String name) {
        return this.userRepository.findByNameIgnoreCase(name);
    }
}
