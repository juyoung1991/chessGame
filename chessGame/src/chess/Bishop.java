package chess;

/**
 * Created by lildk91 on 2016. 9. 4..
 */
public class Bishop extends Pieces{

    public Bishop(int xCoord, int yCoord, boolean isAvailable, String typeOfPiece, boolean isWhite){
        super(xCoord, yCoord, isAvailable, typeOfPiece, isWhite);
    }

    /**
     * This functions checks if Bishop can move to the destination square.
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
        //Diagnol
        boolean isMoveDiag = Math.abs(currY - destY) == Math.abs(currX - destX);

        if (!super.validMovement(currSquare, destSquare, myChessBoard)){ //if destination not within the board,
            return false;
        }else if( isMoveDiag && (!destSquare.isOccupied() || currPiece.isOppositeColor(destPiece))){
            if(Math.abs(currX - destX) > 1 && Math.abs(currY - destY) > 1){
                return !this.isPieceInTheWay(currSquare, destSquare, myChessBoard, true);
            }
            return true;
        }else{
            return false;
        }
    }
}
