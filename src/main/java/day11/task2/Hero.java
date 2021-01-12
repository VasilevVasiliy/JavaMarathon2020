package day11.task2;

public abstract class Hero {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 100) {
            this.health = 100;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void physicalAttack(Hero hero) {
        hero.setHealth((int) ((hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef()))));
    }

}
