package com.brotech.SpringSecurity;

import com.brotech.SpringSecurity.domain.Role;
import com.brotech.SpringSecurity.domain.User;
import com.brotech.SpringSecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	//@Bean
	/*CommandLineRunner run(UserService userService){

		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"steven","stefanstab","123",new ArrayList<>()));
			userService.saveUser(new User(null,"welly","jones","123",new ArrayList<>()));
			userService.saveUser(new User(null,"mark","Tim","123",new ArrayList<>()));
			userService.saveUser(new User(null,"Tobi","Ines","123",new ArrayList<>()));

			userService.addRoleToUser("stefanstab","ROLE_USER");
			userService.addRoleToUser("jones","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Ines","ROLE_ADMIN");
			userService.addRoleToUser("Tim","ROLE_MANAGER");
			userService.addRoleToUser("stefanstab","ROLE_SUPER_ADMIN");
		};
	}*/

}
