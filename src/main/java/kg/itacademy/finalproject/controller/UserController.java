package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.model.UserCreateModel;
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
    @GetMapping("/find-all")
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
    @PostMapping
    public User save(@RequestBody UserCreateModel userCreateModel){
        return userService.save(userCreateModel);
    }
    @GetMapping("/find/{login}")
    public User findByLogin(@PathVariable String login){
        return userService.findByLogin(login);
    }
    @GetMapping("/ban/{id}")
    public User banById(@PathVariable Long id) {return userService.banById(id);}
    @GetMapping("/unban/{id}")
    public User unbanById(@PathVariable Long id) {return userService.unbanById(id);}
    @GetMapping("get-status/{status}")
    public List<User> findAllByStatus(Long status){return userService.findAllByStatus(status);}



}
