package com.example.android.foodguide;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of  food category objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private ArrayList<FragmentWithTitle> mFragmentList;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm           is the fragment manager that will keep each fragment's state in the adapter
     *                     across swipes.
     * @param fragmentList
     */
    public CategoryAdapter(Context context, FragmentManager fm, ArrayList<FragmentWithTitle> fragmentList) {
        super(fm);
        mContext = context;
        mFragmentList = fragmentList;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position).getFragment();
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return mFragmentList.get(position).getTitle();
    }
}


