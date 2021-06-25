package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.UserRole;

public interface UserRoleService {
     UserRole save(UserRole userRole);
   //  UserRole save(UserRoleModel userRoleModel);
     UserRole findById(Long id);
}
