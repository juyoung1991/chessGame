package tests;

import chess.Board;
import chess.Bishop;
import chess.Pawn;
import chess.Square;
import org.junit.Before;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertTrue;
/**
 * Created by lildk91 on 2016. 9. 8..
 */
public class BishopTest {

    /**
     * Testing bishop moving to an empty square in a topright diagnol direction.
     */

    @Test
    public void bishopMoveToEmptySquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][6];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //The player doesn't matter in this case
        currSquare.piece = myBishop;
        System.out.println(myBishop.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing bishop moving to an empty square in a topleft diagnol direction.
     */
    @Test
    public void bishopMoveToEmptySquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][0];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //The player doesn't matter in this case
        currSquare.piece = myBishop;
        System.out.println(myBishop.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing bishop moving to an empty square in a botright diagnol direction.
     */
    @Test
    public void bishopMoveToEmptySquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][6];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //The player doesn't matter in this case
        currSquare.piece = myBishop;
        System.out.println(myBishop.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing bishop moving to an empty square in a botleft diagnol direction.
     */
    @Test
    public void bishopMoveToEmptySquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][0];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //The player doesn't matter in this case
        currSquare.piece = myBishop;
        System.out.println(myBishop.validMovement(currSquare, destSquare, myChessBoard));
        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing bishop moving to an occupied square in a topright diagnol direction.
     */
    @Test
    public void bishopMoveToOccupiedSquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][6];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //White king
        Pawn myPawn = new Pawn(0,6,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myBishop;
        destSquare.piece = myPawn;

        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Bishop");
    }

    /**
     * Testing bishop moving to an occupied square in a topleft diagnol direction.
     */
    @Test
    public void bishopMoveToOccupiedSquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[0][0];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //White king
        Pawn myPawn = new Pawn(0,0,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myBishop;
        destSquare.piece = myPawn;

        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Bishop");
    }

    /**
     * Testing bishop moving to an occupied square in a botright diagnol direction.
     */
    @Test
    public void bishopMoveToOccupiedSquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][6];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //White king
        Pawn myPawn = new Pawn(6,6,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myBishop;
        destSquare.piece = myPawn;

        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Bishop");
    }

    /**
     * Testing bishop moving to an occupied square in a botleft diagnol direction.
     */
    @Test
    public void bishopMoveToOccupiedSquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[6][0];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //White king
        Pawn myPawn = new Pawn(6,0,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myBishop;
        destSquare.piece = myPawn;

        assertTrue((myBishop.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Bishop to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Bishop can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the king

        int newXcoord = myBishop.getxCoord();
        int newYcoord = myBishop.getyCoord();

        assertTrue(currSquare.piece == null); //check if the king have left the original square
        System.out.printf("The square which the Bishop was originally at is now null\n");
        assertTrue(destSquare.piece == myBishop); //check if the king is in the destination square
        System.out.printf("The destination square has the Bishop\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Bishop's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Bishop's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Bishop");
    }

    /**
     * Testing bishop moving to an occupied square in a topright diagnol direction with a piece in the way.
     */
    @Test
    public void bishopTopRightWithPieceInTheWay() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square midSquare = myChessBoard.board[2][4];
        Square destSquare = myChessBoard.board[0][6];
        Bishop myBishop = new Bishop(3,3,true,"Bishop",true); //White king
        Pawn myPawn = new Pawn(0,6,true,"Pawn",false, true); //Black pawn
        Pawn myPawn_IntheWay = new Pawn(2,4,true,"Pawn",false, true);
        currSquare.piece = myBishop;
        destSquare.piece = myPawn;
        midSquare.piece = myPawn_IntheWay;

        assertTrue(!myBishop.validMovement(currSquare, destSquare, myChessBoard)); //check if it's a valid movement
        System.out.printf("The Bishop can't move because there is a pawn in the way\n");
    }
}

