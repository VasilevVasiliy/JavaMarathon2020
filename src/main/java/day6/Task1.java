package day6;

public class Task1 {
    public static void main(String[] args) {
        Car MyCar = new Car();
        MyCar.setYear(1983);
        MyCar.setColor("green");
        MyCar.setModel("Volvo");

        MyCar.info();
        MyCar.yearDifference(2016);

        Motobike Java = new Motobike(1964, "red", "A6");

        Java.info();
        Java.yearDifference(2011);
    }
}
