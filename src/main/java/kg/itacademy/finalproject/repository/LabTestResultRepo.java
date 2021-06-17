package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.LabTestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabTestResultRepo extends JpaRepository<LabTestResult, Long> {
}
