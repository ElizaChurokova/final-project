package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepo extends JpaRepository<Visit, Long> {
}
