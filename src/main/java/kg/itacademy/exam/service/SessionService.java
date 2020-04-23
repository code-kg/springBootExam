package kg.itacademy.exam.service;

import kg.itacademy.exam.entity.Cinema;
import kg.itacademy.exam.entity.Movie;
import kg.itacademy.exam.entity.Session;

import java.time.LocalDateTime;

public interface SessionService {
    Session create(Session session);
    Session getCinemaBySession(Session cinema);
    Session getSessionByDateAndTimeOfOrderByCinema(LocalDateTime dateAndTimeOfMovie);
    Session getSessionByMovie(Session movie);
}
