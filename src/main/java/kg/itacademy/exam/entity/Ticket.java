package kg.itacademy.exam.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "seat_place_number", nullable = false)
    private Integer seatPlaceNumber;
    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "soldOrNot")
    private Boolean sold;

}
