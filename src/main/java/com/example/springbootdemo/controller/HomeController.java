package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    //@RequestMapping(value="/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Nazmul Anik");
        user.setEmailId("anik@gmail.com");
        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String name){
        return "The path variable is : "+id + " : "+name;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(name="email", required = false, defaultValue = "") String emailId){
        return "Your name is : "+name+" and email is : "+emailId;
    }
}
