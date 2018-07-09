package org.efrey.debugdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DebugDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DebugDockerApplication.class, args);
    }

    @RestController("/")
    public static class SimpleController {

        @GetMapping
        public String hello() {
            return "Hello world";
        }
    }
}
