package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.King;

@SuppressWarnings("ALL")
public class KingTest {

    public static void testIfPieceCanMoveOneField() {
        System.out.print("testIfPieceCanMoveOneField -> ");

        King testElement = new King(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 2);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfPieceCanMoveMoreThanTwoFields() {
        System.out.print("testIfPieceCanMoveMoreThanTwoFields -> ");

        King testElement = new King(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {
        System.out.println("Start King tests");
        testIfPieceCanMoveOneField();
        testIfPieceCanMoveMoreThanTwoFields();
        System.out.println("End King tests");
    }
}
