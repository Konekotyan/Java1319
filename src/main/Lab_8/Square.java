package main.Lab_8;

import java.awt.*;

public class Square extends Rectangle {

    private int side;

    public Square(int x, int y, Color color, String text, int side) {
        super(x, y, color, text, side, side);
        this.side = side;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(getColor());
        gr2d.fillRect(getX(), getY(), side, side);
        gr2d.setColor(Color.BLACK);
        gr2d.drawString(getFigure(), getX() + side/3, getY() + side/3);
    }
}
