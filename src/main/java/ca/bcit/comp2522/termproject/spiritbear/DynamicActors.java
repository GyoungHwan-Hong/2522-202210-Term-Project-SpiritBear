package ca.bcit.comp2522.termproject.spiritbear;

public abstract class DynamicActors extends Actors {
    int HP;
    int MP;
    int level;
    int experience;
    int attack;
    protected boolean isDead;

    public DynamicActors(String name, int xCoordinate, int yCoordinate, int HP, int MP, int level, int experience, int attack) {
        super(name, xCoordinate, yCoordinate);
        this.HP = HP;
        this.MP = MP;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
    }
    // GETTERS...
    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    //SETTERS..

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
