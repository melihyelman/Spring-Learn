package com.melihyelman.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.melihyelman.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository  repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn Spring","melihyelman"));
        repository.insert(new Course(2,"Learn Java","melihyelman"));
        repository.deleteById(1);
    }
}
