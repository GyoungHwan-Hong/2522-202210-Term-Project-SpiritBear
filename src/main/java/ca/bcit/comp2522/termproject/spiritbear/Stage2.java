package ca.bcit.comp2522.termproject.spiritbear;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Stage2 extends Application {

    public static final int JUMP = 10;
    private final int[][] array = new int[600][600];

    private ImageView background;
    private ImageView bearImageView;
    private Tree Tree1;
    private Tree Tree2;
    private Tree Tree3;
    private Tree Tree4;
    private Tree Tree5;
    private Tree Tree6;
    private Tree Tree7;
    private Tree Tree8;
    private Tree Tree9;
    private Tree Tree10;
    private Tree Tree11;
    private Tree Tree12;
    private Tree Tree13;
    private Tree Tree14;
    private Tree Tree15;
    private Tree Tree16;
    private Tree Tree17;
    private Tree Tree18;
    private Tree Tree19;

    private NPC npc1;
    private NPC npc2;
    private NPC npc3;
    private NPC npc4;
    private NPC npc5;
    private Bear bear;
    private QustionAnswerBox qb;

    private Teleport teleport;
    private Stage3 stage3 = new Stage3();
    private Stage temp_stage;

    @Override
    public void start(Stage stage) {

        temp_stage = stage;

        bear = new Bear("Bear",300, 300, 40,40,100, 100, 2, 5, 30);

        Image bg = new Image("bg.png", true);


        teleport = new Teleport( 550, 300, 40, 40, 100);

        background = new ImageView(bg);

        Tree1 = new Tree(550, 550);
        Tree2 = new Tree(550, 350);
        Tree3 = new Tree(550, 250);
        Tree4 = new Tree(550, 200);
        Tree5 = new Tree(550, 550);
        Tree6 = new Tree(550, 500);
        Tree7 = new Tree(550, 450);
        Tree8 = new Tree(550, 400);
        Tree9 = new Tree(550, 150);
        Tree10 = new Tree(550, 100);
        Tree11 = new Tree(550, 50);
        Tree12 = new Tree(300, 20);
        Tree13 = new Tree(500, 20);
        Tree14 = new Tree(450, 20);
        Tree15 = new Tree(400, 20);
        Tree16 = new Tree(350, 20);
        Tree17 = new Tree(250, 20);
        Tree18 = new Tree(200, 20);
        Tree19 = new Tree(150, 20);


        npc1 = new NPC(350, 60,61);
        npc2 = new NPC(450, 100,62);
        npc3 = new NPC(400, 325,63);
        npc4 = new NPC(450, 450,64);
        npc5 = new NPC(425, 525,65);


        bear.initPosition();
        bearImageView = bear.getBearImageView();
        Tree1.initPosition(array);
        Tree2.initPosition(array);
        Tree3.initPosition(array);
        Tree4.initPosition(array);
        Tree5.initPosition(array);
        Tree6.initPosition(array);
        Tree7.initPosition(array);
        Tree8.initPosition(array);
        Tree9.initPosition(array);
        Tree10.initPosition(array);
        Tree11.initPosition(array);
        Tree12.initPosition(array);
        Tree13.initPosition(array);
        Tree14.initPosition(array);
        Tree15.initPosition(array);
        Tree16.initPosition(array);
        Tree17.initPosition(array);
        Tree18.initPosition(array);
        Tree19.initPosition(array);
        teleport.initPosition(array);
        npc1.initPosition(array);
        npc2.initPosition(array);
        npc3.initPosition(array);
        npc4.initPosition(array);
        npc5.initPosition(array);

        Group root = new Group();

        root.getChildren().addAll(background, bearImageView, teleport.getImageView());

        root.getChildren().addAll(Tree1.treeImageView, Tree2.treeImageView, Tree3.treeImageView, Tree4.treeImageView,
                Tree5.treeImageView, Tree6.treeImageView, Tree7.treeImageView, Tree8.treeImageView, Tree9.treeImageView,
                Tree10.treeImageView, Tree11.treeImageView, Tree12.treeImageView, Tree13.treeImageView, Tree14.treeImageView,
                Tree15.treeImageView, Tree16.treeImageView, Tree17.treeImageView, Tree18.treeImageView, Tree19.treeImageView,
                npc1.npcImageView,npc2.npcImageView,npc3.npcImageView, npc4.npcImageView, npc5.npcImageView);

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
                if (bear.interaction(array) == 100 && bear.level == 3) {
                    stage3.start(temp_stage);
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
