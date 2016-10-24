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
public class CapturedPieceBlack extends JPanel{
    private final JPanel black_panel;

    private static String imagePath = "chess Pieces/";

    public CapturedPieceBlack(){
        super(new BorderLayout());
        this.setBackground(Color.decode("0xFDF5E6"));
        this.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        this.black_panel = new JPanel(new GridLayout(0, 18));
        this.black_panel.setBackground(Color.decode("0xFDF5E6"));
        this.add(this.black_panel, BorderLayout.NORTH);
        //this.add(this.username_panel_black, BorderLayout.NORTH);
        this.setPreferredSize(new Dimension(80, 40));
    }

    /**
     * It takes in a username and point of that user and adds it to the panel
     * @param username Username of the current player
     * @param point Point of the current player
     */
    public void setUserNamePoint(String username, int point){
        this.black_panel.removeAll();
        black_panel.add(new JLabel(username));
        black_panel.add(new JLabel(Integer.toString(point)));
        validate();
        repaint();
    }

    /**
     * Add the captured pieces to the captured panel.
     * @param black The current player
     */
    public void addCapturedPieces(Player black){
        ArrayList<Pieces> black_captured_pieces = black.getCapturedPieces();
        for(int i = 0; i < black_captured_pieces.size(); i++){
            try{
                final BufferedImage image = ImageIO.read(new File(imagePath + "white_" + black_captured_pieces.get(i).getTypeOfPiece() + ".png"));
                black_panel.add(new JLabel(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH))),i + 2);
            }catch (final IOException e){
                e.printStackTrace();
            }
        }
        validate();
        repaint();
    }
}
