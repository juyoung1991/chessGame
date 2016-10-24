package GUI;

import chess.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;

import static javax.swing.SwingUtilities.isLeftMouseButton;
import static javax.swing.SwingUtilities.isRightMouseButton;

/**
 * Created by lildk91 on 2016. 9. 15..
 * https://www.youtube.com/watch?v=w9HR4VJ8DAw
 */
public class ChessBoard extends JPanel{

    private JFrame gameFrame;
    private BoardPanel boardPanel;
    private CapturedPieceWhite captured_panel_white;
    private CapturedPieceBlack captured_panel_black;
    private Board chessBoard;
    private Player white;
    private Player black;
    private int currPlayer; //0 : White, 1: Black
    private ArrayList<String> username_history;
    private String white_username;
    private String black_username;
    private int white_point;
    private int black_point;
    private boolean white_king_check;
    private boolean black_king_check;
    private Game chess_game;

    //UNDO
    //previous source square
    private int prev_curr_xcoord;
    private int prev_curr_ycoord;
    private Pieces prev_curr_piece;

    //previsou dest square
    private int prev_dest_xcoord;
    private int prev_dest_ycoord;
    private Pieces prev_dest_piece;


    private Square currSquare;
    private Square destSquare;
    private Pieces myClickedPiece;
    private Color myCurrSquareColor;

    private static Dimension outer_frame_dim = new Dimension(800, 800);
    private static Dimension board_dimension = new Dimension(400, 350);
    private static Dimension square_dimension = new Dimension(10, 10);

    private static String imagePath = "chess Pieces/";

    public ChessBoard() {
        //Player initializing
        this.white = new Player(true);
        this.black = new Player(false);
        white.initChessSet(8,8, false);
        black.initChessSet(8,8, false);
        currPlayer = 0;
        white_point = 0;
        black_point = 0;
        white_king_check = false;
        black_king_check = false;
        username_history = new ArrayList<String>();

        //Board initializing
        this.chessBoard = new Board();
        chessBoard.initBoard(white, black);

        //Game logic init
        chess_game = new Game(chessBoard, white, black);

        //Captured_piece_panel
        this.captured_panel_white = new CapturedPieceWhite();
        this.captured_panel_black = new CapturedPieceBlack();


        //Game frame
        this.gameFrame = new JFrame("David's Chess game");
        this.gameFrame.setLayout(new BorderLayout());
        this.gameFrame.setSize(outer_frame_dim);
        this.gameFrame.add(this.captured_panel_black, BorderLayout.NORTH);
        this.gameFrame.add(this.captured_panel_white, BorderLayout.SOUTH);
        this.boardPanel = new BoardPanel();

        //Menu bar
        final JMenuBar gameMenuBar = new JMenuBar();
        createMenuBar(gameMenuBar);
        this.gameFrame.setJMenuBar(gameMenuBar);

        //we need to get user names
        getUserName();
        gameFrame.setVisible(true);
    }

    private void createMenuBar(JMenuBar gameMenuBar) {
        gameMenuBar.add(createFileMenu());
    }

    /**
     * Reset function that reinitializes everything to the starting point of the game.
     */
    private void reset(){
        //gameFrame.setVisible(false);
        currPlayer = 0;
        white = new Player(true);
        black = new Player(false);
        white.initChessSet(8,8, false);
        black.initChessSet(8,8, false);
        chessBoard = new Board();
        chessBoard.initBoard(white, black);
        chess_game = new Game(chessBoard, white, black);
        captured_panel_white = new CapturedPieceWhite();
        captured_panel_black = new CapturedPieceBlack();
        boardPanel.drawBoard(chessBoard);
        boardPanel = new BoardPanel();
        gameFrame.add(this.captured_panel_black, BorderLayout.NORTH);
        gameFrame.add(this.captured_panel_white, BorderLayout.SOUTH);
        captured_panel_white.setUserNamePoint(white_username, white_point);
        captured_panel_black.setUserNamePoint(black_username, black_point);
        gameFrame.setVisible(true);
    }

