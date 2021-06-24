package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.entity.MedPersonalDetails;
import kg.itacademy.finalproject.repository.MedPersonalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedPersonalDetailsServiceImpl implements MedPersonalDetailsService {
    @Autowired
    private MedPersonalDetailsRepo medPersonalDetailsRepo;
    @Override
    public MedPersonalDetails save(MedPersonalDetails medPersonalDetails) {
        return medPersonalDetailsRepo.save(medPersonalDetails);
    }

    @Override
    public MedPersonalDetails findByMedPersonalDetailsOneId(Long id) {
        return medPersonalDetailsRepo.findById(id).orElse(null);
    }

}
