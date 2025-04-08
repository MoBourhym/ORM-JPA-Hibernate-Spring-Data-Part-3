package com.spring.Roles.repositories;

import com.spring.Roles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);

}
