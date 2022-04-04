package ca.bcit.comp2522.termproject.spiritbear;

public class Stage1Quiz extends Quiz{

    public Stage1Quiz(String question, String answer, String hint) {
        super(question, answer, hint);
    }
    private final String q1 = """
            When did Vancouver host the Olympics?
            (a) 2010
            (b) 2006
            (c) 2014""";

    private final String q1hint = "The year is divisible by 5";

    private final String q2 = """
            What is a double double?
            (a) two toonies?
            (b) two ten dollar bills!
            (c) two cream two sugar!
            """;
    private final String q2hint = "Things you may add to your coffee. Unless you enjoy it black and bitter.";

    private final String q3 = """
            What year did Canada gain it's independence?
            (a) 1867
            (b) 1812
            (c) 1949
            """;

    private final String q3hint = "Canada celebrated it's 150th birthday in 2017.";

    private final String q4 = """
            What day is Canada Day?
            (a) July 4th!
            (b) November 11th!
            (c) July 1st!
            """;

    private final String q4hint = "Its the first day of a month!";


    Quiz [] stg1Quizzes = {
            new Stage1Quiz(q1, "a", q1hint),
            new Stage1Quiz(q2, "c", q2hint),
            new Stage1Quiz(q3, "a", q3hint),
            new Stage1Quiz(q4, "a", q4hint),
    };

    public Quiz[] getStg1Quizzes() {
        return stg1Quizzes;
    }
}
