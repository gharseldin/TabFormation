package com.example.copperadmin.tabformation;





import android.app.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.copperadmin.tabformation.view.SlidingTabLayout;


public class ActivityFeed extends FragmentActivity {

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_activity_feed);


        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        FragmentManager fm = getSupportFragmentManager();
        mViewPager.setAdapter(new ActivityFeedAdapter(fm));

        mSlidingTabLayout = (SlidingTabLayout)findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setCustomTabView(R.layout.tab_title, R.id.title);
        mSlidingTabLayout.setSelectedIndicatorColors(Color.rgb(42, 132, 155));
        mSlidingTabLayout.setViewPager(mViewPager);
    }


    class SamplePagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return o == view;
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

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
//TODO inflate the appropriate resources here
            // Inflate a new layout from our resources
            View view = getLayoutInflater().inflate(R.layout.item,
                    container, false);
//            // Add the newly created View to the ViewPager
            container.addView(view);
//
//            // Retrieve a TextView from the inflated View, and update it's text
//            TextView title = (TextView) view.findViewById(R.id.item_title);
//            title.setText(String.valueOf(position + 1));

            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

    }

}
