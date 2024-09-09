package com.melihyelman.learning_spring_framework.game;

public class GameRunner {
    private  game;
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
