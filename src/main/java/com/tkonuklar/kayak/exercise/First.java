package com.tkonuklar.kayak.exercise;

public class First {
    private static final char LEFT = 'L';
    private static final char RIGHT = 'R';
    private static final char FORWARD = 'F';

    public int[] getLatestPosition(final String direction) {
        int angle = 0;
        int[] coordinate = {0, 0};
        for (char command : direction.toCharArray()) {
            switch (command) {
                case (LEFT):
                    angle = turnLeft(angle);
                    break;
                case (RIGHT):
                    angle = turnRight(angle);
                    break;
                case (FORWARD):
                    coordinate = moveForward(coordinate, angle);
                    break;
            }
        }
        return coordinate;
    }

    private int turnRight(final int angle) {
        return (angle + 90) % 360;
    }

    private int turnLeft(final int angle) {
        return (angle + 270) % 360;
    }

    private int[] moveForward(final int[] coordinate, final int angle) {
        int[] co = coordinate;
        switch (angle) {
            case 0:
                co[1]++;
                break;
            case 90:
                co[0]++;
                break;
            case 180:
                co[1]--;
                break;
            case 270:
                co[0]--;
                break;
        }
        return co;
    }
}
