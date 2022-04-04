package ca.bcit.comp2522.termproject.spiritbear;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class WelcomeScreen extends Application {
    public static void main(String[] args) {Application.launch(args);}
    Stage1 stage1 = new Stage1();
    //Play button
    Button playbtn = new Button();
    Button quitbtn = new Button();
    private ImageView Background;


    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        VBox vbox = new VBox(new Separator(Orientation.VERTICAL));
        Image bgImage = new Image("welcome-screen3.png", true);


        final int appHeight = 800;
        final int appWidth = 500;
        final double textX = (appWidth / 2 ) - 100;
        final double textY = (appHeight / 2);

       Background = new ImageView(bgImage);

        //btn QUIT
        quitbtn.setText("QUIT");
        quitbtn.setPrefSize(100,50);
        quitbtn.setTranslateX(textX + 50);
        quitbtn.setTranslateY(textY + 100);
        quitbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });

        //btn PLAY
        playbtn.setText("PLAY");
        playbtn.setPrefSize(100,50);
        playbtn.setTranslateX(textX + 50);
        playbtn.setTranslateY(textY + 50);
        playbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage1.start(stage);
            }
        });


        vbox.getChildren().addAll(playbtn, quitbtn);


        Text welcome = new Text(textX, textY - 100, "Welcome to Adventures of Spiritbear!");
        welcome.setTextAlignment(TextAlignment.CENTER);

        StackPane layout = new StackPane();
        layout.setPrefSize(200, 190);
        layout.getChildren().add(vbox);
        StackPane.setAlignment(vbox, Pos.CENTER);

        root.getChildren().addAll(Background);


        root.getChildren().addAll(welcome, layout);
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK); //Color.black sets the background to black


        stage.setTitle("Spirit Bear Game");
        stage.setScene(scene);
        stage.show();
    }
}
