package tests;

import chess.Board;
import chess.Queen;
import chess.Pawn;
import chess.Square;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 7..
 */
public class QueenTest {

    /**
     * Testing if Queen can move upward to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][3];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move downward to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][3];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move right to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][6];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move left to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][0];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move topright to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][6];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;
        System.out.println(myQueen.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move topleft to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][0];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;
        System.out.println(myQueen.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move botright to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][6];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;
        System.out.println(myQueen.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move botleft to an empty square.
     */
    @Test
    public void queenMoveToEmptySquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][0];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //The player doesn't matter in this case
        currSquare.piece = myQueen;
        System.out.println(myQueen.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Queen can move upward to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][3];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(0,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move downward to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][3];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(6,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move downward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move right to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][6];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(3,6,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move left to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][0];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(3,0,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move topright to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][6];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(0,6,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move topleft to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][0];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(0,0,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move botright to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][6];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(6,6,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move botleft to an occupied square.
     */
    @Test
    public void queenMoveToOccupiedSquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][0];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(6,0,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;

        assertTrue((myQueen.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Queen to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Queen can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myQueen.getxCoord();
        int newYcoord = myQueen.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Queen was originally at is now null\n");
        assertTrue(destSquare.piece == myQueen); //check if the king is in the destination square
        System.out.printf("The destination square has the Queen\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Queen's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Queen's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Queen");
    }

    /**
     * Testing if Queen can move upward when there is a piece in its path.
     */
    @Test
    public void queenUpwardWithPieceInTheWay() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square midSquare = myChessBoard.board[2][3];
        Square destSquare = myChessBoard.board[0][3];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(0,3,true,"Pawn",false, true); //Black pawn
        Pawn myPawn_IntheWay = new Pawn(2,3,true,"Pawn",false, true);
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;
        midSquare.piece = myPawn_IntheWay;

        assertTrue(!myQueen.validMovement(currSquare, destSquare, myChessBoard)); //check if it's a valid movement
        System.out.printf("The Queen can't move because there is a pawn in the way\n");
    }
    /**
     * Testing if Queen can move topright when there is a piece in its path.
     */
    @Test
    public void queenTopRightWithPieceInTheWay() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square midSquare = myChessBoard.board[2][4];
        Square destSquare = myChessBoard.board[0][6];
        Queen myQueen = new Queen(3,3,true,"Queen",true); //White king
        Pawn myPawn = new Pawn(0,6,true,"Pawn",false, true); //Black pawn
        Pawn myPawn_IntheWay = new Pawn(2,4,true,"Pawn",false, true);
        currSquare.piece = myQueen;
        destSquare.piece = myPawn;
        midSquare.piece = myPawn_IntheWay;

        assertTrue(!myQueen.validMovement(currSquare, destSquare, myChessBoard)); //check if it's a valid movement
        System.out.printf("The Queen can't move because there is a pawn in the way\n");
    }
}
