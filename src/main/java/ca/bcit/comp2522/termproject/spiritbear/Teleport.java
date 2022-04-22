package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Class for the teleport obstacle to move next stage.
 * @author GyoungHwan Hong
 * @version 2022
 */
public class Teleport extends Obstacle {
    private final Image image;
    private final ImageView imageView;

    /**
     * Constructs Teleport class.
     * @param xCoordinate an int to present object's xCoordinate.
     * @param yCoordinate an int to present object's yCorrdinate.
     * @param height an int to present object's height.
     * @param width an int to present object's width.
     * @param id an int to present ID
     */
    public Teleport(final int xCoordinate, final int yCoordinate, final int height, final int width, final int id) {
        super(xCoordinate, yCoordinate, height, width, id);
        this.image = new Image("teleport.png", true);
        this.imageView = new ImageView(image);
        this.imageView.setX(xCoordinate);
        this.imageView.setY(yCoordinate);
        this.id = id;
    }

    /** Getter for an image.
     * @return an image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Getter for an image view.
     * @return an imageView
     */
    public ImageView getImageView() {
        return imageView;
    }
}
