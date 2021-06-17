package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.VisitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitTypeRepo extends JpaRepository<VisitType, Long> {
}
