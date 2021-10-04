package com.mrdiipo.lending_engine;

import com.mrdiipo.lending_engine.domain.repository.UserRepository;
import com.mrdiipo.lending_engine.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoaningAppApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(LoaningAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("1L", "John", "B", 27, "Software Developer"));
        userRepository.save(new User("2L", "Peter", "C", 21, "Pilot"));
    }
}
