package chess;

/**
 * Created by lildk91 on 2016. 9. 3..
 */
public abstract class Pieces {
    private int xCoord;
    private int yCoord;
    private boolean isAvailable;
    private String typeOfPiece;
    private boolean isWhite;

    //Constructor
    public Pieces(int x, int y, boolean isAvailable, String typeOfPiece, boolean isWhite){
        this.xCoord = x;
        this.yCoord = y;
        this.isAvailable = isAvailable;
        this.typeOfPiece = typeOfPiece;
        this.isWhite = isWhite;
    }

    /*
        Getters and Setters
     */
    public boolean isAvailable(){
        return isAvailable;
    }

    public void setIsAvaiable(boolean isAvaiable){
        this.isAvailable = isAvaiable;
    }

    public int getxCoord(){
        return xCoord;
    }

    public void setxCoord(int xCoord){
        this.xCoord = xCoord;
    }

    public int getyCoord(){
        return yCoord;
    }

    public void setyCoord(int yCoord){
        this.yCoord = yCoord;
    }

    public String getTypeOfPiece(){
        return typeOfPiece;
    }

    public void setTypeOfPiece(String typeOfPiece){
        this.typeOfPiece = typeOfPiece;
    }

    public boolean isWhite(){
        return isWhite;
    }

    public void setIsWhite(boolean isWhite){
        this.isWhite = isWhite;
    }

    /**
     * Check if there is a piece in the way from moving to the destination square.
     * @param currSquare the current position of the piece.
     * @param destSquare the destination position of the piece.
     * @param myChessBoard chessBoard of the game.
     * @param isDiag boolean value if the piece is moving diagonally
     * @return boolean if there are any pieces in the path.
     */
    public boolean isPieceInTheWay(Square currSquare, Square destSquare, Board myChessBoard, boolean isDiag){
        int currX = currSquare.xCoord;
        int currY = currSquare.yCoord;
        int destX = destSquare.xCoord;
        int destY = destSquare.yCoord;

        if(isDiag){
            return checkDiag(myChessBoard, currX, currY, destX, destY);
        }else{
            return checkVertAndHori(myChessBoard, currX, currY, destX, destY);
        }
    }

    /**
     * Helper function checking the diagnol movement.
     * @param myChessBoard chessBoard of the game.
     * @param currX x-coordinate of current position.
     * @param currY y-coordinate of current position.
     * @param destX x-coordinate of destination position.
     * @param destY y-coordinate of destination position.
     * @return boolean if there is a piece in the diagnol path.
     */
    public Boolean checkDiag(Board myChessBoard, int currX, int currY, int destX, int destY) {
        boolean topRight = currX > destX && currY < destY;
        boolean topLeft = currX > destX && currY > destY;
        boolean botRight = currX < destX && currY < destY;
        boolean botLeft = currX < destX && currY > destY;

        for(int i  = 1; i < Math.abs(currX - destX); i++){

            if(topRight && myChessBoard.board[currX - i][currY + i].isOccupied()){
                return true;
            }
            if(topLeft && myChessBoard.board[currX - i][currY - i].isOccupied()){
                return true;
            }
            if(botRight && myChessBoard.board[currX + i][currY + i].isOccupied()){
                return true;
            }
            if(botLeft && myChessBoard.board[currX + i][currY - i].isOccupied()){
                return true;
            }
        }

        return false;
    }

    /**
     * Helper function checking the vertical and horizontal movement.
     * @param myChessBoard chessBoard of the game.
     * @param currX x-coordinate of current position.
     * @param currY y-coordinate of current position.
     * @param destX x-coordinate of destination position.
     * @param destY y-coordinate of destination position.
     * @return boolean if there is a piece in the horizontal/vertical path.
     */
    public Boolean checkVertAndHori(Board myChessBoard, int currX, int currY, int destX, int destY) {

        boolean upward = currX > destX;
        boolean downward = currX < destX;
        boolean right = destY > currY;
        boolean left = currY > destY;

        if(currY == destY) { //Vertical
            for (int i = 1; i < Math.abs(currX - destX); i++) {
                if (upward && myChessBoard.board[currX - i][currY].isOccupied()) {
                    return true;
                }
                if (downward && myChessBoard.board[currX + i][currY].isOccupied()) {
                    return true;
                }
            }
        }else { //Horizontal
            for (int i = 1; i < Math.abs(currY - destY); i++) {
                if (right && myChessBoard.board[currX][currY + i].isOccupied()) {
                    return true;
                }
                if (left && myChessBoard.board[currX][currY - i].isOccupied()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checking if pieces is withing the boundaries of the board.
     * @param currSquare the current position of the piece.
     * @param destSquare the destination position of the piece.
     * @param myChessBoard chessBoard of the game.
     * @return boolean if the piece is able to move to the destination square.
     */
    public boolean validMovement(Square currSquare, Square destSquare, Board myChessBoard) {
        int currX = currSquare.xCoord;
        int currY = currSquare.yCoord;
        int destX = destSquare.xCoord;
        int destY = destSquare.yCoord;

        if(currX == destX && currY == destY){ //If moving to itself,
            return false;
        } else if (destX > 7 || destY > 7 || destX < 0 || destY < 0 || currX > 7 || currY > 7 || currX < 0 || currY < 0 ) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * checking if the piece has a different color than the parameter piece.
     * @param otherPiece the other piece to compare against.
     * @return boolean if the piece has a different color with otherPiece.
     */
    public boolean isOppositeColor(Pieces otherPiece){
        if(this.isWhite() && otherPiece.isWhite()){
            return false;
        }else if(this.isWhite() && !otherPiece.isWhite()){
            return true;
        }else if(!this.isWhite() && otherPiece.isWhite()){
            return true;
        }else{
            return false;
        }
    }
}

