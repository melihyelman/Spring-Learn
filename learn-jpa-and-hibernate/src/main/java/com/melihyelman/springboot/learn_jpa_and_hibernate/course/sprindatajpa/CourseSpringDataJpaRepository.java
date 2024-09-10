package com.melihyelman.springboot.learn_jpa_and_hibernate.course.sprindatajpa;

import com.melihyelman.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
