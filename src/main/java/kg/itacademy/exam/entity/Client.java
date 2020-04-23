package kg.itacademy.exam.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "client_age")
    private Integer clientAge;
    @OneToMany
    @JoinColumn(name = "movie")
    private Movie movie;
    @ManyToOne
    @JoinColumn(name = "ticket")
    private Ticket ticket;
}
