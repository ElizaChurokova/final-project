package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Allergy;
import kg.itacademy.finalproject.repository.AllergyRepo;

public interface AllergyService {
    Allergy save(Allergy allergy);
    Allergy findById(Long id);
}
