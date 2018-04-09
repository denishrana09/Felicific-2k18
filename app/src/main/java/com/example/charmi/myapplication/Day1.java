package com.example.charmi.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Day1 extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewpager;
    private AppBarLayout appbarlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
        appbarlayout =(AppBarLayout)findViewById(R.id.appbarid1);
        tabLayout =(TabLayout)findViewById(R.id.tablayoutid1);
        viewpager =(ViewPager) findViewById(R.id.viewpagerid1);

        ViewPagerAdapter1 adapter = new ViewPagerAdapter1(getSupportFragmentManager());

        adapter.AddFragment(new Tech1(),"Technical");
        adapter.AddFragment(new Central1(),"CentralTech");
        adapter.AddFragment(new Cultural1(),"Cultural");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
