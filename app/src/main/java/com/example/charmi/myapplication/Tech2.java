package com.example.charmi.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by charmi on 19-02-2018.
 */

public class Tech2 extends android.support.v4.app.Fragment {

    Button dome,jigsaw,techtravesty,exquiz,nfs,counterstrike
            ,codejam,gamingblur,fifa,hardwarerush,thegeek,socialite,skyscrapper;

    View view;
    public Tech2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tech2,container,false);

        dome = view.findViewById(R.id.dome_btn);
        dome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","dome");
                startActivity(i);
            }
        });

        jigsaw = view.findViewById(R.id.jigsaw_btn);
        jigsaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","jigsaw");
                startActivity(i);
            }
        });
        techtravesty = view.findViewById(R.id.tech_travesty_btn);
        techtravesty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","techtravesty");
                startActivity(i);
            }
        });
        exquiz = view.findViewById(R.id.exquizme_btn);
        exquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","exquiz");
                startActivity(i);
            }
        });
        nfs = view.findViewById(R.id.nfs_btn);
        nfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","nfs");
                startActivity(i);
            }
        });
        counterstrike = view.findViewById(R.id.counter_strike_btn);
        counterstrike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","counterstrike");
                startActivity(i);
            }
        });

        codejam = view.findViewById(R.id.codejam_btn);
        codejam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","codejam");
                startActivity(i);
            }
        });

        gamingblur = view.findViewById(R.id.gamingblur_btn);
        gamingblur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","gamingblur");
                startActivity(i);
            }
        });

        fifa = view.findViewById(R.id.fiface_btn);
        fifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","fifa_ce");
                startActivity(i);
            }
        });

        hardwarerush = view.findViewById(R.id.hardwarerush_btn);
        hardwarerush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","hardwarerush");
                startActivity(i);
            }
        });

        thegeek = view.findViewById(R.id.thegeek_btn);
        thegeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","thegeek");
                startActivity(i);
            }
        });

        socialite = view.findViewById(R.id.socialite_btn);
        socialite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","socialite");
                startActivity(i);
            }
        });

        skyscrapper = view.findViewById(R.id.skyscrapper_btn);
        skyscrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","skyscrapper");
                startActivity(i);
            }
        });


        return view;
    }
}
