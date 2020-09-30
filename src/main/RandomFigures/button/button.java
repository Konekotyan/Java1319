package main.RandomFigures.button;

import main.RandomFigures.LayeredTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class button extends JFrame {

    public button(String[] args) {
        super("Example LayeredTest");
        MyPanel panel = new MyPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add (panel);
        setSize(500, 400);
        setVisible(true);
    }
    class MyPanel extends JPanel{
        MyPanel(){
            JButton button = new JButton ("Создать фигуры");
            add(button);
            button.addActionListener(listener);
        }
        ActionListener listener = new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new LayeredTest();
            }
        };
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new button(args);
    }
}
