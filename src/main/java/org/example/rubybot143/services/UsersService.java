package org.example.rubybot143.services;

import org.apache.catalina.User;
import org.example.rubybot143.entities.UsersEntity;
import org.example.rubybot143.repositories.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
   private final UsersRepository usersRepository;
   public UsersService(UsersRepository usersRepository){
      this.usersRepository = usersRepository;
   }

   public void save(UsersEntity usersEntity){
      usersRepository.save(usersEntity);
   }
   public List<UsersEntity> getAll(){
      return usersRepository.findAll();
   }
}
