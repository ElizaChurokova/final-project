package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Visit;
import kg.itacademy.finalproject.model.VisitModel;

public interface VisitService {
//    DiseaseHistory save(DiseaseHistory diseaseHistory);
    Visit save(VisitModel visitModel);
    Visit findById(Long id);

}
