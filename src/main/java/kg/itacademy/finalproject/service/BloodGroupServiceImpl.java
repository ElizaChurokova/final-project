package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.BloodGroup;
import kg.itacademy.finalproject.repository.BloodGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<BloodGroup> findAll() {
        System.out.println("Дайте список существующих групп крови для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return bloodGroupRepo.findAll();
    }
}
