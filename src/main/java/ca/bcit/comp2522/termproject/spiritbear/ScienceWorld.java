package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ScienceWorld extends Obstacle{

    Image ScienceImage;
    ImageView ScienceImageView;
    public ScienceWorld(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 32, 32,1);
        this.ScienceImage = new Image("ScienceWorld.png", true);
        this.ScienceImageView = new ImageView(ScienceImage);

        this.ScienceImageView.setX(this.xCoordinate);
        this.ScienceImageView.setY(this.yCoordinate);
    }
}
