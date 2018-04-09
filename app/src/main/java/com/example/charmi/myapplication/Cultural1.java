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

public class Cultural1 extends android.support.v4.app.Fragment {

    View view;
    Button mehendi,makeup;//musical,rangoli,bestfromwaste,tshirt,icecream;

    public Cultural1() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.cultural1,container,false);

        mehendi = view.findViewById(R.id.mehendi_1_2_showmore);
        mehendi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","mehendi");
                startActivity(i);
            }
        });

        makeup = view.findViewById(R.id.makeup_1_3_showmore);
        makeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","makeup");
                startActivity(i);
            }
        });

        return view;
    }
}
