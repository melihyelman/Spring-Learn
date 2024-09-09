package com.melihyelman.learning_spring_framework;

import com.melihyelman.learning_spring_framework.game.GameRunner;
import com.melihyelman.learning_spring_framework.game.MarioGame;
import com.melihyelman.learning_spring_framework.game.PacmanGame;
import com.melihyelman.learning_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gamerRunner = new GameRunner(game);
        gamerRunner.run();
    }
}
