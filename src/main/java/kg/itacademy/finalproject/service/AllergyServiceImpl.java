package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Allergy;
import kg.itacademy.finalproject.repository.AllergyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllergyServiceImpl implements AllergyService {
    @Autowired
    private AllergyRepo allergyRepo;
    @Override
    public Allergy save(Allergy allergy) {
        return allergyRepo.save(allergy);
    }

    @Override
    public Allergy findById(Long id) {
        return allergyRepo.findById(id).orElse(null);
    }

    @Override
    public List<Allergy> findAll() {
        System.out.println("Дайте список аллергий для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return allergyRepo.findAll();
    }
}
