package chess;

/**
 * Created by lildk91 on 2016. 9. 4..
 */
public class Rook extends Pieces{

    public Rook(int xCoord, int yCoord, boolean isAvailable, String typeOfPiece, boolean isWhite){
        super(xCoord, yCoord, isAvailable, typeOfPiece, isWhite);
    }

    /**
     * Check to see if Rook can move to the destination square.
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

        //Vertical
        boolean isMoveVertical = Math.abs(currX - destX) > 0 && currY == destY;

        //Horizontal
        boolean isMoveHorizontal = currX == destX && Math.abs(currY - destY) > 0;


        if (!super.validMovement (currSquare, destSquare, myChessBoard)) { //if destination not within the board,
            return false;
        }else if((isMoveVertical || isMoveHorizontal) && (!destSquare.isOccupied() || currSquare.piece.isOppositeColor(destSquare.piece))){
            if(Math.abs(currX - destX) > 1 || Math.abs(currY - destY) > 1) { //check if there are any pieces in the way
                return !this.isPieceInTheWay(currSquare, destSquare, myChessBoard, false);
            }else{
                return true;
            }
        }else {
            return false;
        }
    }
}
