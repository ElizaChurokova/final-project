package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.DiseaseHistory;
import kg.itacademy.finalproject.model.DiseaseHistoryModel;

public interface DiseaseHistoryService {
    DiseaseHistory save(DiseaseHistory diseaseHistory);
   // DiseaseHistory save(DiseaseHistoryModel diseaseHistoryModel);
    DiseaseHistory findById(Long id);

}
