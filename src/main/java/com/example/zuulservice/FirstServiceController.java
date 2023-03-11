package com.example.zuulservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/first-service")
public class FirstServiceController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the First service.";
    }

    @PostMapping("/ajax")
    public String ajax(){
        return "11111";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info(header);
        return "Hello World in First Service";
    }

    @GetMapping("/check")
    public String check(){
        return "Hi, There. This is a message from First Service.";
    }
}
