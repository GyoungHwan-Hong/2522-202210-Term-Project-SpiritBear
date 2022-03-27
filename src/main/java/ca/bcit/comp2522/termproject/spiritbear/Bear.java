package ca.bcit.comp2522.termproject.spiritbear;

public class Bear extends DynamicActors{

    boolean fourAttributes;

    public Bear(String name, int xCoordinate, int yCoordinate, int HP, int MP, int level, int experience, int attack) {
        super(name, xCoordinate, yCoordinate, HP, MP, level, experience, attack);
    }
}
