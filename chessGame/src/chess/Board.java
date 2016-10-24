package chess;

import java.util.*;

/**
 * Created by lildk91 on 2016. 9. 6..
 */
public class Board {


    public Square[][] board = new Square[8][8];

    public Board(){
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                this.board[x][y] = new Square(x, y);
            }
        }
    }

    /**
     * Initializes the board by getting all the chess pieces that each player
     * have and putting them in each squares of the board.
     * @param white The white player.
     * @param black The black player.
     */
    public void initBoard(Player white, Player black){
        ArrayList<Pieces> whiteChessPieces = white.getMyChessPieces();
        ArrayList<Pieces> blackChessPieces = black.getMyChessPieces();

        for(int i = 0; i < whiteChessPieces.size(); i++){
            int squareXcoord = whiteChessPieces.get(i).getxCoord();
            int squareYcoord = whiteChessPieces.get(i).getyCoord();
            this.board[squareXcoord][squareYcoord].piece = whiteChessPieces.get(i);
            this.board[squareXcoord][squareYcoord].xCoord = squareXcoord;
            this.board[squareXcoord][squareYcoord].yCoord = squareYcoord;
        }

        for(int i = 0; i < blackChessPieces.size(); i++){
            int squareXcoord = blackChessPieces.get(i).getxCoord();
            int squareYcoord = blackChessPieces.get(i).getyCoord();
            this.board[squareXcoord][squareYcoord].piece = blackChessPieces.get(i);
            this.board[squareXcoord][squareYcoord].xCoord = squareXcoord;
            this.board[squareXcoord][squareYcoord].yCoord = squareYcoord;
        }
    }

}
