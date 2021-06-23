package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.MedPersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedPersonalDetailsRepo extends JpaRepository<MedPersonalDetails, Long> {
}
