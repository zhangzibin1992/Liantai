package com.liantai.ui.fragment.device.print;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.liantai.ui.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrintqueueFragment extends Fragment {


    @BindView(R.id.img_3d_print)
    ImageView img3dPrint;
    @BindView(R.id.tv_nbprint)
    TextView tvNbprint;
    @BindView(R.id.tv_printing)
    TextView tvPrinting;
    @BindView(R.id.sorting_tab)
    TabLayout sortingTab;
    @BindView(R.id.print_viewpager)
    ViewPager printViewpager;
    @BindView(R.id.btn_import)
    Button btnImport;
    @BindView(R.id.btn_remove)
    Button btnRemove;
    @BindView(R.id.btn_del)
    Button btnDel;
    @BindView(R.id.btn_up)
    Button btnUp;
    @BindView(R.id.btn_down)
    Button btnDown;
    @BindView(R.id.btn_autoprint)
    Button btnAutoprint;
    private View view;
    private Unbinder unbinder;


    private PrintAdapter printAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> title = new ArrayList<>();

    public PrintqueueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_printqueue, null);
        unbinder = ButterKnife.bind(this, view);
        init();
        return view;
    }

    private void init() {


        title.add("自定义");
        title.add("交期排序");

        //注：ViewPager滑动时绑定TabLayout进行联动效果

        fragmentList.add(new LvPrintFragment());
        fragmentList.add(new LvPrintFragment());
        printAdapter = new PrintAdapter(getChildFragmentManager(), title, fragmentList);
        printViewpager.setAdapter(printAdapter);
        sortingTab.setupWithViewPager(printViewpager);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }



    @OnClick({R.id.btn_import, R.id.btn_remove, R.id.btn_del, R.id.btn_up, R.id.btn_down, R.id.btn_autoprint})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_import:
                break;
            case R.id.btn_remove:
                break;
            case R.id.btn_del:
                break;
            case R.id.btn_up:
                break;
            case R.id.btn_down:
                break;
            case R.id.btn_autoprint:
                break;
        }
    }
}
