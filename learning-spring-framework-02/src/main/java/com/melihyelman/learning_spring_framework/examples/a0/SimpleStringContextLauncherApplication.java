package com.melihyelman.learning_spring_framework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class BusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2;

//    @Autowired
//    public BusinessClass(Dependency2 dependency2, Dependency1 dependency1) {
//        this.dependency2 = dependency2;
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
};

@Component
class Dependency1 {};

@Component
class Dependency2 {};

@Configuration
@ComponentScan
public class SimpleStringContextLauncherApplication {

    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(SimpleStringContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));
        }

    }
}
