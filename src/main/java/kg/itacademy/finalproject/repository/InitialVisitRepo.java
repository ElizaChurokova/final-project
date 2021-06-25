package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.InitialVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InitialVisitRepo extends JpaRepository<InitialVisit, Long> {
}
