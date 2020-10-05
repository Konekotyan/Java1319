package main.Lab_5;

public class STest {
    public static void main(String[] args) {
        Shape s1 = new Circle("red", false, 5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle("blue", false, 4, 8);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getLength());

        Shape s4 = new Square(12);
        System.out.println(s4);
        System.out.println(s4.getArea());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getLength());
    }
}
