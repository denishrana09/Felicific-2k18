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

public class Central3 extends android.support.v4.app.Fragment{

    Button huntronics1;

    View view;
    public Central3() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.central3,container,false);

        huntronics1 = view.findViewById(R.id.huntronics_r2_btn);
        huntronics1.setOnClickListener(new View.OnClickListener() {
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
