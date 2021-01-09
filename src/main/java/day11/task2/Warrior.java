package day11.task2;

public class Warrior extends Hero implements interfacePhysAttack {
    int physAtt; // (величина физической атаки), по необходимости
    int magicAtt; // (величина магической атаки), по необходимости

    Warrior() {
        setHealth(100);
        setPhysDef(0.8);
        setMagicDef(0.0);
        physAtt = 30;
        magicAtt = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) ((hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()))));
    }

    @Override
    public String toString() {
        return "Warrior {health = " + getHealth() + "}";
    }
}