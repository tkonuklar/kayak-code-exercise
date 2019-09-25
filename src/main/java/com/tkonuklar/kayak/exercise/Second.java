package com.tkonuklar.kayak.exercise;

public class Second {

    public void countUp(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            countUp(start + 1, end);
        }
    }

    public void countUpAndDown(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            countUpAndDown(start + 1, end);
        } else {
            if (end > 0) {
                System.out.println(end - 1);
                countUpAndDown(start, end - 1);
            }
        }
    }
}
