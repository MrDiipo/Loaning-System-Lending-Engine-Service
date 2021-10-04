package com.mrdiipo.profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoaningAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LoaningAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
