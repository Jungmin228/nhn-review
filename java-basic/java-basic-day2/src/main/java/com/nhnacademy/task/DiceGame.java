package com.nhnacademy.task;

import java.util.Random;

public class DiceGame {
    private int[] p1 = new int[3];
    private int[] p2 = new int[3];

    public void run() {
        System.out.println("사용자 A");
        while (true) {
            if (equalNum(p1)) {
                dicing(p1);
                printDice(p1);
                continue;
            }
            break;
        }

        System.out.println("사용자 B");
        while (true) {
            if (equalNum(p2)) {
                dicing(p2);
                printDice(p2);
                continue;
            }
            break;
        }

        if (p1[2] > p2[2]) {
            System.out.println("사용자 A 승리");
        } else if (p1[2] < p2[2]) {
            System.out.println("사용자 B 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private void dicing(int[] p) {
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            p[i] = random.nextInt(6) + 1;
        }

        p[2] += (p[0] + p[1]);
    }

    private boolean equalNum(int[] p) {
        return p[0] == p[1];
    }

    public void printDice(int[] p) {
        for (int n : p) {
            System.out.print(n+ " ");
        }
        System.out.println();
    }
}
