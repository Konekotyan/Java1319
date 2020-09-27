package main.RandomFigures;

import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, Color color, String text, int width, int height) {
        super(x, y, color, text);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(getColor());
        gr2d.fillRect(getX(), getY(), width, height);
        gr2d.setColor(Color.BLACK);
        gr2d.drawString(getFigure(), getX() + width/3, getY() + height/3);
    }
}