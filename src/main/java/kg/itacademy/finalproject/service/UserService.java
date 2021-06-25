package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.model.UserCreateModel;

import java.util.List;

public interface UserService {
User save(UserCreateModel userCreateModel);
User findById(Long id);
List<User> findAll();

}
