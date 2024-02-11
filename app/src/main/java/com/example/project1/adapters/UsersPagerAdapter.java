package com.example.project1.adapters;

//public class FragmentPagerAdapter {
//}

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.project1.AllFragment;
import com.example.project1.fragments.LicensedFragment;
import com.example.project1.fragments.UnlicensedFragment;

public class UsersPagerAdapter extends FragmentPagerAdapter {

    public UsersPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AllFragment();
            case 1:
                return new LicensedFragment();
            case 2:
                return new UnlicensedFragment();
            default:
                throw new IllegalArgumentException("Invalid position: " + position);
        }
    }

    @Override
    public int getCount() {
        return 3; // Number of tabs
    }
}

