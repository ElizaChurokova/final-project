package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.BloodGroup;

public interface BloodGroupService {
    BloodGroup save(BloodGroup bloodGroup);
    BloodGroup findById(Long id);
}
