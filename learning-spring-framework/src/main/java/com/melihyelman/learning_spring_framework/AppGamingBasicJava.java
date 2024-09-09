package com.melihyelman.learning_spring_framework;

import com.melihyelman.learning_spring_framework.game.GameRunner;
import com.melihyelman.learning_spring_framework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gamerRunner = new GameRunner(superContraGame);
        gamerRunner.run();
    }
}
