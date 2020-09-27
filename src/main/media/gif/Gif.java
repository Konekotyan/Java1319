package main.media.gif;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gif {

    private JFrame frame;
    private static String filename = "src/main/media/img/soad.jpg";

    public static void main(String[] args) {
        new Gif().go();
    }

    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setSize(720, 480);
        startGIF();
    }

    static class DrawPanel extends JPanel {
        private BufferedImage image;

        public void paintComponent(Graphics g) {
            Graphics2D gr2d = (Graphics2D) g;
            try {
                image = ImageIO.read(new File(filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
            gr2d.drawImage(image, 50, 50, 545, 351, this);
        }
    }

    private int index = 0;
    private static final String PATH = "src/main/media/img/";
    String[] imgs = {"soad.jpg", "metallica.jpg", "slipknot.jpg", "rammstein.jpg"};

    private void startGIF() {
        while (true) {
            filename = PATH + imgs[index];
            index = (index + 1) % 4;
            try {
                Thread.sleep(400);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            frame.repaint();
        }
    }
}
