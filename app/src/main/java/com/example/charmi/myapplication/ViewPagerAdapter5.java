package com.example.charmi.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charmi on 19-02-2018.
 */

public class ViewPagerAdapter5 extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList= new ArrayList<>();
    private final List<String> FragmentListTitle = new ArrayList<>();

     public ViewPagerAdapter5(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)  {
        return fragmentList.get(position);

    }

    @Override
    public int getCount() {
        return FragmentListTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitle.get(position);
    }

    public void AddFragment(Fragment  fragment , String Title){
         fragmentList.add(fragment);
         FragmentListTitle.add(Title);
    }
}
