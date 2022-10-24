package com.nhnacademy;

import com.nhnacademy.example.BubbleSort;
import com.nhnacademy.example.LessThan10;
import com.nhnacademy.task.TicTacToe;

public class Main {
    public static void main(String[] args) {
        // review 버블정렬
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.printNumbers();
//        bubbleSort.initNumbers();
//        bubbleSort.printNumbers();
//        bubbleSort.sort();
//        bubbleSort.printNumbers();

        // review 길이 100 배열에서 10 이하 숫자 출력
//        LessThan10 lessThan10 = new LessThan10();
//        lessThan10.initNumbers();
//        lessThan10.printNumbers(false);
//        lessThan10.printNumbers(true);

        // review 틱택토
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.initBoard();
        ticTacToe.printBoard();
        ticTacToe.run();
    }
}