package com.tkonuklar.kayak.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    private final First firstExercise = new First();

    @Test
    void shouldGetLatestWorksSuccessfully() {
        final String directions = "FF";
        final int[] expectedPosition = {0, 2};

        final var result = firstExercise.getLatestPosition(directions);
        assertEquals(expectedPosition[0], result[0]);
        assertEquals(expectedPosition[1], result[1]);
    }

}
