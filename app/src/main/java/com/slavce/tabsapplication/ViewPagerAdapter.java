package com.slavce.tabsapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int NUM_OF_SCREENS = 3;

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        int pos = position + 1;
        return FirstFragment.newInstance("This is page " + pos);
    }

    @Override
    public int getCount() {
        return NUM_OF_SCREENS;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        int pos = position+1;
        return "Page " + pos;
    }
}
