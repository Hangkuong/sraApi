package com.chinchin.sra.Configurations;

import com.chinchin.sra.Models.Student;
import com.chinchin.sra.Repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//           Student Chin = new Student("Chin", "chinchin@gmail.com", LocalDate.of(2001, 3, 23));
//           Student Chan = new Student("Chan", "chanchan@gmail.com", LocalDate.of(2001, 11, 28));
//           repository.saveAll(List.of(Chin, Chan));
//        };
//    }
}
