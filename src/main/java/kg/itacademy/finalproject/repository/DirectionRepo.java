package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionRepo extends JpaRepository<Direction, Long> {
}
