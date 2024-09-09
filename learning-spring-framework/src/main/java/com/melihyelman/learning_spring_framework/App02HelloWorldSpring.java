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
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person4Parameters"));

    }
}
