package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Labtest;

import java.util.List;

public interface LabtestService {
    Labtest save(Labtest labtest);
    Labtest findById(Long id);
    List<Labtest> findAll();
}
