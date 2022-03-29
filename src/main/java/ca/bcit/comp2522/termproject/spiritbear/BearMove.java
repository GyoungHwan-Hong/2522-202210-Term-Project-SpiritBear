package ca.bcit.comp2522.termproject.spiritbear;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BearMove extends Application {

    public static final int JUMP = 10;
    private final int[][] array = new int[600][600];

    private ImageView Background;
    private Tree Tree1;
    private Tree Tree2;
    private Tree Tree3;
    private Tree Tree4;
    private Bear bear;

    @Override
    public void start(Stage stage) {

        bear = new Bear("Bear",300, 300, 40,40,100, 100, 5, 250, 30);

        Image bg = new Image("bg.png", true);


        Background = new ImageView(bg);
        Tree1 = new Tree(270, 530);
        Tree2 = new Tree(330, 350);
        Tree3 = new Tree(130, 200);
        Tree4 = new Tree(420, 70);


//        for (int i = 0; i < 600; i++) {
//            for (int j = 0; j < 600; j++) {
//                if (i == Tree1.xCoordinate / 10 && j == Tree1.yCoordinate / 10) {
//                    array[i][j] = 1;
//                }
//                if (i == Tree2.xCoordinate / 10 && j == Tree2.yCoordinate / 10) {
//                    array[i][j] = 1;
//                }
//                if (i == Tree3.xCoordinate / 10 && j == Tree3.yCoordinate / 10) {
//                    array[i][j] = 1;
//                }
//                if (i == Tree4.xCoordinate / 10 && j == Tree4.yCoordinate / 10) {
//                    array[i][j] = 1;
//                }
//            }
//        }   //Insert tree's position in to 2D array (map).
//            //I will change this.


        bear.initPosition();
        Tree1.initPosition(array);
        Tree2.initPosition(array);
        Tree3.initPosition(array);
        Tree4.initPosition(array);

//        for (int i = 0; i < 600; i++) {
//            for (int j = 0; j < 600; j++) {
//                System.out.printf(array[i][j]+"");
//            }
//            System.out.println();
//        }

        Group root = new Group();

        root.getChildren().addAll(Background, bear.getBearImageView());

        root.getChildren().addAll(Tree1.treeImageView, Tree2.treeImageView, Tree3.treeImageView, Tree4.treeImageView);

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
                    System.out.println(bear.xCoordinate + ", " + bear.yCoordinate);
                    break;
                } else {
                    break;
                }
            case DOWN:
                if (bear.ValidMoveChecker(keyEvent.getCode(), array)) {
                    bear.bearImageView.setY(bear.bearImageView.getY() + JUMP);
                    bear.setyCoordinate(bear.yCoordinate + JUMP);
                    System.out.println(bear.xCoordinate + ", " + bear.yCoordinate);
                    break;
                } else {
                    break;
                }
            case LEFT:
                if (bear.ValidMoveChecker(keyEvent.getCode(), array)) {
                    bear.bearImageView.setX(bear.bearImageView.getX() - JUMP);
                    bear.setxCoordinate(bear.xCoordinate - JUMP);
                    System.out.println(bear.xCoordinate + ", " + bear.yCoordinate);
                    break;
                } else {
                    break;
                }
            case RIGHT:
                if (bear.ValidMoveChecker(keyEvent.getCode(), array)) {
                    bear.bearImageView.setX(bear.bearImageView.getX() + JUMP);
                    bear.setxCoordinate(bear.xCoordinate + JUMP);
                    System.out.println(bear.xCoordinate + ", " + bear.yCoordinate);
                    break;
                } else {
                    break;
                }
            default:
                break; // Does nothing if it's not an arrow key.
        }
    }
}
