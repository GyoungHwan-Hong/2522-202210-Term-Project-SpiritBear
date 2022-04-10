package ca.bcit.comp2522.termproject.spiritbear;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class QustionAnswerBox extends ChoiceDialog {


    private List<String> dialogData;
    private String selected;


    public QustionAnswerBox(int id) {
        int npcid = id;

        final String [] answerData = {"First", "Second", "Third", "Fourth"};

        dialogData = Arrays.asList(answerData);
        ChoiceDialog dialog = new ChoiceDialog(dialogData.get(0), dialogData);
        dialog.setTitle("NPC NAME");
        dialog.setHeaderText("Here is the quiz");
        dialog.setContentText("Answer");

        Optional<String> result = dialog.showAndWait();

        selected = "cancelled.";

        if (result.isPresent()) {
            selected = result.get();
        }
    }

    public String getUserChoice() {
        return selected;
    }

}
