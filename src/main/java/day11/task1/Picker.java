package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;

    Warehouse w = new Warehouse();

    Picker(int salary, boolean isPayed, Warehouse warhouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        w = warhouse;

    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPlayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        String info = (salary + "\n" + isPayed);
        return info;
    }

    @Override
    public void doWork() {
        salary += 80;
        int a = w.getCountPickedOrders();
        w.setCountPickedOrders(a += 1);
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() == 10000 && isPayed == false) {
            salary += 70000;
            isPayed = true;
        } else if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
