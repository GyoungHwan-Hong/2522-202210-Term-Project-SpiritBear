package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Airplane extends Obstacle{
    Image airplaneImage;
    ImageView airplaneImageView;


    public Airplane(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 50, 50, 1);
        this.airplaneImage = new Image("Airplane.png", true);
        this.airplaneImageView = new ImageView(airplaneImage);

        this.airplaneImageView.setX(xCoordinate);
        this.airplaneImageView.setY(yCoordinate);
    }
}
