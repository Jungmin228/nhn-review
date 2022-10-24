package com.nhnacademy.example;

import java.util.Random;

public class BubbleSort {
    private int[] numbers = new int[10];

    public void initNumbers() {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20) + 1;
        }
    }

    public void sort() {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public void printNumbers() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
