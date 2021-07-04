package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitutionType;
import kg.itacademy.finalproject.repository.MedInstitutionTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedInstitutionTypeServiceImpl implements MedInstitutionTypeService {
    @Autowired
    private MedInstitutionTypeRepo medInstitutionTypeRepo;
    @Override
    public MedInstitutionType save(MedInstitutionType medInstitutionType) {
        return medInstitutionTypeRepo.save(medInstitutionType);
    }

    @Override
    public MedInstitutionType findById(Long id) {

        return medInstitutionTypeRepo.findById(id).orElse(null);
    }

    @Override
    public List<MedInstitutionType> findAll() {
        System.out.println("Дайте виды мед учреждений для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return medInstitutionTypeRepo.findAll();
    }
}
