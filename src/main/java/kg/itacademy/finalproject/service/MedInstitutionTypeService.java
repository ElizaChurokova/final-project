package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitutionType;

public interface MedInstitutionTypeService {
    MedInstitutionType save(MedInstitutionType medInstitutionType);
    MedInstitutionType findById(Long id);
}
