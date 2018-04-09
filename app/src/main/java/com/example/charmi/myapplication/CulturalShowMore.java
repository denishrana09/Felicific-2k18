package com.example.charmi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CulturalShowMore extends AppCompatActivity {

    EditText rules;
    TextView fees,limit,team,winners,judge,eventname;
    DetailedCultural d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cultural_show_more);

        DetailedCultural d1 = new DetailedCultural("Hairstyle, Makeup",
                "Participants have to bring one partner(without makeup or any hairstyle) with them Single Participant.\n"+
                "Materials have to be brought by the participants.\n"+
                "You are free to use materials except buns, wigs and electrical appliances.\n"+
                "No material will provided by Organization.\n",
                "1",
                "30 Rs.",
                "1 hour 15 min",
                "depending on registration",
                "Best hair style and make up to be selected.\n"+
                "Best out of all will be selected.");
        DetailedCultural d2 = new DetailedCultural("Mehendi",
                "Participant has to bring one partner with them.\n" +
                        "Single participant\n" +
                        "Readymade mehendi stickers can not be used.\n" +
                        "Mehndi cone has to be brought by participant\n" +
                        "Participant has to do mehndi on both sides of single hand.\n" +
                        "Mehndi design can be of any type depending on the participant.",
                "1",
                "30 Rs.",
                "1 hour",
                "Depending on Registration",
                "Scores are based on creativity ,number of shapes and cleanliness");
        DetailedCultural d5 = new DetailedCultural("Musical chair","Group of x participants can play with x-1 chairs","1","10 Rs./Person","2 hours","1",
                "The last one who acquires the chair will be the winner.\n" +
                "Discipline should be maintained.\n" +
                "If any participants arguing with volunteers that will be disqualify immediately");
        DetailedCultural d3 = new DetailedCultural("Rangoli","Readymade stickers can not be used.\n" +
                "Materials have to be brought by the  participants\n" +
                "Materials like flowers ,rice, dal, mirrors, \n" +
                "powder colors can be used\n" +
                "Rangoli has been made from scratch.\n" +
                "Area of 4ft*4ft will be provided.","1","30 Rs.","1 hour","Depending on Registration",
                "Scores are based on creativity , number of shapes and cleanliness");
        DetailedCultural d4 = new DetailedCultural("Funk from Junk","Participants will be given 1 hour.\n" +
                "Single participant.\n" +
                "The required waste material and stationery like scissor, thread, etc. should be brought by the participants.\n" +
                "Waste material could be anything like tetra packs, bottles, newspapers, jute material otherwise would be thrown away\n" +
                "The material would be rejected if not found to be a waste product or second hand item.\n" +
                "No ready or semi-finished model or matter would be accepted from participant in competition.",
                "1","30 Rs.","1 hour","Depending On Registration",
                "Scores are based on creativity.");
        DetailedCultural d7 = new DetailedCultural("T-shirt painting",
                "Single participant only.\n" +
                        "Participants will be given 1 hour.\n" +
                        "Participants will use FABRIC COLOURS only to paint on White T-Shirts. \n" +
                        "Theme for T-shirt painting is on “Women’s day”.\n" +
                        "The patterns and message on T-shirt must be according to the theme of the day.\n" +
                        "Any untidy work will be disqualified.\n" +
                        "All participants must bring brush, colour palette & all material required for painting.",
                "1",
                "100 Rs.","1","Depending on Registration",
                "Scores are based on creativity ,number of shapes and cleanliness");
        DetailedCultural d6 = new DetailedCultural("Ice cream sticks modelling",
                "Single Participants\n" +
                        "Ice cream sticks and glue will be provided to participant\n" +
                        "Other materials like colors will be brought by the participant.",
                "1",
                "30 Rs.","1 hour","Depending on Registration",
                "Scores are based on creativity ,number of shapes and cleanliness");

        DetailedCultural d8 = new DetailedCultural("Paper Origami",
                "Single Participant\n" +
                        "Participant have to brought their chart papers\n" +
                        "The paper should not be cut or torn, so please refrain from using scissors or rulers for cutting paper and also refrain from using glue.\n" +
                        "No other materials will be allowed\n" +
                        "Origami will have to be made from scratch.",
                "1",
                "30 Rs.","1 hour","Depending on Registration",
                "Scores are based on creativity ,number of shapes and cleanliness");

        Intent intent = getIntent();
        String eName = intent.getStringExtra("event");

        rules = findViewById(R.id.rules_tv);
        fees = findViewById(R.id.fees_tv);
        team = findViewById(R.id.team_size_tv);
        limit = findViewById(R.id.timelimit_tv);
        eventname = findViewById(R.id.eventname_tv);
        winners = findViewById(R.id.winners_tv);
        judge = findViewById(R.id.judge_tv);


        switch (eName){
            case "mehendi":
                d = d2;
                break;
            case "makeup":
                d = d1;
                break;
            case "rangoli":
                d = d3;
                break;
            case "funk":
                d = d4;
                break;
            case "musical":
                d = d5;
                break;
            case "ice":
                d = d6;
                break;
            case "tshirt":
                d = d7;
                break;
            case "paper":
                d = d8;
                break;
        }

        eventname.setText(d.eventname);
        rules.setText(d.rules);
        fees.setText(d.fees);
        team.setText(d.teamsize);
        limit.setText(d.limit);
        winners.setText(d.winners);
        judge.setText(d.judge);

    }

    public class DetailedCultural{
        String eventname,rules,teamsize,fees,limit,winners,judge;

        public DetailedCultural(String eventname, String rules, String teamsize, String fees, String limit, String winners, String judge) {
            this.eventname = eventname;
            this.rules = rules;
            this.teamsize = teamsize;
            this.fees = fees;
            this.limit = limit;
            this.winners = winners;
            this.judge = judge;
        }

    }
}
