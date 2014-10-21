package com.example.copperadmin.tabformation;







import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Copper Admin on 10/20/2014.
 */
public class ActivityFeedAdapter extends FragmentStatePagerAdapter {

    private FragmentManager mFragmentManager;
    private Fragment mFragmentAtPos0;

    public ActivityFeedAdapter(FragmentManager fm)
    {
        super(fm);
        mFragmentManager = fm;

    }


    @Override
    public Fragment getItem(int i) {

        Fragment fragment = BlankFragment.newInstance(i);
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch(position){
            case 0:
                return "ALL UPDATES";
            case 1:
                return "MESSAGES";
            case 2:
                return "VISITORS";
            case 3:
                return "PROFILE UPDATES";
            case 4:
                return "PHOTOS UPDATES";
        }
        return "Item " + (position + 1);
    }
}

