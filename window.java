package java_game;

import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;

public class window extends Canvas {
    public window(int width, int heigth, String title, Game game){
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width, heigth));
        frame.setMaximumSize(new Dimension(width, heigth));
        frame.setMinimumSize(new Dimension(width, heigth));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();





    }
}

