package com.nhnacademy.task;

import java.util.Scanner;

public class Accumulator {
    private int operand1;
    private int operand2;
    private int result;
    private char operator;

    public void run() {
        boolean first = true;
        while (true) {
            Scanner scanner = new Scanner(System.in);

            if (first) {
                System.out.println("어떤 연산을 하실건가요? (+, -, *, /, !)");

                operator = scanner.next().charAt(0);

                if (operator == '!') {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                System.out.println("피연산자 2수를 입력하세요.");

                operand1 = scanner.nextInt();
                operand2 = scanner.nextInt();

                switch (operator) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        System.out.println("연산자가 잘못되었습니다.");
                        continue;
                }
                System.out.printf("%d %c %d = %d 입니다.%n", operand1, operator, operand2, result);
                first = false;
            } else {
                System.out.println("어떤 연산을 계속 하실건가요? (+, -, *, /, !)");
                operator = scanner.next().charAt(0);

                if (operator == '!') {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                System.out.println("수를 입력하세요.");

                operand1 = result;
                operand2 = scanner.nextInt();

                switch (operator) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        System.out.println("연산자가 잘못되었습니다.");
                        continue;
                }
                System.out.printf("%d %c %d = %d 입니다.%n", operand1, operator, operand2, result);
            }
        }
    }
}
