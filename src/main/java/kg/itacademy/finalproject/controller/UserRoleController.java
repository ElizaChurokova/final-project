package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.entity.UserRole;
import kg.itacademy.finalproject.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping
    public UserRole save(@RequestBody UserRole userRole){
       return userRoleService.save(userRole);
    }
    @GetMapping
    public List<UserRole> findAll(){
        return userRoleService.findAll();
    }
}
