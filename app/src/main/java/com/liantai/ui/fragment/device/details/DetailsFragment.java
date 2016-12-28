package com.liantai.ui.fragment.device.details;

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
 * Created by Administrator on 2016/12/23.
 */

public class DetailsFragment extends Fragment {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private DetailsAdapter detailsAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> nameList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_device_details, container, false);
        ButterKnife.bind(this, view);
        initViewPage();//初始化方法
        detailsAdapter = new DetailsAdapter(getChildFragmentManager(), nameList, fragmentList);
        viewPager.setAdapter(detailsAdapter);

        //注：ViewPager滑动时绑定TabLayout进行联动效果
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    private void initViewPage() {
        nameList.add("做件信息");
        nameList.add("设备操作");
        nameList.add("出错信息");

        fragmentList.add(new KitingMsgFragment());
        fragmentList.add(new OperateFragment());
        fragmentList.add(new ErrorMsgFragmet());

    }

}
