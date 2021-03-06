package ca.bcit.comp2522.termproject.spiritbear;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Stage4 extends Application {

    public static final int JUMP = 10;
    private final int[][] array = new int[600][600];

    private ImageView background;
    private ImageView bearImageView;
    private Tree Tree1;
    private Tree Tree2;
    private Tree Tree3;
    private Tree Tree4;
    private ScienceWorld scienceWorld;
    private GastownClock gastownClock;
    private NPC npc;
    private Bear bear;
    private QustionAnswerBox qb;

    private Teleport teleport;
    private Stage temp_stage;


    @Override
    public void start(Stage stage) {

        temp_stage = stage;

        bear = new Bear("Bear",300, 300, 40,40,100, 100, 4, 15, 30);

        Image bg = new Image("bg4.png", true);

        teleport = new Teleport( 200, 200, 40, 40, 100);



        background = new ImageView(bg);

        gastownClock = new GastownClock( 100, 100);
        scienceWorld = new ScienceWorld( 450, 450);
        Tree1 = new Tree(270, 530);
        Tree2 = new Tree(330, 350);
        Tree3 = new Tree(130, 200);
        Tree4 = new Tree(250, 150);
        npc = new NPC(320, 250,41);

        scienceWorld.initPosition(array);
        gastownClock.initPosition(array);
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

        root.getChildren().addAll(Tree1.treeImageView, Tree2.treeImageView, Tree3.treeImageView, Tree4.treeImageView,
                                  npc.npcImageView, scienceWorld.ScienceImageView, gastownClock.clockImageView);

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
                if (bear.interaction(array) == 100 && bear.level == 5) {
                    Stage5 stage5 = new Stage5();
                    stage5.start(temp_stage);
                }
                if (bear.interaction(array) != 0) {
                    qb = new QustionAnswerBox(bear.interaction(array));
                    if (qb.getUserChoice()) {
                        bear.addExperience();
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
