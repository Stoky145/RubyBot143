package org.example.rubybot143;

import org.example.rubybot143.entities.UsersEntity;
import org.example.rubybot143.repositories.UsersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
public class RubyBot143Application {

    public static void main(String[] args) {
        SpringApplication.run(RubyBot143Application.class, args);

    }

}
