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

public class Cultural4 extends android.support.v4.app.Fragment {

    Button ice,tshirt;

    View view;
    public Cultural4() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        view = inflater.inflate(R.layout.cultural4,container,false);
        ice = view.findViewById(R.id.ice_4_2_detail);
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","ice");
                startActivity(i);
            }
        });

        tshirt = view.findViewById(R.id.tshirt_4_3_detail);
        tshirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),CulturalShowMore.class);
                i.putExtra("event","tshirt");
                startActivity(i);
            }
        });
        return view;
    }
}
