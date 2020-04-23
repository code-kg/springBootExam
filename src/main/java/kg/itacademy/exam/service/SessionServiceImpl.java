package kg.itacademy.exam.service;

import kg.itacademy.exam.entity.Cinema;
import kg.itacademy.exam.entity.Movie;
import kg.itacademy.exam.entity.Session;
import kg.itacademy.exam.repository.CinemaRepository;
import kg.itacademy.exam.repository.MovieRepository;
import kg.itacademy.exam.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;
    private CinemaRepository cinemaRepository;
    private MovieRepository movieRepository;
    @Override
    public Session create(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public Session getCinemaBySession(Session cinema) {
        return sessionRepository.save(cinema);
    }

    @Override
    public Session getSessionByDateAndTimeOfOrderByCinema(LocalDateTime dateAndTimeOfMovie) {
        return null;
    }

    @Override
    public Session getSessionByMovie(Session movie) {
        return sessionRepository.save(movie);
    }
}
