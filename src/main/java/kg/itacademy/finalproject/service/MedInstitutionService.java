package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.model.MedInstitutionModel;

import java.util.List;

public interface MedInstitutionService {
    MedInstitution save(MedInstitution medInstitution);
    MedInstitution save(MedInstitutionModel medInstitutionModel);
    MedInstitution findById(Long id);
    List<MedInstitution> findAll();


}
