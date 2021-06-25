package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.MedCard;
import kg.itacademy.finalproject.model.MedCardModel;

public interface MedCardService {
    MedCard save(MedCardModel medCardModel);
    MedCard findById(Long id);
}
