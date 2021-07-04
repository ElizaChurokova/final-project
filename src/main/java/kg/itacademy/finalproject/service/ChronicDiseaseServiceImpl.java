package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.ChronicDisease;
import kg.itacademy.finalproject.repository.ChronicDiseaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChronicDiseaseServiceImpl implements ChronicDiseaseService {
    @Autowired
    private ChronicDiseaseRepo chronicDiseaseRepo;
    @Override
    public ChronicDisease save(ChronicDisease chronicDisease) {
        return chronicDiseaseRepo.save(chronicDisease);
    }

    @Override
    public ChronicDisease findById(Long id) {
        return chronicDiseaseRepo.findById(id).orElse(null);
    }

    @Override
    public List<ChronicDisease> findAll() {
        System.out.println("Дайте список существующих хронических болезней " + SecurityContextHolder.getContext().getAuthentication().getName());
        return chronicDiseaseRepo.findAll();
    }
}
