package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Labtest;

public interface LabtestService {
    Labtest save(Labtest labtest);
    Labtest findById(Long id);
}
