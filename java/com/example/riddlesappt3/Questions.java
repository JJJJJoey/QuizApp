package com.example.riddlesappt3;

public class Questions {
    public static String mQuestions[]= new String []{
            "What has roots as nobody sees,\n" +
                    "Is taller than trees,\n" +
                    "Up, up it goes,\n" +
                    "And yet never grows?\n",
            "Thirty white horses on a red hill,\n" +
                    "First they champ,\n" +
                    "Then they stamp,\n" +
                    "Then they stand still.\n",
            "Voiceless it cries,\n" +
                    "Wingless flutters,\n" +
                    "Toothless bites,\n" +
                    "Mouthless mutters.\n",
            "An eye in a blue face\n" +
                    "Saw an eye in a green face.\n" +
                    "\"That eye is like to this eye\"\n" +
                    "Said the first eye,\n" +
                    "\"But in low place,\n" +
                    "Not in high place.\"\n",
            "It cannot be seen, cannot be felt,\n" +
                    "Cannot be heard, cannot be smelt.\n" +
                    "It lies behind stars and under hills,\n" +
                    "And empty holes it fills.\n" +
                    "It comes first and follows after,\n" +
                    "Ends life, kills laughter.\n",
            "A box without hinges, key, or lid,\n" +
                    "Yet golden treasure inside is hid.\n"
    };

    private String mAnswers[][]= {
            {"mountain","cloud","hill"},
            {"teeth","horse","soldier"},
            {"cloud","wind","baby"},
            {"house","fire","sun"},
            {"mountain","dream","dark"},
            {"chest","wood","egg"}
    };
    private String mCorrectAnswers[]={"mountain","teeth","wind","sun","dark","egg"};

    //the methods are going to return the questions the choices and the correct answers

    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }
    public String getAnswer1(int a){
        String answer0= mAnswers[a][0];
        return answer0;
    }
    public String getAnswer2(int a){
        String answer1= mAnswers[a][1];
        return answer1;
    }
    public String getAnswer3(int a){
        String answer2= mAnswers[a][2];
        return answer2;
    }
    public String getAnswer4(int a){
        String answer3= mAnswers[a][3];
        return answer3;
    }
    public String getAnswer5(int a){
        String answer4= mAnswers[a][4];
        return answer4;
    }
    public String getAnswer6(int a){
        String answer5= mAnswers[a][5];
        return answer5;
    }


    public String getCorrectAnswer(int a){
        String answer= mCorrectAnswers[a];
        return answer;
    }

}
