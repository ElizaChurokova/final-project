package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.Labtest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabtestRepo extends JpaRepository<Labtest, Long> {
}
