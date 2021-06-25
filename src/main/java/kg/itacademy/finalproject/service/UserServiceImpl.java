package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.entity.UserRole;
import kg.itacademy.finalproject.model.UserCreateModel;
import kg.itacademy.finalproject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(UserCreateModel userCreateModel) {
        User user = new User();
        user.setLogin(userCreateModel.getLogin());
        user.setPassword(passwordEncoder.encode(userCreateModel.getPassword()));
        user.setStatus(userCreateModel.getStatus());
        user.setFullName(userCreateModel.getFullName());
        UserRole userRole = userRoleService.findById(userCreateModel.getUserRoleId());
        {
            if(userRole == null)
                throw new IllegalArgumentException("User Role  с ID " + userCreateModel.getUserRoleId() + " не сушествует");
                user.setUserRole(userRole);
        }

        return userRepo.save(user);
    }

    @Override
    public User findById(Long id) {

        return userRepo.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        System.out.println("Дайте пациентов для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return userRepo.findAll();
    }
}
