package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse house1 = new Warehouse();
        Picker p1 = new Picker(0, false, house1);
        Courier c1 = new Courier(0, false, house1);

        Warehouse house2 = new Warehouse();
        Picker p2 = new Picker(0, false, house2);
        Courier c2 = new Courier(0, false, house2);

        businessProcess(p1);
        businessProcess(c1);

        System.out.println(house1.getCountDeliveredOrders());
        System.out.println(house1.getCountPickedOrders());

        System.out.println(p1.getSalary());
        System.out.println(c1.getSalary());

        p2.doWork();
        c2.doWork();

        System.out.println(house2.getCountDeliveredOrders());
        System.out.println(house2.getCountPickedOrders());

        System.out.println(p2.getSalary());
        System.out.println(c2.getSalary());

    }

    static void businessProcess(Worker worker) {
        for (int a = 0; a < 10000; a++) {
            worker.doWork();
        }
        worker.bonus();
    }
}