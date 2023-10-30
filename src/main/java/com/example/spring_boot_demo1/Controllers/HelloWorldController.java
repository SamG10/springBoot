package com.example.spring_boot_demo1.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String helloWorld() {
        return "Hello world !";
    }
}
