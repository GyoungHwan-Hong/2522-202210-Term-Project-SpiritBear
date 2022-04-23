package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EvilGoose1 extends Obstacle{
    Image evilGooseL;
    ImageView evilGooseImageView;
    public EvilGoose1(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40, 1);
        this.evilGooseL = new Image("EvilGoose(1).png", true);
        this.evilGooseImageView = new ImageView(evilGooseL);

        this.evilGooseImageView.setX(xCoordinate);
        this.evilGooseImageView.setY(yCoordinate);
    }
}
