package kg.itacademy.exam.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "passWord", nullable = false)
    private Integer password;
    @OneToMany
    @JoinColumn(name = "movie", nullable = false)
    private Movie movie;
    @OneToMany
    @JoinColumn (name = "ticket", nullable = false)
    private Ticket ticket;
}
