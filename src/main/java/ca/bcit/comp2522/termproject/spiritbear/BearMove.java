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

    private ImageView imageView;

    @Override
    public void start(Stage stage) {

        Image bear = new Image("Bear.png", true);
        imageView = new ImageView(bear);

        final int bearStartCoordinate = 300;
        imageView.setX(bearStartCoordinate);
        imageView.setY(bearStartCoordinate);

        Group root = new Group(imageView);

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
            case UP -> imageView.setY(imageView.getY() - JUMP);
            case DOWN -> imageView.setY(imageView.getY() + JUMP);
            case LEFT -> imageView.setX(imageView.getX() - JUMP);
            case RIGHT -> imageView.setX(imageView.getX() + JUMP);
            default -> {
            } // Does nothing if it's not an arrow key.

        }
    }

    public static void main(String[] args) { Application.launch(args);}
}
