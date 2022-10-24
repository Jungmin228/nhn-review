package com.nhnacademy.task;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private int me;
    private int com;

    public void run() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("가위(1) 바위(2) 보(3): ");
            me = scanner.nextInt();
            com = random.nextInt(3) + 1;

            if (!this.printSelected("당신", me)) {
                continue;
            }
            this.printSelected("컴퓨터", com);

            if (checkWin(me, com)) {
                return;
            }
        }
    }

    private boolean printSelected(String name, int num) {
        System.out.print(name);
        switch (num) {
            case 1:
                System.out.println("은(는) 가위(1)입니다.");
                break;
            case 2:
                System.out.println("은(는) 바위(2)입니다.");
                break;
            case 3:
                System.out.println("은(는) 보(3)입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return false;
        }
        return true;
    }

    private boolean checkWin(int p1, int p2) {
        if (p1 == p2) {
            System.out.println("비겼습니다. 다시 합니다.");
            return false;
        } else if (p1 - p2 == -2 || p1 - p2 == 1) {
            System.out.println("이겼습니다.");
            return true;
        } else {
            System.out.println("졌습니다.");
            return true;
        }
    }
}
