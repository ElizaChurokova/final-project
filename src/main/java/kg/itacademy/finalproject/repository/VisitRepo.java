package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitRepo extends JpaRepository<Visit, Long> {
    List<Visit> findAllByMedCard_Id(Long medCardId);
}
