package com.example.spring_boot_demo1.Services;

import com.example.spring_boot_demo1.Models.User;
import com.example.spring_boot_demo1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> find() {
        return userRepository.findAll();
    }

    public User findOne(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot find User with id: " + id));
    }
}
