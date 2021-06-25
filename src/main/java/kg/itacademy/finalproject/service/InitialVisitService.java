package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.InitialVisit;
import kg.itacademy.finalproject.model.InitialVisitModel;

public interface InitialVisitService {
//    DiseaseHistory save(DiseaseHistory diseaseHistory);
    InitialVisit save(InitialVisitModel initialVisitModel);
    InitialVisit findById(Long id);

}
