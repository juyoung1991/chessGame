package chess;

/**
 * Created by lildk91 on 2016. 9. 4..
 */
public class Knight extends Pieces{

    public Knight(int xCoord, int yCoord, boolean isAvailable, String typeOfPiece, boolean isWhite){
        super(xCoord, yCoord, isAvailable, typeOfPiece, isWhite);
    }

    /**
     * Check to see if Knight can move to the destination square.
     * @param currSquare the current position of the piece.
     * @param destSquare the destination position of the piece.
     * @param myChessBoard chessBoard of the game.
     * @return boolean if the piece is able to move to the destination square.
     */
    @Override
    public boolean validMovement(Square currSquare, Square destSquare, Board myChessBoard){

        int currX = currSquare.xCoord;
        int currY = currSquare.yCoord;
        int destX = destSquare.xCoord;
        int destY = destSquare.yCoord;
        Pieces currPiece = currSquare.piece;
        Pieces destPiece = destSquare.piece;

        //Upward movement
        boolean knightHorizontal = (Math.abs(currY - destY) == 1) && (Math.abs(currX - destX) == 2);
        //Right Movement
        boolean knightVertical = (Math.abs(currY - destY) == 2) && (Math.abs(currX - destX) == 1);

        if (!super.validMovement(currSquare, destSquare, myChessBoard)){ //if destination not within the board,
            return false;
        }else if((knightHorizontal|| knightVertical) && (!destSquare.isOccupied() || currPiece.isOppositeColor(destPiece))){
            return true;
        }else {
            return false;
        }
    }
}
