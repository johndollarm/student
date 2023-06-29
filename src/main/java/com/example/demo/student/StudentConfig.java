package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student john = new Student(
                    "John",
                    "john.dollar@gmail.com",
                    LocalDate.of(1996, Month.NOVEMBER, 27)
            );
            Student treesa = new Student(
                    "Treesa",
                    "Treesa@gmail.com",
                    LocalDate.of(1995, Month.JUNE, 16)
            );
            repository.saveAll(List.of(john,treesa));
        };
    }
}
