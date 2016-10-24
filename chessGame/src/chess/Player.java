package chess; /**
 * Created by lildk91 on 2016. 9. 7..
 */

import java.util.*;

public class Player {
    public boolean isWhitePlayer;

    private ArrayList<Pieces> myChessPieces = new ArrayList();
    private ArrayList<Pieces> capturedPieces = new ArrayList();

    public Player(boolean isWhitePlayer){
        this.isWhitePlayer = isWhitePlayer;
    }

    /**
     * Initializing the chess set by adding all the pieces that each player has in the beginning of the game.
     * @param widthOfBoard width of the chess board.
     * @param heightOfBoard height of the chess board.
     */
    public void initChessSet(int widthOfBoard, int heightOfBoard, boolean custom){
        //white = bottom
        if(this.isWhitePlayer){
            this.myChessPieces.add(new King(7, 4, true, "King", true));
            //pawns
            for(int i = 0; i < 8; i++){
                this.myChessPieces.add(new Pawn(6, i, true, "Pawn", true, true));
            }
            //Rook
            this.myChessPieces.add(new Rook(7, 0, true, "Rook", true));
            this.myChessPieces.add(new Rook(7, 7, true, "Rook", true));
            //Knight
            this.myChessPieces.add(new Knight(7, 1, true, "Knight", true));
            this.myChessPieces.add(new Knight(7, 6, true, "Knight", true));
            //Bishop
            this.myChessPieces.add(new Bishop(7, 2, true, "Bishop", true));
            this.myChessPieces.add(new Bishop(7, 5, true, "Bishop", true));
            //Queen
            this.myChessPieces.add(new Queen(7, 3, true, "Queen", true));
            if(custom) {
                this.myChessPieces.add(new David(5, 3, true, "David", true));
                this.myChessPieces.add(new Hyo(5, 4, true, "Hyo", true));
            }
        }else{//black = top
            //King
            this.myChessPieces.add(new King(0, 4, true, "King", false));
            //pawns
            for(int i = 0; i < 8; i++){
                this.myChessPieces.add(new Pawn(1, i, true, "Pawn", false, true));
            }
            //Rook
            this.myChessPieces.add(new Rook(0, 0, true, "Rook", false));
            this.myChessPieces.add(new Rook(0, 7, true, "Rook", false));
            //Knight
            this.myChessPieces.add(new Knight(0, 1, true, "Knight", false));
            this.myChessPieces.add(new Knight(0, 6, true, "Knight", false));
            //Bishop
            this.myChessPieces.add(new Bishop(0, 2, true, "Bishop", false));
            this.myChessPieces.add(new Bishop(0, 5, true, "Bishop", false));
            //Queen
            this.myChessPieces.add(new Queen(0, 3, true, "Queen", false));
            if(custom) {
                this.myChessPieces.add(new David(2, 4, true, "David", false));
                this.myChessPieces.add(new Hyo(2, 3, true, "Hyo", false));
            }
        }
    }

    public ArrayList<Pieces> getMyChessPieces(){
        return myChessPieces;
    }

    public ArrayList<Pieces> getCapturedPieces(){
        return capturedPieces;
    }
}
