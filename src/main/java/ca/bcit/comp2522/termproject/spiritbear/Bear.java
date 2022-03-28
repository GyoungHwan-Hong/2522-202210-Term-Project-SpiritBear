package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bear extends DynamicActors{

    boolean fourAttributes;
    ImageView bearImageView;

    public Bear(String name, int xCoordinate, int yCoordinate, int width, int height, int HP, int MP, int level, int experience, int attack) {
        super(name, xCoordinate, yCoordinate, width, height, HP, MP, level, experience, attack);
        Image bearImage = new Image("Bear"+level+".png", true);
        bearImageView = new ImageView(bearImage);
    }

    public ImageView getBearImageView() {
        return bearImageView;
    }

    public void initPosition() {
        this.bearImageView.setX(this.xCoordinate);
        this.bearImageView.setY(this.yCoordinate);
    }
}
