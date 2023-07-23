package com.javatechie.javajenkinscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaJenkinsCicdApplication {

    @GetMapping("/")
    public String welcome() {
        return "Welcoem to Stone's website";
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaJenkinsCicdApplication.class, args);
    }

}
