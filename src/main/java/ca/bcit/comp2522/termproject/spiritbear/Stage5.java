package ca.bcit.comp2522.termproject.spiritbear;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Stage5 extends Application {

    public static final int JUMP = 10;
    private final int[][] array = new int[600][600];

    private ImageView background;
    private ImageView bearImageView;
    private ControlTower tower;
    private EvilGoose goose1;
    private EvilGoose goose2;
    private EvilGoose goose3;
    private EvilGoose goose4;
    private EvilGoose goose5;
    private EvilGoose goose6;
    private EvilGoose goose7;
    private EvilGoose goose8;
    private EvilGoose goose9;
    private EvilGoose goose10;
    private EvilGoose goose11;
    private EvilGoose1 goose12;
    private EvilGoose1 goose13;
    private EvilGoose1 goose14;
    private EvilGoose1 goose15;
    private EvilGoose1 goose16;
    private EvilGoose1 goose17;
    private EvilGoose1 goose18;
    private EvilGoose1 goose19;
    private EvilGoose1 goose20;
    private EvilGoose1 goose21;
    private EvilGoose1 goose22;
    private EvilGoose1 goose23;
    private Airplane airplane;
    private Bear bear;
    private QustionAnswerBox qb;

    private NPC Boss;

    private Teleport teleport;
    //private Stage temp_stage;

    @Override
    public void start(Stage stage) {

        //temp_stage = stage;

        bear = new Bear("Bear",300, 300, 40,40,100, 100, 5, 250, 30);

        Image bg = new Image("bg5.png", true);


        background = new ImageView(bg);
        tower = new ControlTower(60, 20);
        teleport = new Teleport(500, 500, 40, 40, 100);
        goose1 = new EvilGoose(55, 550);
        goose2 = new EvilGoose(55, 500);
        goose3 = new EvilGoose(55, 450);
        goose4 = new EvilGoose(55, 400);
        goose5 = new EvilGoose(55, 350);
        goose6 = new EvilGoose(55, 300);
        goose7 = new EvilGoose(55, 250);
        goose8 = new EvilGoose(55, 200);
        goose9 = new EvilGoose(55, 150);
        goose10 = new EvilGoose(55, 100);
        goose11 = new EvilGoose(55, 50);
        goose12 = new EvilGoose1(475, 100);
        goose13 = new EvilGoose1(475, 150);
        goose14 = new EvilGoose1(475, 200);
        goose15 = new EvilGoose1(475, 250);
        goose16 = new EvilGoose1(475, 300);
        goose17 = new EvilGoose1(475, 350);
        goose18 = new EvilGoose1(475, 400);
        goose19 = new EvilGoose1(475, 450);
        goose20 = new EvilGoose1(475, 500);
        goose21 = new EvilGoose1(475, 550);
        goose22 = new EvilGoose1(475, 50);
        goose23 = new EvilGoose1(475, 20);
        airplane = new Airplane(225, 25);

        Boss = new NPC(250, 200, 99);


        bear.initPosition();
        bearImageView = bear.getBearImageView();
        teleport.initPosition(array);
        tower.initPosition(array);
        goose1.initPosition(array);
        goose2.initPosition(array);
        goose3.initPosition(array);
        goose4.initPosition(array);
        goose5.initPosition(array);
        goose6.initPosition(array);
        goose7.initPosition(array);
        goose8.initPosition(array);
        goose9.initPosition(array);
        goose10.initPosition(array);
        goose11.initPosition(array);
        goose12.initPosition(array);
        goose13.initPosition(array);
        goose14.initPosition(array);
        goose15.initPosition(array);
        goose16.initPosition(array);
        goose17.initPosition(array);
        goose18.initPosition(array);
        goose19.initPosition(array);
        goose20.initPosition(array);
        goose21.initPosition(array);
        goose22.initPosition(array);
        goose23.initPosition(array);
        airplane.initPosition(array);
        Boss.initPosition(array);


        Group root = new Group();

        root.getChildren().addAll(background, bearImageView);

        root.getChildren().addAll(tower.controlImageView, goose1.gooseImageView, goose2.gooseImageView,
                goose3.gooseImageView, goose4.gooseImageView, goose5.gooseImageView, goose6.gooseImageView, goose7.gooseImageView,
                goose8.gooseImageView, goose9.gooseImageView, goose10.gooseImageView, goose11.gooseImageView, goose12.evilGooseImageView,
                goose13.evilGooseImageView, goose14.evilGooseImageView, goose15.evilGooseImageView, goose16.evilGooseImageView,
                goose17.evilGooseImageView, goose18.evilGooseImageView, goose19.evilGooseImageView,
                goose20.evilGooseImageView, goose21.evilGooseImageView, goose22.evilGooseImageView, goose23.evilGooseImageView,
                airplane.airplaneImageView, Boss.npcImageView);

        final int appHeight = 600;
        final int appWidth = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK); //Color.black sets the background to black


        scene.setOnKeyPressed(this::processKeyPress);


        stage.setTitle("Spirit Bear Game");
        stage.setScene(scene);
        stage.show();
    }

    public void showAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("MESSAGE");
        alert.setHeaderText("Congratulation!");
        alert.setContentText("CLEAR ALL THE STAGES!");
        alert.showAndWait();
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
                if (bear.interaction(array) != 0) {
                    qb = new QustionAnswerBox(bear.interaction(array));
                    if (qb.getUserChoice()) {
                        showAlert();
                    }
                    break;
                }
                break;
            default:
                break; // Does nothing if it's not an arrow key.
        }
    }
}
