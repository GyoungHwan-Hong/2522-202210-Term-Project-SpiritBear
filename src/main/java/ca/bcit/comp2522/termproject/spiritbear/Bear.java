package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bear extends DynamicActors{

    boolean fourAttributes;
    ImageView bearImageView;
    int width;
    int height;

    public Bear(String name, int xCoordinate, int yCoordinate, int HP, int MP, int level, int experience, int attack) {
        super(name, xCoordinate, yCoordinate, HP, MP, level, experience, attack);
        Image bearImage = new Image("Bear"+level+".png", true);
        bearImageView = new ImageView(bearImage);
        width = 10;
        height = 10;
    }

    public ImageView getBearImageView() {
        return bearImageView;
    }
}
