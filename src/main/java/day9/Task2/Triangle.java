package day9.Task2;

public class Triangle extends Figure {
    double with;
    double height;
    double length;

    Triangle(double with, double height, double length, String color) {
        super(color);
        this.with = with;
        this.height = height;
        this.length = length;
    }

    @Override
    public double area() {
        double helfperimetr = perimeter() / 2;
        return Math.sqrt(helfperimetr * (helfperimetr - with) * (helfperimetr - height) * (helfperimetr - length));
    }

    @Override
    public double perimeter() {
        return with + height + length;
    }
}
