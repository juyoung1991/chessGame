package tests;

import chess.Board;
import chess.King;
import chess.Pawn;
import chess.Square;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertTrue;


/**
 * Created by lildk91 on 2016. 9. 7..
 */
public class KingTest {
    /**
     * Testing if King can move upwards to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][3];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move downwards to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][3];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move downward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move right to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][4];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move left to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][2];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move topright to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][4];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move topleft to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][2];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move botright to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][4];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move botleft to an empty square.
     */
    @Test
    public void kingMoveToEmptySquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][2];
        King myKing = new King(3,3,true,"King",true); //The player doesn't matter in this case
        currSquare.piece = myKing;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if King can move upwards to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][3];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(2,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can move downward to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][3];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(4,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move downward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can move right to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][4];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(3,4,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can move left to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][2];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(3,2,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can move topright to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][4];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(2,4,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can move topleft to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][2];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(2,2,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can move botright to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][4];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(4,4,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can move botleft to an occupied square.
     */
    @Test
    public void kingMoveToOccupiedSquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][2];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(4,2,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue((myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myKing.getxCoord();
        int newYcoord = myKing.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myKing); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if King can occupy a same colored square.
     */
    @Test
    public void kingMoveToOccupySameColorPiece() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][4];
        King myKing = new King(3,3,true,"King",true); //White king
        Pawn myPawn = new Pawn(3,4,true,"Pawn",true, true); //White pawn
        currSquare.piece = myKing;
        destSquare.piece = myPawn;

        assertTrue(!(myKing.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("The king cannot move to the destination square because they are same color\n");

    }
}
