package com.example.github.controller;

import com.example.github.service.AfternoonService;
import com.example.github.service.GreetingService;
import com.example.github.service.MorningService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;
    private final MorningService morningService;
    private final AfternoonService afternoonService;

    public GreetingController(GreetingService greetingService, MorningService morningService, AfternoonService afternoonService) {
        this.greetingService = greetingService;
        this.morningService = morningService;
        this.afternoonService = afternoonService;
    }
    @GetMapping("/hello")
    public String hello() {
        return greetingService.sayHello();
    }

    @GetMapping("/morning")
    public String morning() {
        return morningService.sayGoodMorning();
    }

    @GetMapping("/afternoon")
    public String afternoon() {
        return afternoonService.sayGoodAfternoon();
    }
}
