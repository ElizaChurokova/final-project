package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.ChronicDisease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChronicDiseaseRepo extends JpaRepository<ChronicDisease, Long> {
}
