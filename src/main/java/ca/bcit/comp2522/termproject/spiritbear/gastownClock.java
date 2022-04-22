package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class gastownClock extends Obstacle{

    Image clockImage;
    ImageView clockImageView;

    public gastownClock(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 60, 50, 3);
        this.clockImage = new Image("gastownclock.png", true);
        this.clockImageView = new ImageView(clockImage);

        this.clockImageView.setX(this.xCoordinate);
        this.clockImageView.setY(this.yCoordinate);
    }
}
