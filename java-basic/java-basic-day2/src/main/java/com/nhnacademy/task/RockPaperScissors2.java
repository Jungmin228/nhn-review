package com.nhnacademy.task;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors2 {
    private int me;
    private int com;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("가위(1) 바위(2) 보(3): ");
            me = scanner.nextInt();
            com = random.nextInt(3) + 1;

            System.out.printf("당신은 %s 입니다.%n", printName(me));
            System.out.printf("컴퓨터는 %s 입니다.%n", printName(com));

            switch (me - com) {
                case 0:
                    System.out.println("비겼습니다. 다시 합니다.");
                    break;
                case 1: case -2:
                    System.out.println("이겼습니다.");
                    return;
                case -1: case 2:
                    System.out.println("졌습니다.");
                    return;
            }
        }
    }

    private String printName(int n) {
        return n == 1 ? "가위(1)" : n == 2 ? "바위(2)" : "보(3)";
    }
}
