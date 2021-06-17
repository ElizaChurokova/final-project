package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.MedInstitutionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface MedInstitutionTypeRepo extends JpaRepository<MedInstitutionType, Long> {
}
