package com.melihyelman.learning_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA {};

@Component
@Lazy
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Initialization logic: " + classA);
        this.classA = classA;
    }
    public void doSomething() {
        System.out.println("do something " );
    }
};

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            System.out.println("Initialization completed ");
            context.getBean(ClassB.class);
        }

    }
}
