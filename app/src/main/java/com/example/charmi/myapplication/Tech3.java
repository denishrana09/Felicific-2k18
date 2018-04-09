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

public class Tech3 extends android.support.v4.app.Fragment {

    Button rackup,hydroarm,hydrauliclift,surgical,elite,quizo,
            managequiz,technodetective,roadrunner,moviemaking,
            workshop3d,techgenisis,poignant,filmotsav,techraiders,wizardofbiz
            ,troubleshoot,chemequiz,technotalk,businessmodel;

    View view;
    public Tech3() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tech3,container,false);

        rackup = view.findViewById(R.id.rack_up_btn);
        rackup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","rackup");
                startActivity(i);
            }
        });

        hydroarm = view.findViewById(R.id.hydroarm_btn);
        hydroarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","hydroarm");
                startActivity(i);
            }
        });

//        talkon = view.findViewById(R.id.talkon_btn);
//        talkon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getContext(),ShowMoreActivity.class);
//                i.putExtra("event","talkon");
//                startActivity(i);
//            }
//        });

        hydrauliclift = view.findViewById(R.id.hydroliclift_btn);
        hydrauliclift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","hydrauliclift");
                startActivity(i);
            }
        });

        surgical = view.findViewById(R.id.surgical_btn);
        surgical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","surgical");
                startActivity(i);
            }
        });

        elite = view.findViewById(R.id.elite_btn);
        elite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","elite");
                startActivity(i);
            }
        });

        quizo = view.findViewById(R.id.quizo_btn);
        quizo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","quizo");
                startActivity(i);
            }
        });

        managequiz = view.findViewById(R.id.managementquiz_btn);
        managequiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","managequiz");
                startActivity(i);
            }
        });

        technodetective = view.findViewById(R.id.technodetective_btn);
        technodetective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","technodetective");
                startActivity(i);
            }
        });

        roadrunner = view.findViewById(R.id.roadrunner_btn);
        roadrunner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","roadrunner");
                startActivity(i);
            }
        });

        moviemaking = view.findViewById(R.id.moviemaking_btn);
        moviemaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","moviemaking");
                startActivity(i);
            }
        });

        workshop3d = view.findViewById(R.id.workshop3d_btn);
        workshop3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","workshop3d");
                startActivity(i);
            }
        });

        techgenisis = view.findViewById(R.id.techgenisis_btn);
        techgenisis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","techgenisis");
                startActivity(i);
            }
        });

        poignant = view.findViewById(R.id.poignant_btn);
        poignant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","poignant");
                startActivity(i);
            }
        });

        filmotsav = view.findViewById(R.id.filmotsav_btn);
        filmotsav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","filmotsav");
                startActivity(i);
            }
        });

        techraiders = view.findViewById(R.id.techraiders_btn);
        techraiders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","techraiders");
                startActivity(i);
            }
        });

        wizardofbiz = view.findViewById(R.id.wizardofbiz_btn);
        wizardofbiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","wizardofbiz");
                startActivity(i);
            }
        });

        troubleshoot = view.findViewById(R.id.troubleshoot_btn);
        troubleshoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","troubleshoot");
                startActivity(i);
            }
        });

        chemequiz = view.findViewById(R.id.chemequiz_btn);
        chemequiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","chemequiz");
                startActivity(i);
            }
        });

        technotalk = view.findViewById(R.id.technotalk3_btn);
        technotalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","technotalk");
                startActivity(i);
            }
        });

        businessmodel = view.findViewById(R.id.businessmodel_btn);
        businessmodel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","businessmodel");
                startActivity(i);
            }
        });

        return view;
    }
}
