package com.espressif.iot_esptouch_demo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    private ListFragment fragmentList;
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
      //return PlaceholderFragment.newInstance(position + 1);
        switch (position)
        {
            case 0:
                return new LedPanelColorFragment();
            case 1:
                return new LedPanelPatternFragment();
        }
         return  null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.

        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
        }
        return null;
    }
}
