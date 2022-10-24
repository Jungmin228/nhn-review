package com.nhnacademy.task;

import java.util.Scanner;

public class Calculator {

    private int operand1;
    private int operand2;
    private char operator;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("어떤 연산을 하실건가요? (+, -, *, /)");

        this.operator = scanner.next().charAt(0);

        System.out.println("피연산자 2수를 입력하세요.");

        this.operand1 = scanner.nextInt();
        this.operand2 = scanner.nextInt();

        int result;
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
                result = operand1/ operand2;
                break;
            default:
                result = 0;
                break;
        }
        System.out.printf("%d %c %d = %d 입니다.", operand1, operator, operand2, result);
    }
}
