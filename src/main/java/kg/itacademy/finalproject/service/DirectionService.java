package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Direction;

public interface DirectionService {
    Direction save(Direction direction);
    Direction findById(Long id);

}
