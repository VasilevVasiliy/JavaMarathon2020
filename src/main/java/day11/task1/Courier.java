package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;

    Warehouse w;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPlayed() {
        return isPayed;
    }

    Courier(int salary, boolean isPayed, Warehouse warhouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        w = warhouse;
    }

    @Override
    public String toString() {
        String info = (salary + "\n" + isPayed);
        return info;
    }

    @Override
    public void doWork() {
        salary += 100;
        int a = w.getCountDeliveredOrders();
        w.setCountDeliveredOrders(a += 1);
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() == 10000 && isPayed == false) {
            salary += 50000;
            isPayed = true;
        } else if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }
}
