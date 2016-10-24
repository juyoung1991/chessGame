package tests;

import chess.Board;
import chess.Rook;
import chess.Pawn;
import chess.Square;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 8..
 */
public class RookTest {

    /**
     * Testing if Rook can move upward to an empty square.
     */
    @Test
    public void rookMoveToEmptySquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][3];
        Rook myRook = new Rook(3,3,true,"Rook",true); //The player doesn't matter in this case
        currSquare.piece = myRook;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Rook can move downward to an empty square.
     */
    @Test
    public void rookMoveToEmptySquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][3];
        Rook myRook = new Rook(3,3,true,"Rook",true); //The player doesn't matter in this case
        currSquare.piece = myRook;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move downward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Rook can move right to an empty square.
     */
    @Test
    public void rookMoveToEmptySquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][6];
        Rook myRook = new Rook(3,3,true,"Rook",true); //The player doesn't matter in this case
        currSquare.piece = myRook;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Rook can move left to an empty square.
     */
    @Test
    public void rookMoveToEmptySquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][0];
        Rook myRook = new Rook(3,3,true,"Rook",true); //The player doesn't matter in this case
        currSquare.piece = myRook;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Rook can move upward to an occupied square.
     */
    @Test
    public void rookMoveToOccupiedSquareUpward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][3];
        Rook myRook = new Rook(3,3,true,"Rook",true); //White king
        Pawn myPawn = new Pawn(0,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myRook;
        destSquare.piece = myPawn;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move upward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Rook");
    }

    /**
     * Testing if Rook can move downward to an occupied square.
     */
    @Test
    public void rookMoveToOccupiedSquareDownward() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][3];
        Rook myRook = new Rook(3,3,true,"Rook",true); //White king
        Pawn myPawn = new Pawn(6,3,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myRook;
        destSquare.piece = myPawn;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move downward\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Rook");
    }

    /**
     * Testing if Rook can move right to an occupied square.
     */
    @Test
    public void rookMoveToOccupiedSquareRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][6];
        Rook myRook = new Rook(3,3,true,"Rook",true); //White king
        Pawn myPawn = new Pawn(3,6,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myRook;
        destSquare.piece = myPawn;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move right\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Rook");
    }

    /**
     * Testing if Rook can move left to an occupied square.
     */
    @Test
    public void rookMoveToOccupiedSquareLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[3][0];
        Rook myRook = new Rook(3,3,true,"Rook",true); //White king
        Pawn myPawn = new Pawn(3,0,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myRook;
        destSquare.piece = myPawn;

        assertTrue((myRook.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Rook to move left\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Rook can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Rook

        int newXcoord = myRook.getxCoord();
        int newYcoord = myRook.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Rook have left the original square
        System.out.printf("The square which the Rook was originally at is now null\n");
        assertTrue(destSquare.piece == myRook); //check if the Rook is in the destination square
        System.out.printf("The destination square has the Rook\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Rook's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Rook's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Rook");
    }

    /**
     * Testing if Rook can move upward when there is a piece in its path.
     */
    @Test
    public void rookUpwardWithPieceInTheWay() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square midSquare = myChessBoard.board[2][3];
        Square destSquare = myChessBoard.board[0][3];
        Rook myRook = new Rook(3,3,true,"Rook",true); //White Rook
        Pawn myPawn = new Pawn(0,3,true,"Pawn",false, true); //Black pawn
        Pawn myPawn_IntheWay = new Pawn(2,3,true,"Pawn",false, true);
        currSquare.piece = myRook;
        destSquare.piece = myPawn;
        midSquare.piece = myPawn_IntheWay;

        assertTrue(!myRook.validMovement(currSquare, destSquare, myChessBoard)); //check if it's a valid movement
        System.out.printf("The Rook can't move because there is a pawn in the way\n");
    }
}
