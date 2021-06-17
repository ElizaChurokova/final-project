package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepo extends JpaRepository<Vaccine, Long> {
}
