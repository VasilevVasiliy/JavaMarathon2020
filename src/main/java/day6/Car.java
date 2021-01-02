package day6;

class Car {
    private int year;
    private String color;
    private String model;

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

    public void info() {
        System.out.println("Это автомобиль");
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

