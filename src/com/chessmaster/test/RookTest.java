package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Rook;

@SuppressWarnings("ALL")
public class RookTest {
    public static void testIfPieceCanMoveVertically() {
        System.out.print("testIfPieceCanMoveVertically -> ");

        Rook testElement = new Rook(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfPieceCanMoveDiagonally() {
        System.out.print("testIfPieceCanMoveDiagonally -> ");

        Rook testElement = new Rook(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(6, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {
        System.out.println("Start Rook tests");
        testIfPieceCanMoveVertically();
        testIfPieceCanMoveDiagonally();
        System.out.println("End Rook tests");
    }
}
