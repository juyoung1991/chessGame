package chess;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lildk91 on 2016. 9. 14..
 */
public class Hyo extends Pieces{
    public Hyo(int xCoord, int yCoord, boolean isAvailable, String typeOfPiece, boolean isWhite){
        super(xCoord, yCoord, isAvailable, typeOfPiece, isWhite);
    }

    /**
     * This functions checks if Hyo can move to the destination square.
     * @param currSquare the current position of the piece.
     * @param destSquare the destination position of the piece.
     * @param myChessBoard chessBoard of the game.
     * @return boolean if the piece is able to move to the destination square.
     */
    @Override
    public boolean validMovement(Square currSquare, Square destSquare, Board myChessBoard) {
        int currX = currSquare.xCoord;
        int currY = currSquare.yCoord;
        int destX = destSquare.xCoord;
        int destY = destSquare.yCoord;
        Pieces currPiece = currSquare.piece;
        Pieces destPiece = destSquare.piece;


        boolean isMoveVertical = Math.abs(currX - destX) == 2 && currY == destY;

        //Horizontal
        boolean isMoveHorizontal = currX == destX && Math.abs(currY - destY) == 2;

        if (!super.validMovement(currSquare, destSquare, myChessBoard)){ //if destination not within the board,
            return false;
        }else if((isMoveVertical|| isMoveHorizontal ) && (!destSquare.isOccupied() || currPiece.isOppositeColor(destPiece))){
            return true;
        }else {
            return false;
        }
    }

}