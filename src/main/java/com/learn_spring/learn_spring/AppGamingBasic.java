package com.learn_spring.learn_spring;

import com.learn_spring.learn_spring.game.GameRunner;
import com.learn_spring.learn_spring.game.MarioGame;
import com.learn_spring.learn_spring.game.PacMan;

public class AppGamingBasic {
    public static void main(String[] args) {
        // var marioGame = new MarioGame();
        var pacMan = new PacMan();

        var gameRunner = new GameRunner(pacMan);
        gameRunner.run();
    }
}
