package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.BloodGroup;
import kg.itacademy.finalproject.repository.BloodGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodGroupServiceImpl implements BloodGroupService {
    @Autowired
    private BloodGroupRepo bloodGroupRepo;
    @Override
    public BloodGroup save(BloodGroup bloodGroup) {
        return bloodGroupRepo.save(bloodGroup);
    }

    @Override
    public BloodGroup findById(Long id) {
        return bloodGroupRepo.findById(id).orElse(null);
    }
}
