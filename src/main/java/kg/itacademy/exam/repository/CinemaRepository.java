package kg.itacademy.exam.repository;

import kg.itacademy.exam.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository <Cinema, Long>{

}
