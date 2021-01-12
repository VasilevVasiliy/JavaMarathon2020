package day11.task2;

public class Paladin extends Hero implements Healer {

    Paladin() {
        setHealth(100);
        setPhysDef(0.5);
        setMagicDef(0.2);
        setPhysAtt(15);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
    }

    @Override
    public String toString() {
        return "Paladin {health = " + getHealth() + "}";
    }
}
