package com.tkonuklar.kayak;

import com.tkonuklar.kayak.exercise.First;
import com.tkonuklar.kayak.exercise.Second;

public class Main {

    private static final String FILE_NAME = "input.txt";

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("##############  EXERCISE 1 ###############");
        main.runFirstExercise();

        System.out.println("##############  EXERCISE 2 ###############");
        main.runSecondExercise();
    }

    private void runFirstExercise() {
        final var directions = FileUtils.readFromFile(FILE_NAME, Main.class);
        final var firstExercise = new First();
        final var coordinates = firstExercise.getLatestPosition(directions);
        System.out.println(String.format("Last position : [%s %s] ", coordinates[0], coordinates[1]));
    }

    private void runSecondExercise() {
        final var secondExercise = new Second();
        System.out.println("##############  Part 1 ###############");
        secondExercise.countUp(0, 5);
        System.out.println("##############  Part 2 ###############");
        secondExercise.countUpAndDown(0, 5);
    }
}
