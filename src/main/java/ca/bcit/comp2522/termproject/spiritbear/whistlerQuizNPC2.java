package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class whistlerQuizNPC2 extends Obstacle {
    Image whistlerNPC2;
    ImageView whistlerNPC2ImageView;
    int npcId;
    public whistlerQuizNPC2(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 70, 50, 2);
        this.whistlerNPC2 = new Image("NPC______22.png", true);
        this.whistlerNPC2ImageView = new ImageView(whistlerNPC2);
        this.npcId = 1;
    }
    public void initPosition(int[][] arr) {

        int si = xCoordinate - height / 2;
        int fi = xCoordinate + height / 2;
        int sj = yCoordinate - width / 2;
        int fj = yCoordinate + width / 2;

        this.whistlerNPC2ImageView.setX(this.xCoordinate);
        this.whistlerNPC2ImageView.setY(this.yCoordinate);

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
}
