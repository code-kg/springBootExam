package kg.itacademy.exam.repository;

import kg.itacademy.exam.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
