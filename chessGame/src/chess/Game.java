package chess;
import java.lang.reflect.Array;
import java.util.*;
/**
 * Created by lildk91 on 2016. 9. 8..
 */
public class Game {
    private Board myChessBoard;
    private Player whitePlayer;
    private Player blackPlayer;

    public Game(Board chessBoard, Player white, Player black){
        this.myChessBoard = chessBoard;
        this.whitePlayer = white;
        this.blackPlayer = black;
    }

    public Board getBoard(){
        return myChessBoard;
    }

    public void setBoard(Board chessBoard){
        this.myChessBoard = chessBoard;
    }

    public Player getWhitePlayer(){
        return whitePlayer;
    }

    public void setWhitePlayer(Player white){
        this.whitePlayer = white;
    }

    public Player getBlackPlayer(){
        return blackPlayer;
    }

    public void setBlackPlayer(Player black){
        this.blackPlayer = black;
    }

    /**
     * Checks if the king is in check
     * @param chessBoard chessboard of the game.
     * @param myPlayer The player checking if their king is in check.
     * @param enemy The opponent player.
     * @return boolean if the king is in check or not.
     */
    public boolean isKingInCheck(Board chessBoard, Player myPlayer, Player enemy){

        ArrayList<Pieces> myPieces = myPlayer.getMyChessPieces();
        ArrayList<Pieces> enemyPieces = enemy.getMyChessPieces();
        //King will always be in index0
        int xCoordKing = myPieces.get(0).getxCoord();
        int yCoordKing = myPieces.get(0).getyCoord();
        Square kingSquare = chessBoard.board[xCoordKing][yCoordKing];
        //Check if my King is threatened
        for(int i = 0;i < enemyPieces.size(); i++){
            int enemyPieceXcoord = enemyPieces.get(i).getxCoord();
            int enemyPieceYcoord = enemyPieces.get(i).getyCoord();
            Square enemySquare = chessBoard.board[enemyPieceXcoord][enemyPieceYcoord];
            //If any of the opponent pieces is reachable to my king then it's in check
            if(enemyPieces.get(i).validMovement(enemySquare, kingSquare, chessBoard)){
                return true;
            }
        }
        return false;
    }

    /**
     * Check if it's a checkmate or stalemate
     * @param chessBoard chessboard of the game.
     * @param myPlayer The player checking if they are in checkmate.
     * @param enemy The opponent player.
     * @return 1 if it's in checkmate, 0 if it's in stalemate, 2 if it can be avoidable, 3 if it's not in check
     */
    public int isCheckMateOrStaleMate(Board chessBoard, Player myPlayer, Player enemy){
        //try to move the king to every possible moves he can take and see him it's still in check or not
        if(isKingInCheck(chessBoard, myPlayer, enemy)) {
            if(!canPreventLossByMovingKing(chessBoard, myPlayer, enemy) && !canPreventLossByBlocking(chessBoard, myPlayer, enemy)){
                return 1; //checkmate
            }else{
                return 2; //avoidable
            }
        }else{
            if(!canPreventLossByMovingKing(chessBoard, myPlayer, enemy) && !canPreventLossByBlocking(chessBoard, myPlayer, enemy)){
                return 0; //stalemate
            }else{
                return 3; //not in check
            }
        }
    }

