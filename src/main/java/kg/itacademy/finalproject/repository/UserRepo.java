package kg.itacademy.finalproject.repository;

import kg.itacademy.finalproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findUserByLogin(String login);
    List<User> findAllByStatus(Long status);
}
