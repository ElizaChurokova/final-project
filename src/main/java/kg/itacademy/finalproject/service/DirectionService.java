package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Direction;

import java.util.List;

public interface DirectionService {
    Direction save(Direction direction);
    Direction findById(Long id);
    List<Direction> findAll();

}
