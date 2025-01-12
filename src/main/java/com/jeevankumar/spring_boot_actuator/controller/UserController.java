package com.jeevankumar.spring_boot_actuator.controller;

import com.jeevankumar.spring_boot_actuator.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor
public class UserController {
    private final User user;

    @GetMapping(value = "/getUser")
    public User getAllUsers(){
        return user;
    }
}
