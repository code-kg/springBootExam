package kg.itacademy.exam.controller;

import kg.itacademy.exam.entity.Session;
import kg.itacademy.exam.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping
    public Session create(@RequestBody Session session){
        return sessionService.create(session);
    }

    @GetMapping("/{id}")
    public Session getCinemaBySession(@PathVariable Session cinema){
        return sessionService.getCinemaBySession(cinema);
    }
}
