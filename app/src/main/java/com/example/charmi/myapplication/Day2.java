package com.example.charmi.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Day2 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewpager;
    private AppBarLayout appbarlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
        appbarlayout =(AppBarLayout)findViewById(R.id.appbarid2);
        tabLayout =(TabLayout)findViewById(R.id.tablayoutid2);
        viewpager =(ViewPager) findViewById(R.id.viewpagerid2);

        ViewPagerAdapter2 adapter = new ViewPagerAdapter2(getSupportFragmentManager());

        adapter.AddFragment(new Tech2(),"Technical");
        adapter.AddFragment(new Central2(),"CentralTech");
        adapter.AddFragment(new Cultural2(),"Cultural");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
