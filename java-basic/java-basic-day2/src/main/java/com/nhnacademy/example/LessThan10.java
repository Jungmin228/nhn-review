package com.nhnacademy.example;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.stream;

public class LessThan10 {
    private int[] numbers = new int[100];

    public void initNumbers() {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
    }

    public void printNumbers(boolean less) {
        if (less) {
            System.out.println(Arrays.toString(stream(numbers).filter(i -> i <= 10).toArray()));
        } else{
            System.out.println(Arrays.toString(numbers));
        }
    }
}
