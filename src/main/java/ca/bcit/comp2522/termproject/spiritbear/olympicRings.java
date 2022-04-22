package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class olympicRings extends Obstacle{

    Image olmypicRingImage;
    ImageView olympicRingImageView;
    public olympicRings(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 25, 50, 1);
        this.olmypicRingImage = new Image("olympicrings.png", true);
        this.olympicRingImageView = new ImageView(olmypicRingImage);

        this.olympicRingImageView.setX(this.xCoordinate);
        this.olympicRingImageView.setY(this.yCoordinate);
    }
}
