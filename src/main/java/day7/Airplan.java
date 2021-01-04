package day7;

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

    static void compareAirplanes (Airplan aplan1, Airplan aplan2) {
        if(aplan1.length > aplan2.length) { System.out.println("Первый самолёт длинее."); }
        else if (aplan1.length < aplan2.length) { System.out.println("Второй самолёт длинее."); }
        else { System.out.println("Длины самолётов равны."); }
    }
}
