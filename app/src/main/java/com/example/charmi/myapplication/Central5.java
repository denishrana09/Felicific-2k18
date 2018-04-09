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

public class Central5 extends android.support.v4.app.Fragment{

    Button hackathon;

    View view;
    public Central5() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.central5,container,false);

        hackathon = view.findViewById(R.id.hakathon_btn);
        hackathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","hackathon");
                startActivity(i);
            }
        });

        return view;

    }
}
