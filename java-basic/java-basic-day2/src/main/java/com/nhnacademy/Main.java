package com.nhnacademy;

import com.nhnacademy.example.BubbleSort;
import com.nhnacademy.example.LessThan10;
import com.nhnacademy.task.*;

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
//        TicTacToe ticTacToe = new TicTacToe();
//        ticTacToe.initBoard();
//        ticTacToe.printBoard();
//        ticTacToe.run();

        // review 4칙 연산기
//        Calculator calculator = new Calculator();
//        calculator.run();

        // review 4칙 누산기
//        Accumulator accumulator = new Accumulator();
//        accumulator.run();

        // review 주사위 게임
//        DiceGame diceGame = new DiceGame();
//        diceGame.run();

        // review 가위바위보 게임
        RockPaperScissors2 rockPaperScissors = new RockPaperScissors2();
        rockPaperScissors.run();
    }
}
