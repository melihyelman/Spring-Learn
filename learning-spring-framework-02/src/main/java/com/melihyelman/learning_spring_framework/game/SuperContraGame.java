package com.melihyelman.learning_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("sit down");
    }
    public void left() {
        System.out.println("go back");
    }
    public void right() {
        System.out.println("speed up");
    }
}
