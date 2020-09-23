package main.Movable;

public class MTest {
    public static void main(String[] args) {
        MovablePoint a = new MovablePoint(1, 2);
        a.move(2, 1);
        System.out.println(a);
        MovableCircle b = new MovableCircle("black", true, 5, 2, 1);
        b.move(2, 3);
        System.out.println(b);
        MovableRectangle c = new MovableRectangle("red", false, 4, 2, 1, 1);
        System.out.println(c);
    }
}