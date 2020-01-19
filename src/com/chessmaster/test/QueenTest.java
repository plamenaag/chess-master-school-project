package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Queen;

@SuppressWarnings("ALL")
public class QueenTest {
    public static void testIfPieceCanMoveVertically() {
        System.out.print("testIfPieceCanMoveVertically -> ");

        Queen testElement = new Queen(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfPieceCanMoveDiagonally() {
        System.out.print("testIfPieceCanMoveDiagonally -> ");

        Queen testElement = new Queen(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(6, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {
        System.out.println("Start Queen tests");
        testIfPieceCanMoveVertically();
        testIfPieceCanMoveDiagonally();
        System.out.println("End Queen tests");
    }
}
