package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EvilGoose extends Obstacle{
    Image gooseImage;
    ImageView gooseImageView;
    public EvilGoose(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40, 1);
        this.gooseImage = new Image("EvilGoose.png", true);
        this.gooseImageView = new ImageView(gooseImage);

        this.gooseImageView.setX(this.xCoordinate);
        this.gooseImageView.setY(this.yCoordinate);
    }
}
