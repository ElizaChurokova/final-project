package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.MedInstitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedInstitutionRepo extends JpaRepository<MedInstitution, Long> {
}
