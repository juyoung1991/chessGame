package tests;

import chess.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 14..
 */
public class HyoTest {
    /**
     * Testing if Hyo can move upwards to an empty square.
     */
    @Test
    public void hyoMoveToEmptySquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][3];
        Hyo myHyo = new Hyo(3,3,true,"Hyo",true); //The player doesn't matter in this case
        currSquare.piece = myHyo;

        assertTrue((myHyo.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        assertTrue(currSquare.canOccupy(destSquare));

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myHyo.getxCoord();
        int newYcoord = myHyo.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        assertTrue(destSquare.piece == myHyo); //check if the king is in the destination square
        assertTrue(destSquare.xCoord == newXcoord);
        assertTrue(destSquare.yCoord == newYcoord);
    }

    /**
     * Testing if Hyo can move downwards to an empty square.
     */
    @Test
    public void hyoMoveToEmptySquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[5][3];
        Hyo myHyo = new Hyo(3,3,true,"Hyo",true); //The player doesn't matter in this case
        currSquare.piece = myHyo;

        assertTrue((myHyo.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        assertTrue(currSquare.canOccupy(destSquare));

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myHyo.getxCoord();
        int newYcoord = myHyo.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        assertTrue(destSquare.piece == myHyo); //check if the king is in the destination square
        assertTrue(destSquare.xCoord == newXcoord);
        assertTrue(destSquare.yCoord == newYcoord);
    }

    /**
     * Testing if Hyo can move upwards to an occupied square.
     */
    @Test
    public void hyoMoveToOccupiedSquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][3];
        Hyo myHyo = new Hyo(3,3,true,"Hyo",true); //White king
        Pawn myPawn = new Pawn(1,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myHyo;
        destSquare.piece = myPawn;

        assertTrue((myHyo.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        assertTrue(currSquare.canOccupy(destSquare));

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myHyo.getxCoord();
        int newYcoord = myHyo.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        assertTrue(destSquare.piece == myHyo); //check if the king is in the destination square
        assertTrue(destSquare.xCoord == newXcoord);
        assertTrue(destSquare.yCoord == newYcoord);
        assertTrue(myPawn.isAvailable() == false);
    }

    /**
     * Testing if Hyo can move downwards to an occupied square.
     */
    @Test
    public void hyoMoveToOccupiedSquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[5][3];
        Hyo myHyo = new Hyo(3,3,true,"Hyo",true); //White king
        Pawn myPawn = new Pawn(5,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myHyo;
        destSquare.piece = myPawn;

        assertTrue((myHyo.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        assertTrue(currSquare.canOccupy(destSquare));

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myHyo.getxCoord();
        int newYcoord = myHyo.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        assertTrue(destSquare.piece == myHyo); //check if the king is in the destination square
        assertTrue(destSquare.xCoord == newXcoord);
        assertTrue(destSquare.yCoord == newYcoord);
        assertTrue(myPawn.isAvailable() == false);
    }
}
