package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class NPC extends Obstacle {

    Image npc;
    ImageView npcImageView;

    public NPC(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40);
        this.npc = new Image("NPC1.png", true);
        this.npcImageView = new ImageView(npc);
    }

    public void initPosition(int[][] arr) {

        int si = xCoordinate - height / 2;
        int fi = xCoordinate + height / 2;
        int sj = yCoordinate - width / 2;
        int fj = yCoordinate + width / 2;

        this.npcImageView.setX(this.xCoordinate);
        this.npcImageView.setY(this.yCoordinate);

        for ( int i = si; i <= fi; i++) {
            for (int j = sj; j <= fj ; j++) {
                arr[i][j] = 2;
            }
        }
    }

    public int setPosition() {
        return 1;
    }
}
