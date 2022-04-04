package ca.bcit.comp2522.termproject.spiritbear;

public abstract class Quiz {
    protected final String question;
    protected final String answer;
    protected final String hint;

    public Quiz(String question, String answer, String hint) {
        this.question = question;
        this.answer = answer;
        this.hint = hint;
    }
}
