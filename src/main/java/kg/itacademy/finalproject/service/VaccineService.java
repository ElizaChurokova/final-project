package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Vaccine;

import java.util.List;

public interface VaccineService {
    Vaccine save(Vaccine vaccine);
    Vaccine findById(Long id);
    List<Vaccine> findAll();
}
