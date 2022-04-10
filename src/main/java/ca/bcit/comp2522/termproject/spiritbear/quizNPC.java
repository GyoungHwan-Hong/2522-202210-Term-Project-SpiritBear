package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class quizNPC extends Obstacle{
    Image npc;
    ImageView npcImageView;
    int npcId;

    public quizNPC(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 40, 40, 2);
        this.npc = new Image("totem_pole.png", true);
        this.npcImageView = new ImageView(npc);
        this.npcId = 3;
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
                arr[i][j] = npcId;
            }
        }
    }

    public int getNpcId(final int inputNPCId) {
        if (inputNPCId == this.npcId) {
            return this.npcId;
        }
        return 0;
    }



    public int setPosition() {
        return 1;
    }
}
