package kg.itacademy.finalproject.controller;

import kg.itacademy.finalproject.entity.UserRole;
import kg.itacademy.finalproject.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping
    public UserRole save(@RequestBody UserRole userRole){
       return userRoleService.save(userRole);
    }
}
