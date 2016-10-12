package com.iamdeveloper.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by IamDeveloper on 10/12/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    private static int NUMBER = 3;
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OneFragment();
            case 1:
                return new TwoFragment();
            case 2:
                return new ThreeFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return NUMBER;
    }
}
