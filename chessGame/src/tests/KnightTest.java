package tests;

import chess.Board;
import chess.Knight;
import chess.Pawn;
import chess.Square;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 8..
 */
public class KnightTest {

    /**
     * Testing if Knight can move topright to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][4];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move topleft to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][2];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move botright to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[5][4];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move botleft to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[5][2];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move righttop to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareRightTop() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][5];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move RightTop\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move rightbot to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareRightBot() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][5];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move RightBot\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move lefttop to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareLeftTop() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][1];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move LeftTop\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move leftbot to an empty square.
     */
    @Test
    public void knightMoveToEmptySquareLeftBot() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][1];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //The player doesn't matter in this case
        currSquare.piece = myKnight;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move LeftBot\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
    }

    /**
     * Testing if Knight can move topright to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareTopRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][4];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(1,4,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move TopRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }

    /**
     * Testing if Knight can move topleft to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareTopLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[1][2];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(1,2,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move TopLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }

    /**
     * Testing if Knight can move botright to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareBotRight() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[5][4];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(5,4,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move BotRight\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }

    /**
     * Testing if Knight can move botleft to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareBotLeft() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[5][2];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(5,2,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move BotLeft\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }

    /**
     * Testing if Knight can move righttop to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareRightTop() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][5];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(2,5,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move RightTop\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }

    /**
     * Testing if Knight can move rightbot to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareRightBot() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][5];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(4,5,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move RightBot\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }

    /**
     * Testing if Knight can move lefttop to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareLeftTop() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[2][1];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(2,1,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move LeftTop\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }

    /**
     * Testing if Knight can move leftbot to an occupied square.
     */
    @Test
    public void knightMoveToOccupiedSquareLeftBot() {
        Board myChessBoard = new Board();
        Square currSquare = myChessBoard.board[3][3];
        Square destSquare = myChessBoard.board[4][1];
        Knight myKnight = new Knight(3,3,true,"Knight",true); //White Knight
        Pawn myPawn = new Pawn(4,1,true,"Pawn",false, true); //Black pawn
        currSquare.piece = myKnight;
        destSquare.piece = myPawn;

        assertTrue((myKnight.validMovement(currSquare, destSquare, myChessBoard))); //check if it's a valid movement
        System.out.printf("It was valid for Knight to move LeftBot\n");
        assertTrue(currSquare.canOccupy(destSquare));
        System.out.printf("The Knight can move to the destination square\n");

        currSquare.occupyIt(destSquare); //occupy the destination square with the Knight

        int newXcoord = myKnight.getxCoord();
        int newYcoord = myKnight.getyCoord();

        assertTrue(currSquare.piece == null); //check if the Knight have left the original square
        System.out.printf("The square which the Knight was originally at is now null\n");
        assertTrue(destSquare.piece == myKnight); //check if the Knight is in the destination square
        System.out.printf("The destination square has the Knight\n");
        assertTrue(destSquare.xCoord == newXcoord);
        System.out.printf("Knight's new xCoord == destination square's xCoord\n");
        assertTrue(destSquare.yCoord == newYcoord);
        System.out.printf("Knight's new yCoord == destination square's yCoord\n");
        assertTrue(myPawn.isAvailable() == false);
        System.out.printf("The Pawn is no longer available because it was captured by the Knight");
    }
}
