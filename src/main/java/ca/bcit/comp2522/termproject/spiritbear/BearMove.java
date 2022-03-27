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

    private ImageView BearView;
    private ImageView FireBearView;
    private ImageView WaterBearView;
    private ImageView EarthBearView;
    private ImageView SpiritBearView;


    @Override
    public void start(Stage stage) {

        Image bear = new Image("NormalBear.png", true);
        Image fireBear = new Image("FireBear.png", true);
        Image waterBear = new Image("FireWaterBear.png", true);
        Image earthBear = new Image("FireWaterEarthBear.png", true);
        Image spiritBear = new Image("SpiritBear.png", true);

        BearView = new ImageView(bear);
        FireBearView = new ImageView(fireBear);
        WaterBearView = new ImageView(waterBear);
        EarthBearView = new ImageView(earthBear);
        SpiritBearView = new ImageView(spiritBear);


        final int bearStartCoordinate = 300;
        BearView.setX(bearStartCoordinate + 80);
        BearView.setY(bearStartCoordinate);

        FireBearView.setX(bearStartCoordinate + 40);
        FireBearView.setY(bearStartCoordinate);

        WaterBearView.setX(bearStartCoordinate);
        WaterBearView.setY(bearStartCoordinate);

        EarthBearView.setX(bearStartCoordinate - 40);
        EarthBearView.setY(bearStartCoordinate);

        SpiritBearView.setX(bearStartCoordinate - 80);
        SpiritBearView.setY(bearStartCoordinate);

        Group root = new Group();

        root.getChildren().addAll(BearView,FireBearView,WaterBearView,EarthBearView,SpiritBearView);

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
                BearView.setY(BearView.getY() - JUMP);
                FireBearView.setY(FireBearView.getY() - JUMP);
                WaterBearView.setY(WaterBearView.getY() - JUMP);
                EarthBearView.setY(EarthBearView.getY() - JUMP);
                SpiritBearView.setY(SpiritBearView.getY() - JUMP);
                break;
            case DOWN:
                BearView.setY(BearView.getY() + JUMP);
                FireBearView.setY(FireBearView.getY() + JUMP);
                WaterBearView.setY(WaterBearView.getY() + JUMP);
                EarthBearView.setY(EarthBearView.getY() + JUMP);
                SpiritBearView.setY(SpiritBearView.getY() + JUMP);
                break;
            case LEFT:
                BearView.setX(BearView.getX() - JUMP);
                FireBearView.setX(FireBearView.getX() - JUMP);
                WaterBearView.setX(WaterBearView.getX() - JUMP);
                EarthBearView.setX(EarthBearView.getX() - JUMP);
                SpiritBearView.setX(SpiritBearView.getX() - JUMP);
                break;
            case RIGHT:
                BearView.setX(BearView.getX() + JUMP);
                FireBearView.setX(FireBearView.getX() + JUMP);
                WaterBearView.setX(WaterBearView.getX() + JUMP);
                EarthBearView.setX(EarthBearView.getX() + JUMP);
                SpiritBearView.setX(SpiritBearView.getX() + JUMP);
                break;
            default:
                break; // Does nothing if it's not an arrow key.
        }
    }
    public static void main(String[] args) { Application.launch(args);}
}
