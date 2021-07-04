package kg.itacademy.finalproject.service;

import kg.itacademy.finalproject.entity.Direction;
import kg.itacademy.finalproject.repository.DirectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Direction> findAll() {
        System.out.println("Дайте список направлений для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return directionRepo.findAll();
    }


}
