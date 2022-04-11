package ca.bcit.comp2522.termproject.spiritbear;

import java.util.HashMap;

public class Quiz {
    protected final String question;
    protected final String correctAnswer;
    protected final String [] answerList;


    HashMap<Integer, String> questionHashMap = new HashMap<>(){{
        put(1, "What made Whistler so famous?");
        put(2, "What is name of the mountain on Whistler?");
        put(3, "What town is between Whistler and Vancouver");
        put(4, "What is the name of the highway that leads to Whistler?");
        put(5, "What are the two best seasons to visit Whistler");
        put(6, "Which beach is just before Stanley Park?");

    }};

    HashMap<Integer, String> answerHashMap = new HashMap<>(){{
        put(1, "The 2010 olympics!");
        put(2, "BlackComb");
        put(3, "Squamish");
        put(4, "Sea to Sky");
        put(5, "Any Season");
        put(6, "English Bay");
    }};

    HashMap<Integer, String []> answerListHashMap = new HashMap<>(){{
       put(1, new String[]{"The mountains!", "The scenery!", "The 2010 olympics!", "The Sea to Sky Highway"});
       put(2, new String[]{"BlackComb", "Whistler", "Cypress", "Bear"});
       put(3, new String[]{"Seattle", "Bellingham", "Squamish", "Victoria"});
       put(4, new String[]{"Sea to Sky", "Highway 1", "Freedom", "Route 66"});
       put(5, new String[]{"Spring", "Summer", "Winter", "Any Season"});
       put(6, new String[]{"English Bay", "Summer", "Winter", "Any Season"});
    }};



    public Quiz(final int npcid) {
        this.question = questionHashMap.get(npcid);
        this.correctAnswer = answerHashMap.get(npcid);
        this.answerList = answerListHashMap.get(npcid);
    }

}
