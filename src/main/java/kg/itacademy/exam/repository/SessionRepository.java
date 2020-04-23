package kg.itacademy.exam.repository;

import kg.itacademy.exam.entity.Cinema;
import kg.itacademy.exam.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
