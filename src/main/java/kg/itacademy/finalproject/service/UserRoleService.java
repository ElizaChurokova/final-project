package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.UserRole;

import java.util.List;

public interface UserRoleService {
     UserRole save(UserRole userRole);
     UserRole findById(Long id);
     List<UserRole> findAll();
}
