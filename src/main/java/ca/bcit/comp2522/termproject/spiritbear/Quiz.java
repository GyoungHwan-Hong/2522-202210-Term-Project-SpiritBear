package ca.bcit.comp2522.termproject.spiritbear;

import java.util.HashMap;

public class Quiz {
    protected final String question;
    protected final String correctAanswer;
    protected final String [] answerList;


    HashMap<Integer, String> questionHashMap = new HashMap<>(){{
        put(1, "What do you the most favorite food?");
        put(2, "Who is the most your lovely person?");
    }};

    HashMap<Integer, String> answerHashMap = new HashMap<>(){{
        put(1, "Kimchi");
        put(2, "Aimee");
    }};

    HashMap<Integer, String []> answerListHashMap = new HashMap<>(){{
       put(1, new String[]{"Hello", "Kimchi", "Rice", "Meat"});
       put(2, new String[]{"Aimee", "Fog", "Dona", "Leaf"});
    }};



    public Quiz(final int npcid) {
        this.question = questionHashMap.get(npcid);
        this.correctAanswer = answerHashMap.get(npcid);
        this.answerList = answerListHashMap.get(npcid);
    }

}
