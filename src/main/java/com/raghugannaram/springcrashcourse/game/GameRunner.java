package com.raghugannaram.springcrashcourse.game;

public class GameRunner {
    private ConsoleGame game;

    public GameRunner(ConsoleGame game) {
        this.game = game;
    }

    public void runGame() {
        System.out.println("Running the game");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
