package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Visit;
import kg.itacademy.finalproject.model.VisitModel;

import java.util.List;

public interface VisitService {
    Visit save(VisitModel visitModel);
    Visit findById(Long id);
    List<Visit>findAll();

}
