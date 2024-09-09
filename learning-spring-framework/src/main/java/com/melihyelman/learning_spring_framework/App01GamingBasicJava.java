package com.melihyelman.learning_spring_framework;

import com.melihyelman.learning_spring_framework.game.GameRunner;
import com.melihyelman.learning_spring_framework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame(); // 1: Object Creation
        var gamerRunner = new GameRunner(game); // 2: Object Creation + Wiring of Dependencies
        // Game is a dependency of GameRunner Class
        gamerRunner.run();
    }
}
