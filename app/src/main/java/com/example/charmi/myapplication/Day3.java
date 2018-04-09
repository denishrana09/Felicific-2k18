package com.example.charmi.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Day3 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewpager;
    private AppBarLayout appbarlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);
        appbarlayout =(AppBarLayout)findViewById(R.id.appbarid3);
        tabLayout =(TabLayout)findViewById(R.id.tablayoutid3);
        viewpager =(ViewPager) findViewById(R.id.viewpagerid3);

        ViewPagerAdapter3 adapter = new ViewPagerAdapter3(getSupportFragmentManager());

        adapter.AddFragment(new Tech3(),"Technical");
        adapter.AddFragment(new Central3(),"CentralTech");
        adapter.AddFragment(new Cultural3(),"Cultural");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
