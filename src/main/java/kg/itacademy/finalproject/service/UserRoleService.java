package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.UserRole;
import kg.itacademy.finalproject.model.UserRoleModel;

import javax.jws.soap.SOAPBinding;

public interface UserRoleService {
     UserRole save(UserRole userRole);
   //  UserRole save(UserRoleModel userRoleModel);
     UserRole findById(Long id);
}
