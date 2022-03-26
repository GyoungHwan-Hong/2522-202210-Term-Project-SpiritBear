package ca.bcit.comp2522.termproject.spiritbear;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class WelcomeScreen extends Application {
    public static void main(String[] args) { Application.launch(args);}

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        VBox vbox = new VBox(new Separator(Orientation.VERTICAL));

        final int appHeight = 600;
        final int appWidth = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.WHITESMOKE); //Color.black sets the background to black


        //welcome text
        final double textX = (scene.getWidth() / 2 ) - 100;
        final double textY = (scene.getHeight() / 2);
        Text welcome = new Text(textX, textY - 100, "Welcome to Adventures of Spiritbear!");
        welcome.setTextAlignment(TextAlignment.CENTER);

        //Play button
        Button playbtn = new Button();
        playbtn.setText("PLAY");
        playbtn.setPrefSize(100,50);
        playbtn.setTranslateX(textX + 50);
        playbtn.setTranslateY(textY + 50);

        //Quit Button
        Button quitbtn = new Button();
        quitbtn.setText("QUIT");
        quitbtn.setPrefSize(100,50);
        quitbtn.setTranslateX(textX + 50);
        quitbtn.setTranslateY(textY + 100);
        vbox.getChildren().addAll(playbtn, quitbtn);


        //Add play button to screen
        StackPane layout = new StackPane();
        layout.setPrefSize(200, 190);
        layout.getChildren().add(vbox);
        StackPane.setAlignment(vbox, Pos.CENTER);

        //Setting the Scene

        root.getChildren().addAll(welcome, layout);



        stage.setTitle("Spirit Bear Game");
        stage.setScene(scene);
        stage.show();
    }


}
