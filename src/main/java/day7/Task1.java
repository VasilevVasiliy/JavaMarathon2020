package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplan Korny = new Airplan("Завод им Гагарина", 1963,4.4, 2.1);
        Airplan IJ = new Airplan("ИЖ", 1976,5.1, 3.0);

        Airplan.compareAirplanes(Korny, IJ);
    }
}