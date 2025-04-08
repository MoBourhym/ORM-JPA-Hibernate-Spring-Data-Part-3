package com.spring.Roles;

import com.spring.Roles.entities.Role;
import com.spring.Roles.entities.User;
import com.spring.Roles.repositories.UserRepository;
import com.spring.Roles.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class RolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RolesApplication.class, args);
	}


	@Bean
	CommandLineRunner start( UserService userService) {
		return (args) -> {
			User u1 = new User();
			u1.setUsername("admin");
			u1.setPassword("admin");
			userService.addNewUser(u1);

			User u2 = new User();
			u2.setUsername("user1");
			u2.setPassword("user1");
			userService.addNewUser(u2);


			Stream.of("STUDENT", "TEACHER", "ADMIN", "USER").forEach(r -> {
				Role r1 = new Role();
				r1.setRoleName(r);
				userService.addNewRole(r1);

			});


			userService.addRoleToUser("user1", "STUDENT");
			userService.addRoleToUser("user1", "USER");

			userService.addRoleToUser("user1", "USER");
			userService.addRoleToUser("user1", "ADMIN");

		};
	}
}
