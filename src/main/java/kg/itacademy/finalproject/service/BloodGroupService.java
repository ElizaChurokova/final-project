package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.BloodGroup;

import java.util.List;

public interface BloodGroupService {
    BloodGroup save(BloodGroup bloodGroup);
    BloodGroup findById(Long id);
    List<BloodGroup> findAll();
}
