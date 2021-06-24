package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.DiseaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface DiseaseHistoryRepo extends JpaRepository<DiseaseHistory, Long> {
}
