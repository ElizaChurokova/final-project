package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.AdditionalVisit;
import kg.itacademy.finalproject.model.AdditionalVisitModel;

public interface AdditionalVisitService {
    AdditionalVisit save(AdditionalVisitModel additionalVisitModel);
    AdditionalVisit findById(Long id);
}
