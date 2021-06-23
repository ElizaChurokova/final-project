package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitutionType;
import kg.itacademy.finalproject.repository.MedInstitutionTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

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
}
