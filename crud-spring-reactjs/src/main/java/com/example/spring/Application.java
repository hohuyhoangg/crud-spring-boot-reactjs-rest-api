package com.example.spring;

import com.example.spring.model.User;
import com.example.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Ho","Huy","hoangho1147@gmail.com"));
        this.userRepository.save(new User("Ho1","Huy1","hoangho11471@gmail.com"));
        this.userRepository.save(new User("Ho2","Huy2","hoangho11472@gmail.com"));
        this.userRepository.save(new User("Ho3","Huy3","hoangho11473@gmail.com"));
    }
}

