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

public class Tech5 extends android.support.v4.app.Fragment {

    Button mockplace,seminar,ultimatejugadoo;

    View view;
    public Tech5() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tech5,container,false);

        mockplace = view.findViewById(R.id.mockplace_btn);
        mockplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","mockplace");
                startActivity(i);
            }
        });

        seminar = view.findViewById(R.id.seminar_btn);
        seminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","seminar");
                startActivity(i);
            }
        });

        ultimatejugadoo = view.findViewById(R.id.ultimatejug_btn);
        ultimatejugadoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","ultimate");
                startActivity(i);
            }
        });

        return view;
    }
}
