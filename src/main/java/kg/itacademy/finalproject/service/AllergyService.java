package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Allergy;
import kg.itacademy.finalproject.repository.AllergyRepo;

import java.util.List;

public interface AllergyService {
    Allergy save(Allergy allergy);
    Allergy findById(Long id);
    List<Allergy> findAll();
}
