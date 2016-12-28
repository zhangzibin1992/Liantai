package com.liantai.ui.fragment.data;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liantai.ui.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/12/19.
 */

public class DataFragment extends Fragment {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private List<String> list=new ArrayList<>();
    private DataAdapter dataAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data, container, false);
        ButterKnife.bind(this, view);
        initData();
        dataAdapter=new DataAdapter(getChildFragmentManager(),list);
        viewPager.setAdapter(dataAdapter);
        //注：ViewPager滑动时绑定TabLayout进行联动效果
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    private void initData(){
        list.add("使用率");
        list.add("故障率");
        list.add("功率");
        list.add("液位");
        list.add("设备耗材");
    }
}
