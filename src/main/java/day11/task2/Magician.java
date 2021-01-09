package day11.task2;

public class Magician extends Hero implements interfacePhysAttack, interfaceMagicAttack {
    int physAtt; // (величина физической атаки), по необходимости
    int magicAtt; // (величина магической атаки), по необходимости

    Magician() {
        setHealth(100);
        setPhysDef(0.0);
        setMagicDef(0.8);
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) ((hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()))));
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) ((hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()))));
    }

    @Override
    public String toString() {
        return "Magician {health = " + getHealth() + "}";
    }
}
