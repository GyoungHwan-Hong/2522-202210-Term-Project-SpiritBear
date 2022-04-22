package ca.bcit.comp2522.termproject.spiritbear;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Stage1 extends Application {

    public static final int JUMP = 10;
    private final int[][] array = new int[600][600];

    private ImageView background;
    private ImageView bearImageView;
    private EverGreenTree Tree1;
    private EverGreenTree Tree2;
    private EverGreenTree Tree3;
    private EverGreenTree Tree4;
    private EverGreenTree Tree5;
    private EverGreenTree Tree6;
    private EverGreenTree Tree7;
    private NPC npc;
    private NPC npc2;
    private NPC npc3;
    private NPC npc4;
    private NPC npc5;
    private OlympicRings oring;
    private Bear bear;
    private QustionAnswerBox qb;

    private Stage tempStage;


    @Override
    public void start(Stage stage) {

        tempStage = stage;

        bear = new Bear("Bear",300, 300, 40,40,100, 100, 1, 250, 30);

        Image bg = new Image("bg2.png", true);


        Teleport teleport = new Teleport(500, 500, 40, 40, 100);

        background = new ImageView(bg);
        Tree1 = new EverGreenTree(100, 155);
        Tree2 = new EverGreenTree(100, 185);
        Tree3 = new EverGreenTree(100, 215);
        Tree4 = new EverGreenTree(100, 245);
        Tree5 = new EverGreenTree(70, 245);
        Tree6 = new EverGreenTree(45, 245);
        Tree7= new EverGreenTree(20, 245);
        oring = new OlympicRings(200, 45);

        npc = new NPC(450, 275,45);
        npc2 = new NPC(50,500, 41);
        npc3 = new NPC(250,300, 42);
        npc4 = new NPC(275,350, 43);
        npc5 = new NPC(400,250, 44);

        bear.initPosition();
        bearImageView = bear.getBearImageView();
        Tree1.initPosition(array);
        Tree2.initPosition(array);
        Tree3.initPosition(array);
        Tree4.initPosition(array);
        Tree5.initPosition(array);
        Tree6.initPosition(array);
        Tree7.initPosition(array);
        teleport.initPosition(array);
        npc.initPosition(array);
        npc2.initPosition(array);
        npc3.initPosition(array);
        npc4.initPosition(array);
        npc5.initPosition(array);

        Group root = new Group();

        root.getChildren().addAll(background, bearImageView, teleport.getImageView());

        root.getChildren().addAll(Tree1.egTreeImageView, Tree2.egTreeImageView, Tree3.egTreeImageView, Tree4.egTreeImageView,
                Tree5.egTreeImageView, Tree6.egTreeImageView, Tree7.egTreeImageView,npc.npcImageView,
                npc2.npcImageView, npc3.npcImageView, npc4.npcImageView, npc5.npcImageView, oring.olympicRingImageView);

        final int appHeight = 600;
        final int appWidth = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK); //Color.black sets the background to black


        scene.setOnKeyPressed(this::processKeyPress);


        stage.setTitle("Spirit Bear Game");
        stage.setScene(scene);
        stage.show();
    }

    private void processKeyPress(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case UP:
                if (bear.ValidMoveChecker(keyEvent.getCode(), array)) {
                    bear.bearImageView.setY(bear.bearImageView.getY() - JUMP);
                    bear.setyCoordinate(bear.yCoordinate - JUMP);
                }
                break;
            case DOWN:
                if (bear.ValidMoveChecker(keyEvent.getCode(), array)) {
                    bear.bearImageView.setY(bear.bearImageView.getY() + JUMP);
                    bear.setyCoordinate(bear.yCoordinate + JUMP);
                }
                break;
            case LEFT:
                if (bear.ValidMoveChecker(keyEvent.getCode(), array)) {
                    bear.bearImageView.setX(bear.bearImageView.getX() - JUMP);
                    bear.setxCoordinate(bear.xCoordinate - JUMP);
                }
                break;
            case RIGHT:
                if (bear.ValidMoveChecker(keyEvent.getCode(), array)) {
                    bear.bearImageView.setX(bear.bearImageView.getX() + JUMP);
                    bear.setxCoordinate(bear.xCoordinate + JUMP);
                }
                break;
            case SPACE:
                if (bear.interaction(array) == 100 && bear.level == 2) {
                    Stage2 stage2 = new Stage2();
                    stage2.start(tempStage);
                }
                if (bear.interaction(array) != 0) {
                    qb = new QustionAnswerBox(bear.interaction(array));
                    if (qb.getUserChoice()) {
                        bear.LevelUpBear();
                        bear.updateImage();
                        bearImageView = bear.getBearImageView();
                    }
                    break;
                }
                break;
            default:
                break; // Does nothing if it's not an arrow key.
        }
    }
}
