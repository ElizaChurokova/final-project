package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Labtest;
import kg.itacademy.finalproject.repository.LabtestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabtestServiceImpl implements LabtestService {
    @Autowired
    private LabtestRepo labtestRepo;
    @Override
    public Labtest save(Labtest labtest) {
        return labtestRepo.save(labtest);
    }

    @Override
    public Labtest findById(Long id) {
        return labtestRepo.findById(id).orElse(null);
    }
}
