package GUI;

import chess.Pieces;
import chess.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by lildk91 on 2016. 9. 20..
 */
public class CapturedPieceWhite extends JPanel{

    private final JPanel white_panel;

    private static String imagePath = "chess Pieces/";

    public CapturedPieceWhite(){
        super(new BorderLayout());
        this.setBackground(Color.decode("0xFDF5E6"));
        this.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        this.white_panel = new JPanel(new GridLayout(0, 18));
        this.white_panel.setBackground(Color.decode("0xFDF5E6"));
        this.add(this.white_panel, BorderLayout.NORTH);
        //this.add(this.username_panel_white, BorderLayout.SOUTH);
        this.setPreferredSize(new Dimension(80, 40));
    }

    /**
     * It takes in a username and point of that user and adds it to the panel
     * @param username Username of the current player
     * @param point Point of the current player
     */
    public void setUserNamePoint(String username, int point){
        this.white_panel.removeAll();
        white_panel.add(new JLabel(username));
        white_panel.add(new JLabel(Integer.toString(point)));
        validate();
        repaint();
    }

    /**
     * Add the captured pieces to the captured panel.
     * @param white The current player
     */
    public void addCapturedPieces(Player white){
        //this.white_panel.removeAll();
        ArrayList<Pieces> white_captured_pieces = white.getCapturedPieces();
        for(int i = 0; i < white_captured_pieces.size(); i++){
            try{
                final BufferedImage image = ImageIO.read(new File(imagePath + "black_" + white_captured_pieces.get(i).getTypeOfPiece() + ".png"));
                white_panel.add(new JLabel(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH))), i + 2);
            }catch (final IOException e){
                e.printStackTrace();
            }
        }
        validate();
        repaint();
    }
}
