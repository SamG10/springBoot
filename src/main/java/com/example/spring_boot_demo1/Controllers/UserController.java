package com.example.spring_boot_demo1.Controllers;

import com.example.spring_boot_demo1.Models.User;
import com.example.spring_boot_demo1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/users")
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping(path = "users")
    public ResponseEntity<List<User>> find() {
        return ResponseEntity.ok().body(userService.find());
    }

    @GetMapping(path = "/users/{id}")
    public ResponseEntity<User> findOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(userService.findOne(id));
    }
}
