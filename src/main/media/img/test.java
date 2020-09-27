package main.media.img;

import javax.swing.*;

public class test extends JFrame {

    public test(String[] args) {
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        img img = new img((args.length > 0) ? args[0] : "");
        img.setBounds(0, 0, 850, 450);
        lp.add(img);
        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new test(args);
    }
}
