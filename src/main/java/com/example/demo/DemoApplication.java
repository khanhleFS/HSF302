package com.example.demo;

import dto.UserDTO;
import entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.service.UserService;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.addUser(new UserDTO("kahnh", "1234"));
    }
}
