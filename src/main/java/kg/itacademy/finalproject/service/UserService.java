package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.User;
import kg.itacademy.finalproject.model.AuthModel;
import kg.itacademy.finalproject.model.UserCreateModel;

import java.util.List;

public interface UserService {
User save(UserCreateModel userCreateModel);
User findById(Long id);
List<User> findAll();
User findByLogin(String login);
String getTokenByAuthModel(AuthModel authModel);
User banById(Long id);
User unbanById(Long id);
List<User> findAllByStatus(Long status);
}
