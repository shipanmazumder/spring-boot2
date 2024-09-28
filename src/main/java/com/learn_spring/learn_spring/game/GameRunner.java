package com.learn_spring.learn_spring.game;

public class GameRunner {
    GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.left();
        game.down();
        game.right();
    }
}
