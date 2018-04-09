package com.example.charmi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowMoreActivity extends AppCompatActivity {

    TextView detail;
    private StringBuilder text = new StringBuilder();
    String fname,event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_more);

        detail = findViewById(R.id.detail);
        BufferedReader reader = null;

        Intent i = getIntent();
        event = i.getStringExtra("event");

        switch (event){
            case "roborace":
                fname = "roborace.txt";
                break;
            case "warbots":
                fname = "warbots.txt";
                break;
            case "huntronics":
                fname = "huntronics.txt";
                break;
            case "hackathon":
                fname = "hackathon.txt";
                break;
            case "kon":
                fname = "kon.txt";
                break;
            case "product":
                fname = "product.txt";
                break;
            case "dome":
                fname = "dome.txt";
                break;
            case "jigsaw":
                fname = "jigsaw.txt";
                break;
            case "techtravesty":
                fname = "techtravesty.txt";
                break;
            case "exquiz":
                fname = "exquiz.txt";
                break;
            case "nfs":
                fname = "nfs.txt";
                break;
            case "counterstrike":
                fname = "counterstrike.txt";
                break;
            case "codejam":
                fname = "codejam.txt";
                break;
            case "gamingblur":
                fname = "gamingblur.txt";
                break;
            case "fifa":
                fname = "fifa.txt";
                break;
            case "hardwarerush":
                fname = "hardwarerush.txt";
                break;
            case "thegeek":
                fname = "thegeek.txt";
                break;
            case "socialite":
                fname = "socialite.txt";
                break;
            case "skyscrapper":
                fname = "skyscrapper.txt";
                break;
            case "rackup":
                fname = "rackup.txt";
                break;
            case "hydroarm":
                fname = "hydro.txt";
                break;
//            case "talkon":
//                fname = "";
//                break;
            case "hydrauliclift":
                fname = "hydrauliclift.txt";
                break;
            case "surgical":
                fname = "surgical.txt";
                break;
            case "elite":
                fname = "elite.txt";
                break;
            case "quizo":
                fname = "quizo.txt";
                break;
            case "managequiz":
                fname = "manage.txt";
                break;
            case "technodetective":
                fname = "detective.txt";
                break;
            case "roadrunner":
                fname = "roadrunner.txt";
                break;
            case "moviemaking":
                fname = "movie.txt";
                break;
            case "workshop3d":
                fname = "workshop3d.txt";
                break;
            case "techgenisis":
                fname = "genisis.txt";
                break;
            case "poignant":
                fname = "poignant.txt";
                break;
            case "filmotsav":
                fname = "filmotsav.txt";
                break;
            case "techraiders":
                fname = "techraiders.txt";
                break;
            case "wizardofbiz":
                fname = "wizardofbizz.txt";
                break;
            case "troubleshoot":
                fname = "troubleshoot.txt";
                break;
            case "chemequiz":
                fname = "chemequize.txt";
                break;
            case "technotalk":
                fname = "technotalk.txt";
                break;
            case "businessmodel":
                fname = "businessmodel.txt";
                break;
            case "chemoart":
                fname = "chemoart.txt";
                break;
            case "chemesnap":
                fname = "chemesnap.txt";
                break;
            case "mechmystro":
                fname = "mechmystro.txt";
                break;
            case "resistance":
                fname = "resistance.txt";
                break;
            case "simulation":
                fname = "simulation.txt";
                break;
//            case "seminar4": //civil
//                fname = "seminar";
//                break;
            case "autocad":
                fname = "autocad.txt";
                break;
            case "fifa_ce":
                fname = "fifa.txt";
                break;
            case "fifa_it":
                fname = "game.txt";
                break;
            case "respectgeek":
                fname = "respect.txt";
                break;
            case "chemillusion":
                fname = "chemillusion.txt";
                break;
            case "codecrunch":
                fname = "codecrunch.txt";
                break;
            case "technomine":
                fname = "technomine.txt";
                break;
            case "mockplace":
                fname = "mock.txt";
                break;
            case "seminar": // IT
                fname = "seminar.txt";
                break;
            case "ultimate":
                fname = "jugadoo.txt";
                break;

            }


        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(fname)));

            // do reading, usually loop until end of file reading
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                text.append(mLine);
                text.append('\n');
            }
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }

            //detail.setScrollbarFadingEnabled(false);
            detail.setText((CharSequence) text);


        }
    }
}
