package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitutionType;

import java.util.List;

public interface MedInstitutionTypeService {
    MedInstitutionType save(MedInstitutionType medInstitutionType);
    MedInstitutionType findById(Long id);
    List<MedInstitutionType> findAll();
}
