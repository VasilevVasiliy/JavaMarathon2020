package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike Java = new Motobike(1967, "red", "A3");
        System.out.println(Java.getYear());
        System.out.println(Java.getColor());
        System.out.println(Java.getModel());
    }
}

class Motobike {
    public int year;
    public String color;
    public String model;

    public Motobike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
