package homework10.task2;

public class WhatIsBetween {

    public static int[] between(int a, int b) {
        int[] arr = new int[b - a + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a++;
        }

        return arr;
    }
}
