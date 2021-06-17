package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Direction;
import kg.itacademy.finalproject.repository.DirectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectionServiceImpl implements DirectionService {
   @Autowired
   private DirectionRepo directionRepo;
    @Override
    public Direction save(Direction direction) {
        return directionRepo.save(direction);
    }

    @Override
    public Direction findById(Long id) {
        return directionRepo.findById(id).orElse(null);
    }


}
