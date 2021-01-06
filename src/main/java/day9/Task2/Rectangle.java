package day9.Task2;

public class Rectangle extends Figure {
    double with;
    double height;

    Rectangle(double with, double height, String color) {
        super(color);
        this.with = with;
        this.height = height;
    }

    @Override
    public double area() {
        return with * height;
    }

    @Override
    public double perimeter() {
        return (with + height) * 2;
    }
}
