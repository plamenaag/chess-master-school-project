package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Knight;

@SuppressWarnings("ALL")
public class KnightTest {
    public static void testIfPieceCanMoveVertically() {
        System.out.print("testIfPieceCanMoveVertically -> ");

        Knight testElement = new Knight(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfPieceCanMoveDiagonally() {
        System.out.print("testIfPieceCanMoveDiagonally -> ");

        Knight testElement = new Knight(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(6, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfPieceCanMoveInLShape() {
        System.out.print("testIfPieceCanMoveInLShape -> ");

        Knight testElement = new Knight(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(2, 3);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {
        System.out.println("Start Knight tests");
        testIfPieceCanMoveVertically();
        testIfPieceCanMoveDiagonally();
        testIfPieceCanMoveInLShape();
        System.out.println("End Knight tests");
    }
}
