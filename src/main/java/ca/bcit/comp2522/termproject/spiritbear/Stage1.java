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
    private Tree Tree1;
    private Tree Tree2;
    private Tree Tree3;
    private Tree Tree4;
    private NPC npc;
    private Bear bear;
    private QustionAnswerBox qb;

    private Stage tempStage;


    @Override
    public void start(Stage stage) {

        tempStage = stage;

        bear = new Bear("Bear",300, 300, 40,40,100, 100, 1, 250, 30);

        Image bg = new Image("bg.png", true);


        Teleport teleport = new Teleport(200, 200, 40, 40, 100);

        background = new ImageView(bg);
        Tree1 = new Tree(200, 250);
        Tree2 = new Tree(250, 200);
        Tree3 = new Tree(280, 150);
        Tree4 = new Tree(320, 100);
        npc = new NPC(20, 20,2);

        bear.initPosition();
        bearImageView = bear.getBearImageView();
        Tree1.initPosition(array);
        Tree2.initPosition(array);
        Tree3.initPosition(array);
        Tree4.initPosition(array);
        teleport.initPosition(array);
        npc.initPosition(array);

        Group root = new Group();

        root.getChildren().addAll(background, bearImageView, teleport.getImageView());

        root.getChildren().addAll(Tree1.treeImageView, Tree2.treeImageView, Tree3.treeImageView, Tree4.treeImageView, npc.npcImageView);

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
