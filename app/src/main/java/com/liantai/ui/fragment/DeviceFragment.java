package com.liantai.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.liantai.ui.DeviceActivity;
import com.liantai.ui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/12/20.
 */

public class DeviceFragment extends Fragment {

    @BindView(R.id.linear_device)
    LinearLayout mLinearText;
    @BindView(R.id.tv_sla_name)
    TextView tvSlaName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_device, container, false);

        ButterKnife.bind(this, view);
        return view;
    }
    @OnClick(R.id.tv_sla_name)
    public void onClick() {
        startActivity(new Intent(getActivity(), DeviceActivity.class));
    }
}
