package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.UserRole;
import kg.itacademy.finalproject.repository.UserRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepo userRoleRepo;
    @Autowired
    private UserService userService;
    @Override
    public UserRole save(UserRole userRole) {
        return userRoleRepo.save(userRole);
    }
/*
    @Override
    public UserRole save(UserRoleModel userRoleModel) {
        UserRole userRole = new UserRole();
        userRole.setRoleName(userRoleModel.getRoleName());
        User user = userService.findById(userRoleModel.getUserId());

        if(user == null) throw new IllegalArgumentException("Пользователь с ID " + userRoleModel.getUserId() + " не найден");
        userRole.setUser(user);
        return userRoleRepo.save(userRole);
    }
*/
    @Override
    public UserRole findById(Long id) {
        return userRoleRepo.findById(id).orElse(null);
    }

    @Override
    public List<UserRole> findAll() {
        System.out.println("Дайте ролей " + SecurityContextHolder.getContext().getAuthentication().getName());
        return userRoleRepo.findAll();
           }
}
