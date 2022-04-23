package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CypressRing extends Obstacle{

    Image cypressImage;
    ImageView cypressImageView;
    public CypressRing(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 25, 120,1);
        this.cypressImage = new Image("cypressrings.png", true);
        this.cypressImageView = new ImageView(cypressImage);

        this.cypressImageView.setX(this.xCoordinate);
        this.cypressImageView.setY(this.yCoordinate);
    }
}
