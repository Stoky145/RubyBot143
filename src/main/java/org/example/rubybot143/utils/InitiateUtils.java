package org.example.rubybot143.utils;

import org.example.rubybot143.entities.UsersEntity;
import org.example.rubybot143.repositories.UsersRepository;
import org.example.rubybot143.services.UsersService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitiateUtils implements CommandLineRunner {

    private final UsersService usersService;

    public InitiateUtils(UsersService usersService){
        this.usersService = usersService;
    }
    @Override
    public void run(String... args) throws Exception{
        System.out.println("run");



        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setFirstName("Bob");
        usersEntity.setLastName("Koler");
        usersEntity.setEmail("bob555@yandex.ru");

        UsersEntity usersEntity1 = new UsersEntity();
        usersEntity1.setFirstName("Jec");
        usersEntity1.setLastName("Hope");
        usersEntity1.setEmail("Hope565@mail.ru");

        usersService.save(usersEntity);
        usersService.save(usersEntity1);

        List<UsersEntity> all = usersService.getAll();

        for (UsersEntity entity : all){
            System.out.println(entity);
        }
    }
}
