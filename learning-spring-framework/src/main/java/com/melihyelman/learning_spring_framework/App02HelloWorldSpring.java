package com.melihyelman.learning_spring_framework;

import com.melihyelman.learning_spring_framework.game.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1- launch a spring context
        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2- Configure the thing that we want spring to manage - @Configuration
        // HelloWorldConfiguration
        // name -@Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));

    }
}
