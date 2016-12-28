package com.liantai.ui.fragment.device.order;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public class OrderFragment extends Fragment {
    private Unbinder unbinder;
    private boolean showLatout = true;

    @BindView(R.id.order_tab)
     TabLayout tabLayout;

    @BindView(R.id.tv_advanced_search)
    TextView tv_advanced_search;

    @BindView(R.id.down_layout)
    View down_layout;

    private View view;


    public OrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view  = inflater.inflate(R.layout.fragment_order,null);
        unbinder= ButterKnife.bind(this,view);
        init();
        return view;
    }

    private void init() {
        down_layout.setVisibility(View.GONE);
        List<String> title = new ArrayList<>();
        title.add("所有订单");
        title.add("待做订单");
        title.add("绑定订单");
        title.add("在做订单");
        title.add("中断订单");

        for (int i = 0; i <title.size() ; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(title.get(i)));
        }
    }

    @OnClick(R.id.tv_advanced_search)
    public void onClick(View v){
        switch (v.getId()){
            case R.id.tv_advanced_search:
                if (showLatout==true){
                    down_layout.setVisibility(View.GONE);
                    showLatout = false;
                    return;
                }else if (showLatout==false){
                    down_layout.setVisibility(View.VISIBLE);
                    showLatout = true;
                    return;
                }


                break;
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
