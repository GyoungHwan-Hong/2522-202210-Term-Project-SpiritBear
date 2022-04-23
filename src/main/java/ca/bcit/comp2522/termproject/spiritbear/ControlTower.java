package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControlTower extends Obstacle{
    Image controlImage;
    ImageView controlImageView;
    public ControlTower(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 120 , 1);
        this.controlImage = new Image("ControlTower.png", true);
        this.controlImageView = new ImageView(controlImage);

        this.controlImageView.setX(xCoordinate);
        this.controlImageView.setY(yCoordinate);
    }
}
