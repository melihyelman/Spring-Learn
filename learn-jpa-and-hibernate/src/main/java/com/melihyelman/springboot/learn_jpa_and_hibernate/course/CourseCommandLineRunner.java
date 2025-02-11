package com.melihyelman.springboot.learn_jpa_and_hibernate.course;

import com.melihyelman.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.melihyelman.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.melihyelman.springboot.learn_jpa_and_hibernate.course.sprindatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;
//
//    @Autowired
//    private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn Spring1","melihyelman"));
        repository.save(new Course(2,"Learn Java2","melihyelman"));
        repository.save(new Course(2,"Learn Java2","steel"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("steel"));
    }
}
