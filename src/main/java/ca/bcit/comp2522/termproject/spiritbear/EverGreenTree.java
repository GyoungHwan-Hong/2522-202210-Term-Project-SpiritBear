package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EverGreenTree extends Obstacle {

    Image egTreeImage;
    ImageView egTreeImageView;


    public EverGreenTree(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40, 2);
        this.egTreeImage = new Image("evergreen_Tree.png", true);
        this.egTreeImageView = new ImageView(egTreeImage);

        this.egTreeImageView.setX(this.xCoordinate);
        this.egTreeImageView.setY(this.yCoordinate);
    }
}
