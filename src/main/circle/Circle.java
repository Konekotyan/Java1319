package main.circle;

public class Circle {
    private double x; // абсцисса центра
    private double y; // ордината центра
    private double r; // радиус

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    public void zoomCircle(double r) {
        this.r = this.r * r;
    }
    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    public Circle(double a, double b, double s) {
        this.x = a;
        this.y = b;
        this.r = s;
    }
    // метод вычисляющий площадь круга
    public double squareCircle() {
        return Math.PI * r * r;
    }
    // метод проверяющий равны ли окружности по площадям
    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Circle inCircle  = (Circle)obj;
        return (this.getX() == inCircle.getX()) && (this.getY() == inCircle.getY()) && ((this.getR() == inCircle.getR()));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}

