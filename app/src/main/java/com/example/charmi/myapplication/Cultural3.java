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

public class Cultural3 extends android.support.v4.app.Fragment {

    Button paper,funk,musical;

    View view;
    public Cultural3() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        view = inflater.inflate(R.layout.cultural3,container,false);
        paper = view.findViewById(R.id.paper_3_1_detail);
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","paper");
                startActivity(i);
            }
        });

        funk = view.findViewById(R.id.bestfromwaste_3_2_detail);
        funk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","funk");
                startActivity(i);
            }
        });

        musical = view.findViewById(R.id.mus_chair_3_5_detail);
        musical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","musical");
                startActivity(i);
            }
        });
        return view;
    }
}
