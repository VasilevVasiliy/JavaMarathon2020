package day11.task2;

public class Warrior extends Hero {
    int magicAtt; // (величина магической атаки), по необходимости

    Warrior() {
        setHealth(100);
        setPhysDef(0.8);
        setMagicDef(0.0);
        setPhysAtt(30);
        magicAtt = 0;
    }

    @Override
    public String toString() {
        return "Warrior {health = " + getHealth() + "}";
    }
}