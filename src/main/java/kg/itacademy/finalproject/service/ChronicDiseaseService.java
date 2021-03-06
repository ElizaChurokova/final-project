package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.ChronicDisease;
import kg.itacademy.finalproject.repository.ChronicDiseaseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ChronicDiseaseService {
    ChronicDisease save(ChronicDisease chronicDisease);
    ChronicDisease findById(Long id);
    List<ChronicDisease> findAll();

}
