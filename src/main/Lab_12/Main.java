package main.Lab_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {

    private static final Random random = new Random();
    public static final int width = 800;
    public static final int height = 600;
    private static int count = 0;
    private static final double G = 6.67;
    public Main(){
        super("Task 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton btn = new JButton("Click");
        final JComboBox planetList = new JComboBox(Planets.values());
        final JLabel label1 = new JLabel("Гравитация: Земля = 9.8");
        JPanel pane = new JPanel(new FlowLayout(FlowLayout.CENTER));

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Planets planets = (Planets)planetList.getSelectedItem();
                double grav = planets.gravity() / 1000000000000.00;
                String res = String.format("%.1f",grav);
                label1.setText("Гравитация: " + planets.getName() + " = " + res + " ");
            }
        });
        getContentPane().add(btn, BorderLayout.CENTER);
        pane.add(label1);
        pane.add(btn);
        pane.add(planetList);
        setContentPane(pane);
        setSize(width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