    /**
     * Checks if the king is able to move to avoid ending condition.
     * @param chessBoard the chessboard of the game.
     * @param myPlayer The player checking if they are in checkmate or stalemate.
     * @param enemy The opponent player.
     * @return boolean if myPlayer can avoid the ending condition or not by moving the king.
     */
    public boolean canPreventLossByMovingKing(Board chessBoard, Player myPlayer, Player enemy) {
        ArrayList<Pieces> myPieces = myPlayer.getMyChessPieces();
        ArrayList<Pieces> enemyPieces = enemy.getMyChessPieces();

        int xCoordMyKing = myPieces.get(0).getxCoord();
        int yCoordMyKing = myPieces.get(0).getyCoord();

        Pieces myKing = myPieces.get(0);
        Square kingSquare = chessBoard.board[xCoordMyKing][yCoordMyKing];

        Square destKingSquare;
        //Top
        if(xCoordMyKing > 0) {
            destKingSquare = chessBoard.board[xCoordMyKing - 1][yCoordMyKing];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing - 1, yCoordMyKing, chessBoard);
            }
        }

        if(xCoordMyKing > 0 && yCoordMyKing < 7){
            //TopRight
            destKingSquare = chessBoard.board[xCoordMyKing - 1][yCoordMyKing + 1];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing - 1, yCoordMyKing + 1, chessBoard);
            }
        }
        //Bot
        if(xCoordMyKing < 7) {
            destKingSquare = chessBoard.board[xCoordMyKing + 1][yCoordMyKing];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing + 1, yCoordMyKing, chessBoard);
            }
        }
        //Right
        if(yCoordMyKing < 7) {
            destKingSquare = chessBoard.board[xCoordMyKing][yCoordMyKing + 1];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing, yCoordMyKing + 1, chessBoard);
            }
        }

        //Left
        if(yCoordMyKing > 0) {
            destKingSquare = chessBoard.board[xCoordMyKing][yCoordMyKing - 1];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing, yCoordMyKing - 1, chessBoard);
            }
        }
        //BotLeft
        if(xCoordMyKing < 7 && yCoordMyKing > 0){
            destKingSquare = chessBoard.board[xCoordMyKing + 1][yCoordMyKing - 1];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing + 1, yCoordMyKing - 1, chessBoard);
            }
        }
        //TopLeft
        if(yCoordMyKing > 0 && xCoordMyKing > 0) {
            destKingSquare = chessBoard.board[xCoordMyKing - 1][yCoordMyKing - 1];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing - 1, yCoordMyKing - 1, chessBoard);
            }
        }

        //BotRight
        if(xCoordMyKing < 7 && yCoordMyKing < 7) {
            destKingSquare = chessBoard.board[xCoordMyKing + 1][yCoordMyKing + 1];
            if (myKing.validMovement(kingSquare, destKingSquare, chessBoard)) {
                return canWeMoveToAvoidCheck(myPlayer, enemy, xCoordMyKing, yCoordMyKing, xCoordMyKing + 1, yCoordMyKing + 1, chessBoard);
            }
        }


        return false;
    }

    /**
     * Checks if ending condition can be prevented by blocking the enemy's piece.
     * @param chessBoard the chessboard of the game.
     * @param myPlayer The player checking if they are in checkmate or stalemate.
     * @param enemy The opponent player.
     * @return boolean if endition condition can be prevented by moving myPlayer's pieces.
     */
    public boolean canPreventLossByBlocking(Board chessBoard, Player myPlayer, Player enemy){
        //Get all the pieces that is able to capture the king and get all the coordinates that can be intercepted to save the king.
        ArrayList<Integer> checkThisPathX = new ArrayList<Integer>();
        ArrayList<Integer> checkThisPathY = new ArrayList<Integer>();

        ArrayList<Pieces> myPieces = myPlayer.getMyChessPieces();
        ArrayList<Pieces> enemyPieces = enemy.getMyChessPieces();

        int xCoordMyKing = myPieces.get(0).getxCoord();
        int yCoordMyKing = myPieces.get(0).getyCoord();

        Pieces myKing = myPieces.get(0);
        Square kingSquare = chessBoard.board[xCoordMyKing][yCoordMyKing];

        storeXYpath(chessBoard, checkThisPathX, checkThisPathY, enemyPieces, xCoordMyKing, yCoordMyKing, kingSquare);

        //Now I have all the coordinates I need. Go through all of them and check if any of the white pieces can actually go to that coordinates.
        for(int i = 0; i < myPieces.size(); i++){
            int xcoord = myPieces.get(i).getxCoord();
            int ycoord = myPieces.get(i).getyCoord();
            Square currSquare = chessBoard.board[xcoord][ycoord];
            for(int j = 0; j < checkThisPathX.size(); j++){
                Square destSquare = chessBoard.board[checkThisPathX.get(j)][checkThisPathY.get(j)];
                if(currSquare.piece.validMovement(currSquare, destSquare, chessBoard)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Helper function to store X and Y coordinates of all the squares that leads to the king from all the enemy pieces;
     * @param chessBoard The chessboard of the game.
     * @param checkThisPathX Arraylist that stores all the x coordinates.
     * @param checkThisPathY Arraylist that stores all the y coordinates.
     * @param enemyPieces List of all the enemy pieces that is available.
     * @param xCoordMyKing X-coordinate of the king that is being checked.
     * @param yCoordMyKing Y-coordinate of the king that is being checked.
     * @param kingSquare The square in which the king being checked is in.
     */
    public void storeXYpath(Board chessBoard, ArrayList<Integer> checkThisPathX, ArrayList<Integer> checkThisPathY, ArrayList<Pieces> enemyPieces, int xCoordMyKing, int yCoordMyKing, Square kingSquare) {
        for (int i = 0; i < enemyPieces.size(); i++) {
            int opponentXcoord = enemyPieces.get(i).getxCoord();
            int opponentYcoord = enemyPieces.get(i).getyCoord();
            Square currSquare = chessBoard.board[opponentXcoord][opponentYcoord];

            if (enemyPieces.get(i).validMovement(currSquare, kingSquare, chessBoard)) { //The piece is able to capture the king
                if (Math.abs(opponentXcoord - xCoordMyKing) == Math.abs(opponentYcoord - yCoordMyKing)) { //if it's diagnol
                    for (int j = 1; j < Math.abs(opponentXcoord - xCoordMyKing); j++) {
                        checkThisPathX.add(j + Math.min(opponentXcoord, xCoordMyKing));
                        checkThisPathY.add(j + Math.min(opponentYcoord, yCoordMyKing));
                    }
                } else {
                    //Vertical
                    if (opponentYcoord == yCoordMyKing) {
                        for (int j = 1; j < Math.abs(opponentXcoord - xCoordMyKing); j++) {
                            checkThisPathX.add(j + Math.min(opponentXcoord, xCoordMyKing));
                            checkThisPathY.add(yCoordMyKing);
                        }
                    } else {
                        for (int j = 1; j < Math.abs(opponentYcoord - yCoordMyKing); j++) {
                            checkThisPathX.add(xCoordMyKing);
                            checkThisPathY.add(j + Math.min(opponentYcoord, yCoordMyKing));
                        }
                    }
                }
            }
        }
    }

    /**
     * Checking to see if a check can be avoided by simply moving the king
     * @param myPlayer The player whose king is being moved.
     * @param enemy The opponent player.
     * @param xCoordKing X-coordinate of the king being moved.
     * @param yCoordKing Y-coordinate of the king being moved.
     * @param newXcoordKing The new x-coordinate of the king to be moved.
     * @param newYcoordKing The new y-coordinate of the king to be moved.
     * @param chessBoard The chessboard of the game.
     * @return boolean if moving the king can prevent check.
     */
    public boolean canWeMoveToAvoidCheck(Player myPlayer, Player enemy, int xCoordKing, int yCoordKing, int newXcoordKing, int newYcoordKing, Board chessBoard){

        Pieces myKing = myPlayer.getMyChessPieces().get(0);
        myKing.setxCoord(newXcoordKing);
        myKing.setyCoord(newYcoordKing);
        chessBoard.board[xCoordKing][yCoordKing].piece = null;
        chessBoard.board[newXcoordKing][newYcoordKing].piece = myKing;
        if(isKingInCheck(chessBoard, myPlayer, enemy)){
            //if it's still in check we can't make this move so move the king back.
            myKing.setxCoord(xCoordKing);
            myKing.setyCoord(yCoordKing);
            chessBoard.board[newXcoordKing][newYcoordKing].piece = null;
            chessBoard.board[xCoordKing][yCoordKing].piece = myKing;
            return false;
        }else{
            //Yes we can avoid it. Move the piece if you want to.
            myKing.setxCoord(xCoordKing);
            myKing.setyCoord(yCoordKing);
            chessBoard.board[newXcoordKing][newYcoordKing].piece = null;
            chessBoard.board[xCoordKing][yCoordKing].piece = myKing;
            return true;
        }
    }

}
