package com.example.github.controller;

import com.example.github.service.EveningService;
import com.example.github.service.GreetingService;
import com.example.github.service.MorningService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;
    private final MorningService morningService;
    private final EveningService eveningService;

    public GreetingController(GreetingService greetingService, MorningService morningService,EveningService eveningService) {
        this.greetingService = greetingService;
        this.morningService = morningService;
        this.eveningService = eveningService;
    }
    @GetMapping("/hello")
    public String hello() {
        return greetingService.sayHello();
    }

    @GetMapping("/morning")
    public String morning() {
        return morningService.sayGoodMorning();
    }

    @GetMapping("/evening")
    public String evening() {
        return eveningService.sayGoodEvening();
    }
}
