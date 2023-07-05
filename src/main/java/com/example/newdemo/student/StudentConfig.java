package com.example.newdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student yusuf = new Student(
                    "Yusuf",
                    "ysf2000kksl@gmail.com",
                    LocalDate.of(2000, MAY, 28)
            );

            Student ali = new Student(
                    "Ali",
                    "ali2005kksl@gmail.com",
                    LocalDate.of(2005, MAY, 28)
            );

            repository.saveAll(
                    List.of(yusuf, ali)
            );

        };
    }
}
