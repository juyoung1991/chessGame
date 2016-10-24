package tests;

import chess.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 8..
 */
public class GameTest {

    private Board myChessBoard;
    private Player white;
    private Player black;
    private ArrayList<Pieces> whiteChessSet;
    private ArrayList<Pieces> blackChessSet;
    /**
     * Testing check with one enemy opponent checking the king
     */
    @Before
    public void setUpTestCode(){
        myChessBoard = new Board();
        white = new Player(true);
        black = new Player(false);
        whiteChessSet = white.getMyChessPieces();
        blackChessSet = black.getMyChessPieces();
    }
    @Test
    public void testCheck_1() {
        setUpTestCode();
        King myKing = new King(3,3,true,"King",true); //white King
        King enemyKing = new King(0,0,true,"King",false); //black King
        Queen enemyQueen = new Queen(0,3,true,"Queen",false); //black Queen
        whiteChessSet.add(myKing);
        blackChessSet.add(enemyKing);
        blackChessSet.add(enemyQueen);
        myChessBoard.initBoard(white,black);
        Game chessGame = new Game(myChessBoard, white, black);
        assertTrue(chessGame.isKingInCheck(myChessBoard, white, black));
    }

    /**
     * Testing check with two enemy opponent checking the king
     */
    @Test
    public void testCheck_2() {
        King myKing = new King(3,3,true,"King",true); //white King
        King enemyKing = new King(0,0,true,"King",false); //black King
        Queen enemyQueen = new Queen(0,3,true,"Queen",false); //black Queen
        Pawn enemyPawn = new Pawn(2,2,true,"Pawn",true,false); //black pawn
        whiteChessSet.add(myKing);
        blackChessSet.add(enemyKing);
        blackChessSet.add(enemyQueen);
        blackChessSet.add(enemyPawn);
        myChessBoard.initBoard(white,black);
        Game chessGame = new Game(myChessBoard, white, black);
        assertTrue(chessGame.isKingInCheck(myChessBoard, white, black));
    }

    /**
     * Checking a situation when the king is not in check
     */
    @Test
    public void testNotCheck() {
        King myKing = new King(3,3,true,"King",true); //white King
        King enemyKing = new King(0,0,true,"King",false); //black King
        Queen enemyQueen = new Queen(0,2,true,"Queen",false); //black Queen
        whiteChessSet.add(myKing);
        blackChessSet.add(enemyKing);
        blackChessSet.add(enemyQueen);
        myChessBoard.initBoard(white,black);
        Game chessGame = new Game(myChessBoard, white, black);
        assertTrue(!chessGame.isKingInCheck(myChessBoard, white, black));
    }

    /**
     * Testing Checkmate
     */
    @Test
    public void testCheckMate() {

        King myKing = new King(0,6,true,"King",true); //white King
        Pawn myPawn1 = new Pawn(1, 5, true, "Pawn", true, false); //white Pawn
        Pawn myPawn2 = new Pawn(1, 6, true, "Pawn", true, false); //white Pawn
        Pawn myPawn3 = new Pawn(1, 7, true, "Pawn", true, false); //white Pawn
        King enemyKing = new King(6,6,true,"King",false); //black King
        Rook enemyRook = new Rook(0, 3, true, "Rook",false); //black Rook

        whiteChessSet.add(myKing);
        whiteChessSet.add(myPawn1);
        whiteChessSet.add(myPawn2);
        whiteChessSet.add(myPawn3);

        blackChessSet.add(enemyKing);
        blackChessSet.add(enemyRook);

        myChessBoard.initBoard(white,black);

        Game chessGame = new Game(myChessBoard, white, black);
        assertTrue(chessGame.isCheckMateOrStaleMate(myChessBoard, white, black) == 1);
    }

    /**
     * Testing Stalemate
     */
    @Test
    public void testStaleMate() {

        King myKing = new King(2,1,true,"King",true); //white King
        Knight myKnight = new Knight(1, 3, true, "Knight",true); //black Rook
        King enemyKing = new King(0,0,true,"King",false); //black King

        whiteChessSet.add(myKing);
        whiteChessSet.add(myKnight);

        blackChessSet.add(enemyKing);

        myChessBoard.initBoard(white,black);

        Game chessGame = new Game(myChessBoard, white, black);
        assertTrue(chessGame.isCheckMateOrStaleMate(myChessBoard, white, black) == 3);
    }
}
