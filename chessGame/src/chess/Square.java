package chess;

/**
 * Created by lildk91 on 2016. 9. 5..
 */
public class Square {
    public int xCoord = 0;
    public int yCoord = 0;
    public Pieces piece;

    public Square(int x, int y){
        this.xCoord = x;
        this.yCoord = y;
        this.piece = null;
    }

    /**
     * Check to see him the piece can be occupied
     * @param destSquare the square to occupy.
     * @return boolean if the piece can be occupied.
     */
    public boolean canOccupy(Square destSquare){
        if(destSquare.piece == null){
            return true;
        }else{
            return this.piece.isOppositeColor(destSquare.piece);
        }
    }

    /**
     * Occupy the square and capture the opponent piece.
     * @param destSquare the square to occupy.
     * @return The captured piece.
     */
    public Pieces occupyIt(Square destSquare){
        //If the square isn't occupied, occupy it!
        if (destSquare.piece == null) {
            destSquare.piece = this.piece;
            destSquare.piece.setxCoord(destSquare.xCoord);
            destSquare.piece.setyCoord(destSquare.yCoord);
            this.makeVacant();
            return null;
        } else {
            //First, get rid of of the currently occupying piece
            Pieces capturedPiece = destSquare.piece;
            destSquare.piece.setIsAvaiable(false);
            //Set it to the new piece
            destSquare.piece = this.piece;
            destSquare.piece.setxCoord(destSquare.xCoord);
            destSquare.piece.setyCoord(destSquare.yCoord);
            this.makeVacant();
            return capturedPiece;
        }
    }

    /**
     * Check to see if the square is occupied.
     * @return boolean if the square is occupied or not.
     */
    public boolean isOccupied(){
        if(this.piece != null){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Make the square empty.
     */
    public void makeVacant(){
        this.piece = null;
    }
}
