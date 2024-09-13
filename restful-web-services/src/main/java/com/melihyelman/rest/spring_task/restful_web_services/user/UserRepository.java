package com.melihyelman.rest.spring_task.restful_web_services.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String username);
}
