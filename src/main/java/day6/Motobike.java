package day6;


class Motobike {
    private int year;
    private String color;
    private String model;

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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        int difference = inputYear - year;
        if (difference < 0) {
            System.out.println("Ошибка ввиода - год слишком мал для сравнения");
            return 0;
        } else {
            System.out.println("Разница " + difference + " лет");
            return difference;
        }
    }
}
