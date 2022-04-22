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
        put(7, "What is a double double?");
        put(8, "What is a Loonie?");
        put(9, "What is a Toonie?");
        put(10, "What year did Vancouver host the Winter Olympic Games?");
        put(11, "What is Canada's national sport?");
        put(12, "What is Vancouver's Hockey Team?");
        put(13, "What year did Canada gain it's independence?");
        put(14, "What day is Canada Day?");
        put(15, "What is Canada's Capital City?");
        put(16, "What is British Columbia's capital city?");
    }};

    HashMap<Integer, String> answerHashMap = new HashMap<>(){{
        put(1, "The winter olympics!");
        put(2, "BlackComb");
        put(3, "Squamish");
        put(4, "Sea to Sky");
        put(5, "Any Season");
        put(6, "English Bay");
        put(7, "Two cream and Two Sugar!");
        put(8, "$1 Coin");
        put(9, "$2 Coin");
        put(10, "2010");
        put(11, "Lacrosse");
        put(12, "Canucks");
        put(13, "1867");
        put(14, "July 1st");
        put(15, "Ottawa");
        put(16, "Victoria");
    }};

    HashMap<Integer, String []> answerListHashMap = new HashMap<>(){{
       put(1, new String[]{"The mountains!", "The scenery!", "The winter olympics!", "The Sea to Sky Highway"});
       put(2, new String[]{"BlackComb", "Whistler", "Cypress", "Bear"});
       put(3, new String[]{"Seattle", "Bellingham", "Squamish", "Victoria"});
       put(4, new String[]{"Sea to Sky", "Highway 1", "Freedom", "Route 66"});
       put(5, new String[]{"Spring", "Summer", "Winter", "Any Season"});
       put(7, new String[]{"2 Patties in a burger", "Two - Toonies", "Two - Loonies", "Two Cream and Two Sugar"});
       put(8, new String[]{"A bird", "One lunatic", "$1 Coin", "A Cartoon"});
       put(9, new String[]{"Two birds", "Two loonies", "Two - $1 Coins", "$2 Coin"});
       put(10, new String[]{"2006", "2010", "2014", "2008"});
       put(11, new String[]{"Soccer", "Hockey", "Figure Skating", "Lacrosse"});
       put(12, new String[]{"Raptors", "Grizzlies", "Canucks", "White Caps"});
       put(13, new String[]{"1867", "1949", "1812", "1999"});
       put(14, new String[]{"July 4th", "November 11th", "December 25th", "July 1st"});
       put(15, new String[]{"Washington", "Victoria", "Toronto", "Ottawa"});
       put(16, new String[]{"Vancouver", "Victoria Island", "Victoria", "Seattle"});
    }};



    public Quiz(final int npcid) {
        this.question = questionHashMap.get(npcid);
        this.correctAnswer = answerHashMap.get(npcid);
        this.answerList = answerListHashMap.get(npcid);
    }

}
