package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergyRepo extends JpaRepository<Allergy, Long> {
}
