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

public class Central2 extends android.support.v4.app.Fragment{

    Button warbots,roboracecont,huntronics;

    View view;
    public Central2() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.central2,container,false);

        warbots = view.findViewById(R.id.warbots_btn);
        warbots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","warbots");
                startActivity(i);
            }
        });

        roboracecont = view.findViewById(R.id.roborace_cont_btn);
        roboracecont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","roborace");
                startActivity(i);
            }
        });

        huntronics = view.findViewById(R.id.huntron_r1_btn);
        huntronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowMoreActivity.class);
                i.putExtra("event","huntronics");
                startActivity(i);
            }
        });

        return view;

    }
}
