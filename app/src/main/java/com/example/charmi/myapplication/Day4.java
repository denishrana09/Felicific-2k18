package com.example.charmi.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Day4 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewpager;
    private AppBarLayout appbarlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day4);
        appbarlayout =(AppBarLayout)findViewById(R.id.appbarid4);
        tabLayout =(TabLayout)findViewById(R.id.tablayoutid4);
        viewpager =(ViewPager) findViewById(R.id.viewpagerid4);

        ViewPagerAdapter4 adapter = new ViewPagerAdapter4(getSupportFragmentManager());

        adapter.AddFragment(new Tech4(),"Technical");
        adapter.AddFragment(new Central4(),"CentralTech");
        adapter.AddFragment(new Cultural4(),"Cultural");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
