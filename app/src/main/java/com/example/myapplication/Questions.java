package com.example.myapplication;

public class Questions {

    public String mQuestions[] = {
            "Apa Warna Bendera Indonesia?",
            "Siapa Presiden Pertama Indonesia?",
            "Siapa Presiden Indonesia Sekarang?",
            "Tahun Berapa Indonesia Merdeka?",
            "Tahun Berapa Kemarin?",
            "Tahun Berapa Sekarang?",
    };
    private String mChoices[] [] = {
            {"Merah-Putih","Putih-Merah","Kuning","Hijau"},
            {"Soekarno","Ocin","Iqbal","Jokowi"},
            {"Jokowi","Soekarno","Habibie","Soeharto"},
            {"1945","1990","1567","1440"},
            {"2019","2023","2017","2057"},
            {"2020","2019","2028","2079"},
    };
    private String mcorrectAnswer[] = {"Merah-Putih","Soekarno","Jokowi","1945","2019","2020"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getchoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getchoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getchoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getchoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mcorrectAnswer[a];
        return answer;
    }

}

