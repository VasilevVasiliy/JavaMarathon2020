package day11.task2;

public class Paladin extends Hero implements interfaceHealer, interfacePhysAttack {
    int physAtt; // (величина физической атаки), по необходимости

    Paladin() {
        setHealth(100);
        setPhysDef(0.5);
        setMagicDef(0.2);
        physAtt = 15;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) ((hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()))));
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
