package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class whistlerQuizNPC extends Obstacle{
    Image whistlerNPC;
    ImageView whistlerNPCImageView;
    int npcId;
    public whistlerQuizNPC(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate, 70, 50, 3);
        this.whistlerNPC = new Image("torchbearerL.png", true);
        this.whistlerNPCImageView = new ImageView(whistlerNPC);
        this.npcId = 5;
    }
    public void initPosition(int[][] arr) {

        int si = xCoordinate - height / 2;
        int fi = xCoordinate + height / 2;
        int sj = yCoordinate - width / 2;
        int fj = yCoordinate + width / 2;

        this.whistlerNPCImageView.setX(this.xCoordinate);
        this.whistlerNPCImageView.setY(this.yCoordinate);

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
