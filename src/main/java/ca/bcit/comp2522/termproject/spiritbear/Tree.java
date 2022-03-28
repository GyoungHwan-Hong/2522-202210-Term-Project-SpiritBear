package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Tree extends Obstacle {

    Image treeImage;
    ImageView treeImageView;

    public Tree(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40);
        this.treeImage = new Image("Tree.png", true);
        this.treeImageView = new ImageView(treeImage);
    }

    public void initPosition(int[][] arr) {

        int si = xCoordinate - height / 2;
        int fi = xCoordinate + height / 2;
        int sj = yCoordinate - width / 2;
        int fj = yCoordinate + width / 2;

        this.treeImageView.setX(this.xCoordinate);
        this.treeImageView.setY(this.yCoordinate);

        for ( int i = si; i <= fi; i++) {
            for (int j = sj; j <= fj ; j++) {
                arr[i][j] = 1;
            }
        }
    }

    public int setPosition() {
        return 1;
    }
}
