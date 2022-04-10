package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Teleport extends Obstacle{

    private final Image image;
    private final ImageView imageView;

    public Teleport(int xCoordinate, int yCoordinate, int height, int width, int id) {
        super(xCoordinate, yCoordinate, height, width, id);
        this.image = new Image("teleport.png", true);
        this.imageView = new ImageView(image);
        this.imageView.setX(xCoordinate);
        this.imageView.setY(yCoordinate);
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public ImageView getImageView() {
        return imageView;
    }
}
