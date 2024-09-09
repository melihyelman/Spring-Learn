package com.melihyelman.learning_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("slow");
    }
    public void left() {
        System.out.println("fly");
    }
    public void right() {
        System.out.println("right");
    }
}
