package com.melihyelman.learning_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name () {
        return "Hello World";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        return new Person("Melihyelman", 23,new Address("avcilar", "istanbul"));
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("kadikoy", "istanbul");
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name,age, address2);
    }
}
