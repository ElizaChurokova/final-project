package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedCard;
import kg.itacademy.finalproject.model.MedCardModel;

import java.util.List;

public interface MedCardService {
    MedCard save(MedCardModel medCardModel);
    MedCard findById(Long id);
    List<MedCard> findAll();
    MedCard findByUser_Id(Long userId);
}
