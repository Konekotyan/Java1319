package main.RandomFigures;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    private int x;
    private int y;
    private String figure;
    private Color color;

    public Shape() {
    }

    public Shape(int x, int y, Color color, String figure ) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.figure = figure;
        setOpaque(false);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
