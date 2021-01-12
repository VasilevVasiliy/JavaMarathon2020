package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAtt; // (величина магической атаки), по необходимости

    Shaman() {
        setHealth(100);
        setPhysDef(0.2);
        setMagicDef(0.2);
        setPhysAtt(10);
        magicAtt = 15;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) ((hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()))));
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
