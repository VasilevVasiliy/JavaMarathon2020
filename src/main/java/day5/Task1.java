package day5;

public class Task1 {
    public static void main(String[] args) {
        Car FirsBibi = new Car();
        FirsBibi.setYear(1983);
        FirsBibi.setColor("green");
        FirsBibi.setModel("Volvo");

        System.out.println(FirsBibi.getYear());
        System.out.println(FirsBibi.getColor());
        System.out.println(FirsBibi.getModel());
    }
}

class Car {
    int year;
    String color;
    String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
