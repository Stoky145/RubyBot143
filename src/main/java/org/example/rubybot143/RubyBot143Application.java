package org.example.rubybot143;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class RubyBot143Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RubyBot143Application.class);
        UsersRepository repository = context.getBean(UsersRepository.class);

        repository.save(new Users("Jeck", "Killed", "JeckKill@yandex.ru"));
        repository.save(new Users("Bob", "Hegrod", "bob543@mail.ru"));
        repository.save(new Users("Bill", "Novikov", "NovikBil@yandex.ru"));

    }

}
