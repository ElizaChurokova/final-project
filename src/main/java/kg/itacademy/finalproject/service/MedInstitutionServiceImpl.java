package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.entity.MedInstitutionType;
import kg.itacademy.finalproject.model.MedInstitutionModel;
import kg.itacademy.finalproject.repository.MedInstitutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedInstitutionServiceImpl implements MedInstitutionService {
    @Autowired
    private MedInstitutionRepo medInstitutionRepo;
    @Autowired
    private MedInstitutionTypeService medInstitutionTypeService;
    @Override
    public MedInstitution save(MedInstitution medInstitution) {
        return medInstitutionRepo.save(medInstitution);
    }

    @Override
    public MedInstitution save(MedInstitutionModel medInstitutionModel) {
    MedInstitution medInstitution = new MedInstitution();
    medInstitution.setName(medInstitutionModel.getName());
    MedInstitutionType medInstitutionType = medInstitutionTypeService.findById(medInstitutionModel.getInstitutionTypeId());
        {
            if (medInstitutionType == null)
                throw new IllegalArgumentException("Тип медицинского учреждения с ID " + medInstitutionModel.getInstitutionTypeId() + " не существует.");
            medInstitution.setMedInstitutionType(medInstitutionType);
        }
    medInstitution.setAddress(medInstitutionModel.getAddress());
    medInstitution.setContactNumber(medInstitutionModel.getContactNumber());
        return medInstitutionRepo.save(medInstitution);
    }

    @Override
    public MedInstitution findById(Long id) {
        return medInstitutionRepo.findById(id).orElse(null);
    }

    @Override
    public List<MedInstitution> findAll() {
        System.out.println("Дайте список мед учреждений для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return medInstitutionRepo.findAll();
    }
}
