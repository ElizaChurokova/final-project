package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.entity.MedPersonalDetails;

import java.util.List;

public interface MedPersonalDetailsService {
    MedPersonalDetails save(MedPersonalDetails medPersonalDetails);
    List<MedInstitution> findByMedPersonalDetailsOneId(Long id);
    List<MedInstitution> findByMedPersonalDetailsTwoId(Long id);


}
