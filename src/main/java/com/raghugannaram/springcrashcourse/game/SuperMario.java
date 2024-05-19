package com.raghugannaram.springcrashcourse.game;

public class SuperMario implements ConsoleGame {

    public void up() {
        System.out.println("Jumping");
    }

    public void down() {
        System.out.println("Ducking");
    }

    public void left() {
        System.out.println("Moving left");
    }

    public void right() {
        System.out.println("Moving right");
    }
}
