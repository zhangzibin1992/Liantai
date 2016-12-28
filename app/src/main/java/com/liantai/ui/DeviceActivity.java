package com.liantai.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.liantai.ui.fragment.device.details.DetailsFragment;
import com.liantai.ui.fragment.device.order.OrderFragment;
import com.liantai.ui.fragment.device.print.PrintqueueFragment;
import com.liantai.ui.fragment.device.state.StatusFragment;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DeviceActivity extends AppCompatActivity {

    @BindViews({R.id.tv_device_state,R.id.tv_device_order,R.id.tv_device_details,R.id.tv_device_print})
    TextView[] mTextView;

    private OrderFragment orderFragment;//设备状态
    private StatusFragment statusFragment;//订单
    private DetailsFragment detailsFragment;//设备详情
    private PrintqueueFragment printqueueFragment;//打印队列

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
        ButterKnife.bind(this);
        //设置刚进入时默认显示的页面
        mTextView[0].setSelected(true);
        statusFragment=new StatusFragment();
        replaceFragment(statusFragment);
    }

    @OnClick({R.id.tv_device_state, R.id.tv_device_order, R.id.tv_device_details,R.id.tv_device_print})
    public void onClick(View view) {
        //设置未点击状态为正常颜色效果
        for (int i = 0; i <mTextView.length ; i++) {
            mTextView[i].setSelected(false);
        }
        switch (view.getId()) {
            case R.id.tv_device_state://设备状态
                mTextView[0].setSelected(true);
                statusFragment=new StatusFragment();
                replaceFragment(statusFragment);

                break;
            case R.id.tv_device_order://订单
                mTextView[1].setSelected(true);
                orderFragment=new OrderFragment();
                replaceFragment(orderFragment);
                break;
            case R.id.tv_device_details://设备详情
                mTextView[2].setSelected(true);
                detailsFragment=new DetailsFragment();
                replaceFragment(detailsFragment);
                break;
            case R.id.tv_device_print://打印列队
                mTextView[3].setSelected(true);
                printqueueFragment = new PrintqueueFragment();
                replaceFragment(printqueueFragment);
                break;

        }
    }
    //替换相应的Fragment
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_device, fragment).commit();
    }
}
