package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Inukshuk extends Obstacle{
    Image inukshukImage;
    ImageView inukshukImageView;
    public Inukshuk(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40, 1);
        this.inukshukImage = new Image("Inukshuk.png", true);
        this.inukshukImageView = new ImageView(inukshukImage);

        this.inukshukImageView.setX(this.xCoordinate);
        this.inukshukImageView.setY(this.yCoordinate);
    }
}