    /**
     * Creates the file menu that toggles with start game, undo, restart, forfeit and exit.
     * @return returns the JMenu with all its menu files
     */
    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        //
        addMenuItemStart("Start Game", fileMenu);
        addMenuItemStartCustom("Start Game (Custom)", fileMenu);
        addMenuItemUndo("Undo", fileMenu);
        addMenuItemRestart("Restart", fileMenu);
        addMenuItemForfeit("Forfeit", fileMenu);
        addMenuItemExit("Exit", fileMenu);
        return fileMenu;
    }

    /**
     * Add the 'start game' menuitem to the menu bar
     * @param menuItem String value of the name of the item
     * @param fileMenu The menu bar which adds this menu item.
     */
    private void addMenuItemStart(String menuItem, JMenu fileMenu) {

        JMenuItem item = new JMenuItem(menuItem);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                captured_panel_white.setUserNamePoint(white_username, white_point);
                captured_panel_black.setUserNamePoint(black_username, black_point);
                gameFrame.add(boardPanel, BorderLayout.CENTER);
                gameFrame.setVisible(true);
            }
        });
        fileMenu.add(item);
    }

    /**
     * Add the 'start game (Custom)' menuitem to the menu bar
     * @param menuItem String value of the name of the item
     * @param fileMenu The menu bar which adds this menu item.
     */
    private void addMenuItemStartCustom(String menuItem, JMenu fileMenu) {
        JMenuItem item = new JMenuItem(menuItem);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                currPlayer = 0;
                white = new Player(true);
                black = new Player(false);
                white.initChessSet(8,8, true);
                black.initChessSet(8,8, true);
                chessBoard = new Board();
                chessBoard.initBoard(white, black);
                chess_game = new Game(chessBoard, white, black);
                captured_panel_white = new CapturedPieceWhite();
                captured_panel_black = new CapturedPieceBlack();
                boardPanel.drawBoard(chessBoard);
                boardPanel = new BoardPanel();
                gameFrame.add(captured_panel_black, BorderLayout.NORTH);
                gameFrame.add(captured_panel_white, BorderLayout.SOUTH);
                captured_panel_white.setUserNamePoint(white_username, white_point);
                captured_panel_black.setUserNamePoint(black_username, black_point);
                gameFrame.add(boardPanel, BorderLayout.CENTER);
                gameFrame.setVisible(true);
            }
        });
        fileMenu.add(item);
    }

    /**
     * Add the 'Undo' menuitem to the menu bar
     * @param menuItem String value of the name of the item
     * @param fileMenu The menu bar which adds this menu item.
     */
    private void addMenuItemUndo(String menuItem, JMenu fileMenu) {
        JMenuItem item = new JMenuItem(menuItem);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                undo();
                captured_panel_white.setUserNamePoint(white_username, white_point);
                captured_panel_black.setUserNamePoint(black_username, black_point);
                captured_panel_black.addCapturedPieces(black);
                captured_panel_white.addCapturedPieces(white);
                boardPanel.drawBoard(chessBoard);
            }
        });
        fileMenu.add(item);
    }

    /**
     * Add the 'Restart' menuitem to the menu bar
     * @param menuItem String value of the name of the item
     * @param fileMenu The menu bar which adds this menu item.
     */
    private void addMenuItemRestart(String menuItem, JMenu fileMenu) {

        JMenuItem item = new JMenuItem(menuItem);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int yes_or_no = JOptionPane.YES_NO_OPTION;
                if(currPlayer == 0) {
                    if(JOptionPane.showConfirmDialog(null, "Does " + black_username + " agree?","Restart", yes_or_no) != 0){ //if it's no
                        return;
                    }
                }else{
                    if(JOptionPane.showConfirmDialog(null, "Does " + white_username + " agree?", "Restart", yes_or_no) != 0){
                        return;
                    }
                }

                reset();
                white_point = 0;
                black_point = 0;

            }
        });
        fileMenu.add(item);
    }

    /**
     * Add the 'Forfeit' menuitem to the menu bar
     * @param menuItem String value of the name of the item
     * @param fileMenu The menu bar which adds this menu item.
     */
    private void addMenuItemForfeit(String menuItem, JMenu fileMenu) {

        JMenuItem item = new JMenuItem(menuItem);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int yes_or_no = JOptionPane.YES_NO_OPTION;
                if(JOptionPane.showConfirmDialog(null, "Are you sure?","Forfeit", yes_or_no) != 0){ //if it's no
                    return;
                }else{
                    if(currPlayer == 0){
                        black_point++;
                    }else{
                        white_point++;
                    }
                }
                if(JOptionPane.showConfirmDialog(null, "Would you like to play again?","", yes_or_no) != 0){ //if it's no
                    JOptionPane.showMessageDialog(null, "Thank you for playing!");
                    System.exit(0);
                }else{
                    reset();
                }


            }
        });
        fileMenu.add(item);
    }

    /**
     * Add the 'Exit' menuitem to the menu bar
     * @param menuItem String value of the name of the item
     * @param fileMenu The menu bar which adds this menu item.
     */
    private void addMenuItemExit(String menuItem, JMenu fileMenu) {

        JMenuItem item = new JMenuItem(menuItem);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        fileMenu.add(item);
    }

    /**
     * Creates input dialog to get the user names.
     */
    public void getUserName(){
        String white = JOptionPane.showInputDialog(null, "Enter your username (White): ");
        while(username_history.contains(white)){
            white = JOptionPane.showInputDialog(null, "Username Exists. Enter your username (White): ");
        }
        white_username = white;
        username_history.add(white_username);

        String black = JOptionPane.showInputDialog(null, "Enter your username (Black): ");
        while(username_history.contains(black)){
            black = JOptionPane.showInputDialog(null, "Username Exists. Enter your username (Black): ");
        }
        black_username = black;
        username_history.add(black_username);

    }

    /**
     * Change the global variable currPlayer
     */
    public void changeCurrPlayer(){
        if(currPlayer == 0){
            currPlayer = 1;
        }else{
            currPlayer = 0;
        }
    }

    /**
     * Checks if the current turn is the right player.
     * @param xcoord X - coordinate of the clicked position.
     * @param ycoord Y - coordinate of the clicked position.
     * @return Boolean if it is the correct player's turn.
     */
    public boolean isCorrectPlayer(int xcoord, int ycoord){
        if(currPlayer == 0 && !chessBoard.board[xcoord][ycoord].piece.isWhite() && chessBoard.board[xcoord][ycoord].piece != null){
            JOptionPane.showMessageDialog(null, "It's "+white_username + "'s turn");
            currSquare = null;
            myClickedPiece = null;
            destSquare = null;
            return false;
        }else if(currPlayer == 1 && chessBoard.board[xcoord][ycoord].piece.isWhite() && chessBoard.board[xcoord][ycoord].piece != null){
            JOptionPane.showMessageDialog(null, "It's "+ black_username + "'s turn");
            currSquare = null;
            myClickedPiece = null;
            destSquare = null;
            return false;
        }else{
            return true;
        }
    }

    /**
     * This sets the piece back to its original position.
     */
    public void undo() {
        //set my curr_piece which will be in the dest square back to its original position
        prev_curr_piece.setxCoord(prev_curr_xcoord);
        prev_curr_piece.setyCoord(prev_curr_ycoord);
        chessBoard.board[prev_curr_xcoord][prev_curr_ycoord].piece = prev_curr_piece;

        if (prev_dest_piece != null) {
            prev_dest_piece.setxCoord(prev_dest_xcoord);
            prev_dest_piece.setyCoord(prev_dest_ycoord);
            //need to retrieve piece from the captured_pieces array too
            if(currPlayer == 0){ //which means the previous captured piece was a white piece retrieve it back from the black_captured_Set
                black.getCapturedPieces().remove(black.getCapturedPieces().size() - 1); //remove the last one
            }else{
                white.getCapturedPieces().remove(white.getCapturedPieces().size() - 1); //remove the last one
            }
        }
        chessBoard.board[prev_dest_xcoord][prev_dest_ycoord].piece = prev_dest_piece;
        changeCurrPlayer(); //change it back to the original player
    }

    private class BoardPanel extends JPanel {
        final ArrayList<SquarePanel> boardSquares;

        BoardPanel() {
            super(new GridLayout(8, 8));
            this.boardSquares = new ArrayList<SquarePanel>();
            //add a squarepanel to the arraylist and to the Boardpanel object which is a JPanel
            for (int i = 0; i < 8; i++) {
                for(int j = 0; j < 8; j++) {
                    final SquarePanel square = new SquarePanel(this, i, j);
                    this.boardSquares.add(square);
                    add(square);
                }
            }
            setPreferredSize(board_dimension);
            validate();

        }

        /**
         * Renders the boardpanel
         * @param chessBoard The board of the chess game
         */
        public void drawBoard(Board chessBoard){
            removeAll();
            for(int i = 0; i < boardSquares.size(); i++){
                boardSquares.get(i).drawSquare(chessBoard);
                add(boardSquares.get(i));
            }
            validate();
            repaint();
        }
    }


    private class SquarePanel extends JPanel {
        private int xcoord;
        private int ycoord;

        SquarePanel(final BoardPanel boardPanel, final int xcoord, final int ycoord) {
            super(new GridBagLayout());
            this.xcoord = xcoord;
            this.ycoord = ycoord;
            setPreferredSize(square_dimension);
            assignSquareColor();
            assignSquareIcon(chessBoard);
            addMouseListener(new MouseListener() {
                @Override
                /**
                 * Invoke when a mouse is clicked
                 */
                public void mouseClicked(MouseEvent mouseEvent) {
                    //When user accidentally clicked on the wrong piece re-do. Set everything to null.
                    if(isRightMouseButton(mouseEvent)){
                        currSquare = null;
                        myClickedPiece = null;
                        destSquare = null;
                    }else if(isLeftMouseButton(mouseEvent)){
                        //my first click

                        if(currSquare == null){
                            //if(!isCorrectPlayer(xcoord, ycoord))
                            if(!isCorrectPlayer(xcoord, ycoord)){
                                return;
                            }
                            //UNDO coordinates
                            prev_curr_xcoord = xcoord;
                            prev_curr_ycoord = ycoord;
                            prev_curr_piece = chessBoard.board[xcoord][ycoord].piece;
                            currSquare = chessBoard.board[xcoord][ycoord];
                            myClickedPiece = currSquare.piece;

                            destSquare = null;
                            //highlight selected currSquare
                            myCurrSquareColor = checkCurrSquareColor(currSquare);
                            setBackground(Color.GRAY);
                        }else{
                            prev_dest_xcoord = xcoord;
                            prev_dest_ycoord = ycoord;
                            prev_dest_piece = chessBoard.board[xcoord][ycoord].piece;
                            destSquare = chessBoard.board[xcoord][ycoord];
                            if(myClickedPiece.validMovement(currSquare, destSquare, chessBoard)){
                                if(currPlayer == 0) {
                                    Pieces captured_piece = currSquare.occupyIt(destSquare);
                                    if(chess_game.isKingInCheck(chessBoard, white, black)) { //ERROR because the king isn't actually moved unless i call occupyIt
                                        JOptionPane.showMessageDialog(null, "Your king is still in check!");
                                        undo(); //move it back
                                    }else {
                                        if (captured_piece != null) {
                                            //System.out.printf("black piece added to white_captured!");
                                            white.getCapturedPieces().add(captured_piece);
                                        }
                                        changeCurrPlayer();
                                    }
                                }else{
                                    Pieces captured_piece = currSquare.occupyIt(destSquare);
                                    if(chess_game.isKingInCheck(chessBoard, black, white)){
                                        JOptionPane.showMessageDialog(null, "Your king is still in check!");
                                    }else {
                                        if (captured_piece != null) {
                                            //System.out.printf("white piece added to black_captured!");
                                            black.getCapturedPieces().add(captured_piece);
                                        }
                                        changeCurrPlayer();
                                    }
                                }
                                //TODO add this move to the move log so we can implement 'un-do'
                            }else{
                                JOptionPane.showMessageDialog(null, "Invalid Move!");
                            }
                            //set it back to my original color
                            boardPanel.boardSquares.get(ycoord+(8*xcoord)).setBackground(myCurrSquareColor);
                            currSquare = null;
                            destSquare = null;
                            myClickedPiece = null;
                            myCurrSquareColor = null;
                            if(currPlayer == 0){ //if it's white's turn now,
                                if(chess_game.isCheckMateOrStaleMate(chessBoard, white, black) == 1){//checkmate (white lose)
                                    JOptionPane.showMessageDialog(null, "CheckMate! Good Job" + black_username + "!");
                                    black_point++;
                                    reset();
                                }else if(chess_game.isCheckMateOrStaleMate(chessBoard, white, black) == 0){
                                    JOptionPane.showMessageDialog(null, "StaleMate!");
                                    reset();
                                }else if(chess_game.isCheckMateOrStaleMate(chessBoard, white, black) == 2){ //king in check
                                    JOptionPane.showMessageDialog(null, white_username + "'s King is in Check");
                                }
                            }else{
                                if(chess_game.isCheckMateOrStaleMate(chessBoard, black, white) == 1){//checkmate (black lose)
                                    JOptionPane.showMessageDialog(null, "CheckMate! Good Job" + white_username + "!");
                                    white_point++;
                                    reset();
                                }else if(chess_game.isCheckMateOrStaleMate(chessBoard, black, white) == 0){
                                    JOptionPane.showMessageDialog(null, "StaleMate!");
                                    reset();
                                }else if(chess_game.isCheckMateOrStaleMate(chessBoard, black, white) == 2){ //king in check
                                    JOptionPane.showMessageDialog(null, black_username + "'s King is in Check");
                                }
                            }
                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                captured_panel_white.setUserNamePoint(white_username, white_point);
                                captured_panel_black.setUserNamePoint(black_username, black_point);
                                captured_panel_black.addCapturedPieces(black);
                                captured_panel_white.addCapturedPieces(white);
                                boardPanel.drawBoard(chessBoard);
                            }
                        });
                    }
                }

                @Override
                public void mousePressed(MouseEvent mouseEvent) {

                }

                @Override
                public void mouseReleased(MouseEvent mouseEvent) {

                }

                @Override
                public void mouseEntered(MouseEvent mouseEvent) {

                }

                @Override
                public void mouseExited(MouseEvent mouseEvent) {

                }
            });
            validate();
        }

        /**
         * Checks what the current square color is
         * @param currSquare Square object to be checked
         * @return
         */
        private Color checkCurrSquareColor(Square currSquare){
            if(currSquare.xCoord % 2 == 0 && currSquare.yCoord % 2 == 0){
                return Color.PINK;
            }else{
                return Color.white;
            }
        }

        /**
         * Renders the square
         * @param chessBoard The board of the chess game
         */
        public void drawSquare(Board chessBoard){
            assignSquareColor();
            assignSquareIcon(chessBoard);
            validate();
            repaint();
        }
        /**
         * Assigns Icon from the directory to each piece.
         * @param board The chess board of the game.
         */
        private void assignSquareIcon(Board board){
            this.removeAll();
            if(board.board[xcoord][ycoord].isOccupied()){
                //System.out.printf(imagePath + "white_" + board.board[xcoord][ycoord].piece.getTypeOfPiece() + ".png\n");
                try {
                    if(board.board[xcoord][ycoord].piece.isWhite()) {
                        final BufferedImage image = ImageIO.read(new File(imagePath + "white_" + board.board[xcoord][ycoord].piece.getTypeOfPiece() + ".png"));
                        add(new JLabel(new ImageIcon(image)));
                    }else{
                        final BufferedImage image = ImageIO.read(new File(imagePath + "black_" + board.board[xcoord][ycoord].piece.getTypeOfPiece() + ".png"));
                        add(new JLabel(new ImageIcon(image)));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        /**
         * Assigns colors for each squares.
         */
        private void assignSquareColor() {

            if (xcoord == 0 || xcoord == 2 || xcoord == 4 || xcoord == 6) {
                setBackground(ycoord % 2 == 0 ? Color.PINK : Color.WHITE);
            } else if (xcoord == 1 || xcoord == 3 || xcoord == 5 || xcoord == 7) {
                setBackground(ycoord % 2 == 0 ? Color.WHITE : Color.PINK);
            }
        }
    }
}
