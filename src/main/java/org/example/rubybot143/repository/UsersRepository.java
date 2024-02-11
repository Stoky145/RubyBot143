package org.example.rubybot143.repository;

import org.example.rubybot143.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
