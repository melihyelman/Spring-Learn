package com.melihyelman.learning_spring_framework.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(PacmanGame marioGame) {
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
