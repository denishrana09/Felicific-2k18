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

public class Tech4 extends android.support.v4.app.Fragment {

    Button chemoart,chemesnap,mechmystro,resistance,simulation
            ,codecrunch,technomine,technotalk,autocad,fifa,respectgeek,chemillusion,clash;

    View view;
    public Tech4() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tech4,container,false);

        chemoart = view.findViewById(R.id.chemoart_btn);
        chemoart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","chemoart");
                startActivity(i);
            }
        });

        chemesnap = view.findViewById(R.id.chemesnap_btn);
        chemesnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","chemesnap");
                startActivity(i);
            }
        });
        mechmystro = view.findViewById(R.id.mechmystro_btn);
        mechmystro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","mechmystro");
                startActivity(i);
            }
        });
        resistance = view.findViewById(R.id.resistance_btn);
        resistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","resistance");
                startActivity(i);
            }
        });
        simulation = view.findViewById(R.id.simulation_btn);
        simulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","simulation");
                startActivity(i);
            }
        });
//        nsemiar4 = view.findViewById(R.id.seminar4_btn);
//        seminar4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getContext(),ShowMoreActivity.class);
//                i.putExtra("event","seminar4");
//                startActivity(i);
//            }
//        });
        technotalk = view.findViewById(R.id.technotalk4_btn);
        technotalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","technotalk");
                startActivity(i);
            }
        });
        autocad = view.findViewById(R.id.autocad_btn);
        autocad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","autocad");
                startActivity(i);
            }
        });
        fifa = view.findViewById(R.id.fifa_it_btn);
        fifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","fifa_it");
                startActivity(i);
            }
        });

        clash = view.findViewById(R.id.clashroyal_btn);
        clash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","fifa_it");
                startActivity(i);
            }
        });

        respectgeek = view.findViewById(R.id.respectgeek_btn);
        respectgeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","respectgeek");
                startActivity(i);
            }
        });

        chemillusion = view.findViewById(R.id.chemillusion_btn);
        chemillusion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","chemillusion");
                startActivity(i);
            }
        });

        codecrunch = view.findViewById(R.id.codecrunch_btn);
        codecrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","codecrunch");
                startActivity(i);
            }
        });

        technomine = view.findViewById(R.id.technomine_btn);
        technomine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","technomine");
                startActivity(i);
            }
        });

        return view;
    }
}
