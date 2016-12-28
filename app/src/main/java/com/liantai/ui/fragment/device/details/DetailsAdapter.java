package com.liantai.ui.fragment.device.details;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/23.
 */

public class DetailsAdapter extends FragmentPagerAdapter{

    List<String> list=new ArrayList<>();
    List<Fragment> fragmentList=new ArrayList<>();
    public DetailsAdapter(FragmentManager fm,List<String> ist,List<Fragment> fragmentList) {
        super(fm);
        this.list=ist;
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    //拿到ViewPager的标题TabLayout
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
