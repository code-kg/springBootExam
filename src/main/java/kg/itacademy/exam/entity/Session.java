package kg.itacademy.exam.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "3D")
    private Boolean is3d;
    private LocalDateTime dateAndTimeOfMovie;
    @ManyToMany
    @JoinColumn(name = "movie")
    private Movie movie;
    @ManyToOne
    @JoinColumn(name = "cinema")
    private Cinema cinema;
}
