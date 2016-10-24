package tests;

import chess.Bishop;
import chess.Board;
import chess.Pawn;
import chess.Square;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 8..
 */
public class PawnTest {
    /**
     * Testing if white Pawn can move forward to an empty square.
     */
    @Test
    public void pawnMoveToEmptySquareForwardWhite() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][3];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",true, true); //Player = white
        currSquare.piece = myPawn;

        assertTrue((myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Pawn to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Pawn can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myPawn.getxCoord();
        int newYcoord = myPawn.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Pawn was originally at is now null\n");
        assertTrue(destSquare.piece == myPawn); //check if the king is in the destination square
        System.out.printf("The destination square has the Pawn\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Pawn's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Pawn's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if black Pawn can move forward to an empty square.
     */
    @Test
    public void pawnMoveToEmptySquareForwardBlack() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][3];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",false, true); //Player = white
        currSquare.piece = myPawn;

        assertTrue((myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Pawn to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Pawn can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myPawn.getxCoord();
        int newYcoord = myPawn.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Pawn was originally at is now null\n");
        assertTrue(destSquare.piece == myPawn); //check if the king is in the destination square
        System.out.printf("The destination square has the Pawn\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Pawn's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Pawn's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if white Pawn can move forward to an occupied square.
     */
    @Test
    public void pawnMoveToOccupiedSquareForwardWhite() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][3];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",true, true); //White king
        Bishop myBishop = new Bishop(2,3,true,"Bishop",false); //Black Bishop
        currSquare.piece = myPawn;
        destSquare.piece = myBishop;

        assertTrue(!(myPawn.validMovement(currSquare, destSquare, myChessBoard)));
    }

    /**
     * Testing if black Pawn can move forward to an occupied square.
     */
    @Test
    public void pawnMoveToOccupiedSquareForwardBlack() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][3];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",false, true); //White king
        Bishop myBishop = new Bishop(2,3,true,"Bishop",false); //Black Bishop
        currSquare.piece = myPawn;
        destSquare.piece = myBishop;

        assertTrue(!(myPawn.validMovement(currSquare, destSquare, myChessBoard)));
    }

    /**
     * Testing if white Pawn can move right-diagonally to an empty square.
     */
    @Test
    public void pawnMoveToEmptySquareForwardDiagRightWhite() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][4];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",true, true); //Player = white
        currSquare.piece = myPawn;

        assertTrue(!(myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("Pawn can only move diagonally when it is occupied by the opposite colored piece.\n");
    }

    /**
     * Testing if white Pawn can move left-diagonally to an empty square.
     */
    @Test
    public void pawnMoveToEmptySquareForwardDiagLeftWhite() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][2];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",true, true); //Player = white
        currSquare.piece = myPawn;

        assertTrue(!(myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("Pawn can only move diagonally when it is occupied by the opposite colored piece.\n");
    }

    /**
     * Testing if black Pawn can move right-diagonally to an empty square.
     */
    @Test
    public void pawnMoveToEmptySquareForwardDiagRightBlack() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][4];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",false, true); //Player = white
        currSquare.piece = myPawn;

        assertTrue(!(myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("Pawn can only move diagonally when it is occupied by the opposite colored piece.\n");
    }

    /**
     * Testing if black Pawn can move left-diagonally to an empty square.
     */
    @Test
    public void pawnMoveToEmptySquareForwardDiagLeftBlack() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][2];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",false, true); //Player = white
        currSquare.piece = myPawn;

        assertTrue(!(myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("Pawn can only move diagonally when it is occupied by the opposite colored piece.\n");
    }

    /**
     * Testing if white Pawn can move right-diagonally to an occupied square.
     */
    @Test
    public void pawnMoveToOccupiedSquareForwardDiagRightWhite() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][4];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",true, true); //Player = white
        Bishop myBishop = new Bishop(2,4,true,"Bishop",false); //Player = black
        currSquare.piece = myPawn;
        destSquare.piece = myBishop;
        assertTrue((myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Pawn to move diagonally right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Pawn can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myPawn.getxCoord();
        int newYcoord = myPawn.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Pawn was originally at is now null\n");
        assertTrue(destSquare.piece == myPawn); //check if the king is in the destination square
        System.out.printf("The destination square has the Pawn\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Pawn's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Pawn's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if white Pawn can move left-diagonally to an occupied square.
     */
    @Test
    public void pawnMoveToOccupiedSquareForwardDiagLeftWhite() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][2];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",true, true); //Player = white
        Bishop myBishop = new Bishop(2,2,true,"Bishop",false); //Player = black
        currSquare.piece = myPawn;
        destSquare.piece = myBishop;
        assertTrue((myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Pawn to move diagonally left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Pawn can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myPawn.getxCoord();
        int newYcoord = myPawn.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Pawn was originally at is now null\n");
        assertTrue(destSquare.piece == myPawn); //check if the king is in the destination square
        System.out.printf("The destination square has the Pawn\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Pawn's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Pawn's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if black Pawn can move right-diagonally to an occupied square.
     */
    @Test
    public void pawnMoveToOccupiedSquareForwardDiagRightBlack() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][4];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",false, true); //Player = black
        Bishop myBishop = new Bishop(4,4,true,"Bishop",true); //Player = white
        currSquare.piece = myPawn;
        destSquare.piece = myBishop;
        assertTrue((myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Pawn to move diagonally right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Pawn can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myPawn.getxCoord();
        int newYcoord = myPawn.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Pawn was originally at is now null\n");
        assertTrue(destSquare.piece == myPawn); //check if the king is in the destination square
        System.out.printf("The destination square has the Pawn\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Pawn's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Pawn's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if black Pawn can move left-diagonally to an occupied square.
     */
    @Test
    public void pawnMoveToOccupiedSquareForwardDiagLeftBlack() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][2];
        Pawn myPawn = new Pawn(3,3,true,"Pawn",false, true); //Player = black
        Bishop myBishop = new Bishop(4,2,true,"Bishop",true); //Player = white
        currSquare.piece = myPawn;
        destSquare.piece = myBishop;
        assertTrue((myPawn.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Pawn to move diagonally left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Pawn can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myPawn.getxCoord();
        int newYcoord = myPawn.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Pawn was originally at is now null\n");
        assertTrue(destSquare.piece == myPawn); //check if the king is in the destination square
        System.out.printf("The destination square has the Pawn\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Pawn's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Pawn's new yCoord == destination square's yCoord\n");
    }
}
