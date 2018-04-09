package com.example.charmi.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by charmi on 19-02-2018.
 */

public class Cultural5 extends android.support.v4.app.Fragment {

    View view;
    public Cultural5() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.cultural5,container,false);
        return view;
    }
}
