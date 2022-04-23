package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GastownClock extends Obstacle{

    Image clockImage;
    ImageView clockImageView;

    public GastownClock(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 80, 43, 3);
        this.clockImage = new Image("gastownclock.png", true);
        this.clockImageView = new ImageView(clockImage);

        this.clockImageView.setX(this.xCoordinate);
        this.clockImageView.setY(this.yCoordinate);
    }
}
