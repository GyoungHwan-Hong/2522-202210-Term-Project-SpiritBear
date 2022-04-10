package ca.bcit.comp2522.termproject.spiritbear;

import javafx.scene.control.ChoiceDialog;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class QustionAnswerBox extends ChoiceDialog {


    private List<String> dialogData;
    private String selected;
    private Quiz quiz;

    public QustionAnswerBox(int id) {
        int npcid = id;

         quiz = new Quiz(id);


        final String [] answerData = quiz.answerList;

        dialogData = Arrays.asList(answerData);
        ChoiceDialog dialog = new ChoiceDialog(dialogData.get(0), dialogData);
        dialog.setTitle("NPC NAME");
        dialog.setHeaderText(quiz.question);
        dialog.setContentText("Answer");

        Optional<String> result = dialog.showAndWait();

        selected = "cancelled.";

        if (result.isPresent()) {
            selected = result.get();
        }
    }

    public boolean getUserChoice() {
        System.out.println(selected);
        System.out.println(quiz.correctAnswer);
        if (selected == quiz.correctAnswer) {
            return true;
        } else {
            return false;
        }
    }
}
