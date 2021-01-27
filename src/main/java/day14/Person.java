package day14;


public class Person {
    private String name;
    private int year;

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setYear(int yr) {
        year = yr;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{name=" + getName() + ", year=" + getYear() + "}";
    }
}
