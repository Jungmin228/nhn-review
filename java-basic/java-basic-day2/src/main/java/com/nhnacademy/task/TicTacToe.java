package com.nhnacademy.task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    char[][] board = new char[3][3];
    int count = 1;

    public void initBoard() {
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i != 2) {
                System.out.println("---|---|---");
            }
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("사용자 턴(x y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (!this.checkInputNumRange(x, y)) {
                continue;
            }

            if (board[x][y] == ' ') {
                board[x][y] = 'O';
                this.printBoard();
            } else {
                System.out.println("이미 입력된 좌표");
                continue;
            }

            switch (this.checkWinPlayer()) {
                case 0:
                    System.out.println("사용자 승리");
                    return;
                case 2:
                    System.out.println("무승부");
                    return;
                default:
                    break;
            }
            this.count++;

            System.out.println("컴퓨터 턴");
            while (true) {
                int comX = random.nextInt(3);
                int comY = random.nextInt(3);

                if (board[comX][comY] == ' ') {
                    board[comX][comY] = 'X';
                    this.printBoard();
                    break;
                }
            }

            switch (this.checkWinCom()) {
                case 1:
                    System.out.println("컴퓨터 승리");
                    return;
                case 2:
                    System.out.println("무승부");
                    return;
                default:
                    break;
            }
            this.count++;
        }
    }

    private boolean checkInputNumRange(int x, int y) {
        if (x > 2 || x < 0 || y > 2 || y < 0) {
            System.out.println("입력 좌표 범위 오류");
            return false;
        }
        return true;
    }

    private int checkWinPlayer() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O' ||
                    board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O' ||
                    board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                    board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
                return 0;
            }
        }
        if (this.count == board.length * board.length) {
            return 2;
        }
        return 3;
    }

    private int checkWinCom() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X' ||
                    board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X' ||
                    board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                    board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
                return 1;
            }
        }
        if (this.count == board.length * board.length) {
            return 2;
        }
        return 3;
    }

}

