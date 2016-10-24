package tests;

import chess.Board;
import chess.King;
import chess.Square;
import chess.David;
import chess.Pawn;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 14..
 */
public class DavidTest {
    /**
     * Testing if David can move upwards to an empty square.
     */
    @Test
    public void davidMoveToEmptySquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][3];
        David myDavid = new David(3,3,true,"David",true); //The player doesn't matter in this case
        currSquare.piece = myDavid;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if David can move downwards to an empty square.
     */
    @Test
    public void davidMoveToEmptySquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][3];
        David myDavid = new David(3,3,true,"David",true); //The player doesn't matter in this case
        currSquare.piece = myDavid;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if David can move right to an empty square.
     */
    @Test
    public void davidMoveToEmptySquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][6];
        David myDavid = new David(3,3,true,"David",true); //The player doesn't matter in this case
        currSquare.piece = myDavid;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if David can move left to an empty square.
     */
    @Test
    public void davidMoveToEmptySquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][0];
        David myDavid = new David(3,3,true,"David",true); //The player doesn't matter in this case
        currSquare.piece = myDavid;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if David can move upwards to an occupied square.
     */
    @Test
    public void davidMoveToOccupiedSquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][3];
        David myDavid = new David(3,3,true,"David",true); //White king
        Pawn myPawn = new Pawn(0,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myDavid;
        destSquare.piece = myPawn;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if David can move downwards to an occupied square.
     */
    @Test
    public void davidMoveToOccupiedSquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][3];
        David myDavid = new David(3,3,true,"David",true); //White king
        Pawn myPawn = new Pawn(6,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myDavid;
        destSquare.piece = myPawn;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if David can move right to an occupied square.
     */
    @Test
    public void davidMoveToOccupiedSquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][6];
        David myDavid = new David(3,3,true,"David",true); //White king
        Pawn myPawn = new Pawn(3,6,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myDavid;
        destSquare.piece = myPawn;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

    /**
     * Testing if David can move left to an occupied square.
     */
    @Test
    public void davidMoveToOccupiedSquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][0];
        David myDavid = new David(3,3,true,"David",true); //White king
        Pawn myPawn = new Pawn(3,0,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myDavid;
        destSquare.piece = myPawn;

        assertTrue((myDavid.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for king to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The king can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myDavid.getxCoord();
        int newYcoord = myDavid.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the king was originally at is now null\n");
        assertTrue(destSquare.piece == myDavid); //check if the king is in the destination square
        System.out.printf("The destination square has the king\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("King's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("King's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the king");
    }

}
