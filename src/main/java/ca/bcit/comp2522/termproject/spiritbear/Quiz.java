package ca.bcit.comp2522.termproject.spiritbear;

import java.util.HashMap;

public class Quiz {
    protected final String question;
    protected final String correctAnswer;
    protected final String [] answerList;


    HashMap<Integer, String> questionHashMap = new HashMap<>(){{
        //Stage 1 Whistler
        put(41, "What made Whistler so famous?");
        put(42, "What is name of the mountain on Whistler?");
        put(43, "What town is between Whistler and Vancouver");
        put(44, "What is the name of the highway that leads to Whistler?");
        put(45, "What are the two best seasons to visit Whistler");

        //Stage 2 Beach
        put(6, "Which beach is just before Stanley Park?");
        put(26, "How many season can you experience in Vancouver?");
        put(32, "Is it safe to swim in the waters off Vancouver beaches?");
        put(23, "What is the name of the big park next to Downtown Vancouver?");
        put(15, "What is Canada's Capital City?");

        //Stage 3 Cypress
        put(27, "Pick the correct names of the local mountains that allow outdoor Winter Activities");
        put(21, "What is Canada's official animal?");
        put(18, "What is Vancouver's nickname?");
        put(11, "What is Canada's national sport?");
        put(12, "What is the name of Vancouver's NHL hockey team?");

        //Stage 4 Vancouver
        put(7, "What is a double double?");
        put(8, "What is a Loonie?");
        put(9, "What is a Toonie?");
        put(10, "What year did Vancouver host the Winter Olympic Games?");
        put(14, "What day is Canada Day?");

        //Stage 5 YVR
        put(28, "What is the name of the Island that Richmond and YVR is on?");

        //Extra
        put(13, "What year did Canada gain it's independence?");

        put(16, "What is British Columbia's capital city?");
        put(17, "What attraction can be found in GasTown?");
        put(19, "What is the name of Vancouver's Airport");
        put(20, "What are the official languages of Canada?");
        put(22, "When did Vancouver host the World Exposition?");
        put(24, "What was the NBA team that called Vancouver home at one point in time?");
        put(25, "What's the nickname for people who live in Vancouver?");
        put(29, "What type of leaf is on Canada's national flag?");
        put(30, "What are the two colors in Canada's flag?");
        put(31, "Do you enjoy Vancouver and Canada?");

    }};

    HashMap<Integer, String> answerHashMap = new HashMap<>(){{
        put(41, "The winter olympics!");
        put(42, "BlackComb");
        put(43, "Squamish");
        put(44, "Sea to Sky");
        put(45, "Any Season");
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
        put(17, "Gastown Steam Clock");
        put(18, "Vancity");
        put(19, "YVR");
        put(20, "English and French");
        put(21, "Beaver");
        put(22, "1987");
        put(23, "Stanley Park");
        put(24, "Vancouver Grizzlies");
        put(25, "Vancouverites");
        put(26, "All four seasons!");
        put(27, "Seymour, Grouse, and Cypress");
        put(28, "Lulu Island");
        put(29, "Maple leaf");
        put(30, "Red and White");
        put(31, "Yes!");
        put(32, "Of course!");
    }};

    HashMap<Integer, String []> answerListHashMap = new HashMap<>(){{
       put(41, new String[]{"The mountains!", "The scenery!", "The winter olympics!", "The Sea to Sky Highway"});
       put(42, new String[]{"BlackComb", "Whistler", "Cypress", "Bear"});
       put(43, new String[]{"Seattle", "Bellingham", "Squamish", "Victoria"});
       put(44, new String[]{"Sea to Sky", "Highway 1", "Freedom", "Route 66"});
       put(45, new String[]{"Spring", "Summer", "Winter", "Any Season"});
       put(6, new String[]{"English Bay", "Birch Bay", "Iona Park", "White Rock"});
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
       put(17, new String[]{"Beach", "Bars", "Gastown Steam Clock", "Shopping"});
       put(18, new String[]{"Vanity", "Vancity", "Rain Vancouver", "BC#1"});
       put(19, new String[]{"Vancouver Airport", "YVR", "Vancouver International Airport", "Airport Vancouver"});
       put(20, new String[]{"English and French", "English", "French", "English and Spanish"});
       put(21,new String[]{"Deer", "Caribou", "Beaver", "Black Bear"});
       put(22,new String[]{"1988", "1980", "1986", "1982"});
       put(23,new String[]{"Vancouver Park", "Stanley Park", "Lion Park", "Big Trees Park"});
       put(24,new String[]{"Vancouver Grizzlies", "Vancouver Orcas", "Vancouver Basketball", "Vancouver Polars"});
       put(25,new String[]{"Vanpeeps", "Vancouverites", "Vancooverites", "Vancouverians"});
       put(26,new String[]{"Vancouver only has summer and winter", "Vancouver has 3! Summer, Autumn and Winter",
               "All four seasons!", "Vancouver only has one season, RAIN."});
       put(27,new String[]{"Seymour, Grouse, and Cypress", "Cypress, Baker, Burnaby", "Cypress and Grouse",
               "Seymour and Cypress"});
       put(28,new String[]{"Richmond Island", "Vancouver Island", "Lulu Island", "Moody Island"});
       put(29,new String[]{"Maple leaf", "Poplar leaf", "Oak leaf", "Ash leaf"});
       put(30,new String[]{"Blue and Green", "Red and White", "Red and Black", "Red, White, and Blue"});
       put(31,new String[]{"No!", "It's Okay", "Could be better", "Yes!"});
       put(32,new String[]{"Of Course!", "No it's gross", "Ocean water? Yuck!", "maybe?"});
    }};



    public Quiz(final int npcid) {
        this.question = questionHashMap.get(npcid);
        this.correctAnswer = answerHashMap.get(npcid);
        this.answerList = answerListHashMap.get(npcid);
    }

}
