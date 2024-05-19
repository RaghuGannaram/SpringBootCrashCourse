package com.raghugannaram.springcrashcourse.game;

public class Asphalt implements ConsoleGame {
    
    public void up() {
        System.out.println("Accelerating");
    }

    public void down() {
        System.out.println("Braking");
    }

    public void left(){
        System.out.println("Turning left");
    }

    public void right(){
        System.out.println("Turning right");
    }
}
