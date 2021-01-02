package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplan Korny = new Airplan("Завод Вершина", 1963, 6.5, 1.4);
        Korny.setYear(1970);
        Korny.setLength(5.7);
        Korny.fillUp(40);
        Korny.fillUp(70);
        Korny.info();
    }
}

class Airplan {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public Airplan(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длинна: " + length + ", вес: " + weight + ", колличество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        fuel += n;
    }
}
