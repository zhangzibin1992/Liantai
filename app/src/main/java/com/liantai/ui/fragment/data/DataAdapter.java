package com.liantai.ui.fragment.data;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/20.
 */

public class DataAdapter extends FragmentPagerAdapter {

    List<String> list=new ArrayList<>();

    public DataAdapter(FragmentManager fm ,List<String> lt) {
        super(fm);
        this.list=lt;
    }

    @Override
    public Fragment getItem(int position) {
        return new UseRateFragment();
    }

    @Override
    public int getCount() {
        return list.size();
    }


    //拿到ViewPager的标题TabLayout
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
