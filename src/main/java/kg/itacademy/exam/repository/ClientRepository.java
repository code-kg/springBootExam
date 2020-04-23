package kg.itacademy.exam.repository;

import kg.itacademy.exam.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
