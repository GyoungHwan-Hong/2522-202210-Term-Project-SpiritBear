package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Tree extends Obstacle {

    Image treeImage;
    ImageView treeImageView;

    public Tree(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40, 1);
        this.treeImage = new Image("Tree.png", true);
        this.treeImageView = new ImageView(treeImage);

        this.treeImageView.setX(this.xCoordinate);
        this.treeImageView.setY(this.yCoordinate);
    }

    public int setPosition() {
        return 1;
    }
}
