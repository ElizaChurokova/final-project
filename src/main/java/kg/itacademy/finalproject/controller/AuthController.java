package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.model.UserCreateModel;
import kg.itacademy.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody UserCreateModel userCreateModel){
        return userService.save(userCreateModel);
    }
}
