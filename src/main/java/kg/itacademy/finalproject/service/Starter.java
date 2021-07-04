package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.model.UserCreateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleService userRoleService;
    @Override
    public void run(String... args) throws Exception {
//        UserCreateModel admin = new UserCreateModel();
//        admin.setLogin("admin");
//        admin.setPassword("admin");
//        admin.setFullName("Admin Adminov");
//        admin.setUserRoleId(1L);
//        admin.setStatus(1);
//        userService.save(admin);

    }
}
