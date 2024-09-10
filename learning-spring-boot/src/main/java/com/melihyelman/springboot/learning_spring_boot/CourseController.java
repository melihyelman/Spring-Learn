package com.melihyelman.springboot.learning_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // /courses
    // Course: id,name,author

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1,"Learn AWS","melihyelman"),
                new Course(2,"Learn Spring","melihyelman"),
                new Course(3,"Learn React","melihyelman")
        );
    }
}
