package com.example.charmi.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Day5 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewpager;
    private AppBarLayout appbarlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day5);
        appbarlayout =(AppBarLayout)findViewById(R.id.appbarid5);
        tabLayout =(TabLayout)findViewById(R.id.tablayoutid5);
        viewpager =(ViewPager) findViewById(R.id.viewpagerid5);

        ViewPagerAdapter5 adapter = new ViewPagerAdapter5(getSupportFragmentManager());

        adapter.AddFragment(new Tech5(),"Technical");
        adapter.AddFragment(new Central5(),"CentralTech");
        adapter.AddFragment(new Cultural5(),"Cultural");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
