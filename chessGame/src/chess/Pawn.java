package chess;

/**
 * Created by lildk91 on 2016. 9. 4..
 */
public class Pawn extends Pieces{
/**chess.Pawn can move forward one step
 * But it can move two steps only on its first move
 * Can capture other one step diagnoally
 */

    public Pawn(int xCoord, int yCoord, boolean isAvailable, String typeOfPiece, boolean isWhite, boolean isFirstTime){
        super(xCoord, yCoord, isAvailable, typeOfPiece, isWhite);
    }

    /**
     * Check to see if Pawn can move to the destination square.
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

        //Move Forward one step
        boolean isMoveForwardOneWhite = currX == destX + 1 && currY == destY && this.isWhite();
        boolean isMoveForwardOneBlack = currX == destX - 1 && currY == destY && !this.isWhite();

        //Move diagnally when there is an opponent piece
        //White
        boolean isMoveDiagWhite = currX == destX + 1 && Math.abs(currY - destY) == 1 && this.isWhite();

        //Black
        boolean isMoveDiagBlack = currX == destX -1 && Math.abs(currY - destY) == 1 && !this.isWhite();


        if (!super.validMovement(currSquare, destSquare, myChessBoard)){ //if destination not within the board,
            return false;
        }else if((isMoveForwardOneWhite || isMoveForwardOneBlack) && !destSquare.isOccupied() ){
            return true;
        }else if((isMoveDiagBlack || isMoveDiagWhite) && destSquare.isOccupied() && currPiece.isOppositeColor(destPiece)){
            return true;
        } else{
            return false;
        }
    }
}
