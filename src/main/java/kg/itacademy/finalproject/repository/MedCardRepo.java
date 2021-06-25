package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.MedCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedCardRepo extends JpaRepository<MedCard, Long> {
}
