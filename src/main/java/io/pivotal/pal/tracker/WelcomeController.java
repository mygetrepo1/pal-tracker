package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    String WELCOME_Message ;


    public WelcomeController(@Value("${welcome.message}") String message) {
        this.WELCOME_Message = message;
    }

    @GetMapping("/")
    public String sayHello() {

        return WELCOME_Message;
    }
}
