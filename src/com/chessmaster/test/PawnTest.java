package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Pawn;

@SuppressWarnings("ALL")
public class PawnTest {

    public static void testIfPieceCanMoveOneField() {
        System.out.print("testIfPieceCanMoveOneField -> ");

        Pawn testElement = new Pawn(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 2);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfPieceCanMoveMoreThanTwoFields() {
        System.out.print("testIfPieceCanMoveMoreThanTwoFields -> ");

        Pawn testElement = new Pawn(PieceColor.BLACK, 1, 1);

        boolean isValid = testElement.isMoveActionValid(1, 6);

        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {
        System.out.println("Start Pawn tests");
        testIfPieceCanMoveOneField();
        testIfPieceCanMoveMoreThanTwoFields();
        System.out.println("End Pawn tests");
    }
}
