package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.VisitType;

public interface VisitTypeService {
    VisitType save(VisitType visitType);
    VisitType findById(Long id);
}
