package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Vaccine;

public interface VaccineService {
    Vaccine save(Vaccine vaccine);
    Vaccine findById(Long id);
}
