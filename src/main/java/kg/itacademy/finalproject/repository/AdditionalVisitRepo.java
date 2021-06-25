package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.AdditionalVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalVisitRepo extends JpaRepository<AdditionalVisit, Long> {
}
