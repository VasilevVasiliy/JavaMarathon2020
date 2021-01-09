package day11.task2;

public class Shaman extends Hero implements interfaceHealer, interfacePhysAttack, interfaceMagicAttack {
    int physAtt; // (величина физической атаки), по необходимости
    int magicAtt; // (величина магической атаки), по необходимости

    Shaman() {
        setHealth(100);
        setPhysDef(0.2);
        setMagicDef(0.2);
        physAtt = 10;
        magicAtt = 15;
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
    public void healHimself() {
        setHealth(getHealth() + 50);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
    }

    @Override
    public String toString() {
        return "Shaman {health = " + getHealth() + "}";
    }
}
