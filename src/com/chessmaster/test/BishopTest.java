package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Bishop;

@SuppressWarnings("ALL")
public class BishopTest {
    public static void testIfPieceCanMoveVertically() {
        System.out.print("testIfPieceCanMoveVertically -> ");

        Bishop testElement = new Bishop(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfPieceCanMoveDiagonally() {
        System.out.print("testIfPieceCanMoveDiagonally -> ");

        Bishop testElement = new Bishop(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(6, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {
        System.out.println("Start Bishop tests");
        testIfPieceCanMoveVertically();
        testIfPieceCanMoveDiagonally();
        System.out.println("End Bishop tests");
    }
}
