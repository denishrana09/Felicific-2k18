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

public class Cultural2 extends android.support.v4.app.Fragment {

    Button rangoli;

    View view;
    public Cultural2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.cultural2,container,false);
        rangoli = view.findViewById(R.id.rangoli_2_3_showmore);
        rangoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","rangoli");
                startActivity(i);
            }
        });
        return view;
    }
}
