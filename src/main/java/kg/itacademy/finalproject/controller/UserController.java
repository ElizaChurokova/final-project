package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping("/get-name")
    public String getName(Principal principal){
        return principal.getName();
    }



}
