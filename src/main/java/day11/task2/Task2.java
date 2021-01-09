package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Magician m1 = new Magician();
        Paladin p1 = new Paladin();
        Shaman s1 = new Shaman();
        Warrior w1 = new Warrior();

        w1.physicalAttack(p1);
        System.out.println(p1.toString());
        p1.physicalAttack(m1);
        System.out.println(m1.toString());
        s1.healTeammate(m1);
        System.out.println(m1.toString());
        m1.magicalAttack(p1);
        System.out.println(p1.toString());
        s1.physicalAttack(w1);
        System.out.println(w1.toString());
        p1.healHimself();
        System.out.println(p1.toString());

        for (int a = 0; a < 5; a++) {
            w1.physicalAttack(m1);
            System.out.println(m1.toString());
        }
    }
}
