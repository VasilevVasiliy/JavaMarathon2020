package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt; // (величина магической атаки), по необходимости

    Magician() {
        setHealth(100);
        setPhysDef(0.0);
        setMagicDef(0.8);
        setPhysAtt(5);
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) ((hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()))));
    }

    @Override
    public String toString() {
        return "Magician {health = " + getHealth() + "}";
    }
}
