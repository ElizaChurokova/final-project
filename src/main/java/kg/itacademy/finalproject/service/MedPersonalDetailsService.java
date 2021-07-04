package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedInstitution;
import kg.itacademy.finalproject.entity.MedPersonalDetails;
import kg.itacademy.finalproject.model.MedPersonalDetailsModel;

import java.util.List;

public interface MedPersonalDetailsService {
    MedPersonalDetails save(MedPersonalDetailsModel medPersonalDetailsModel);
    MedPersonalDetails findByMedPersonalDetailsId(Long id);
    List<MedPersonalDetails> findAll();




}
