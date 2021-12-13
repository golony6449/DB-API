package dev.golony.dbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DbApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbApiApplication.class, args);
    }
}
