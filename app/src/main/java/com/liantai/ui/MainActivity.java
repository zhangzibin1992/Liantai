package com.liantai.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.liantai.ui.fragment.DeviceFragment;
import com.liantai.ui.fragment.data.DataFragment;
import com.liantai.ui.fragment.message.MessageFragment;
import com.liantai.ui.fragment.user.UserFragment;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindViews({R.id.tv_device,R.id.tv_data,R.id.tv_msg,R.id.tv_user})
    TextView[] textViews;

    private DeviceFragment deviceFragment;//我的设备页面
    private DataFragment dataFragment;//数据统计页面
    private MessageFragment messageFragment;//消息页面
    private UserFragment userFragmenyt;//我的用户页面


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //设置刚进入时默认显示的页面
        textViews[0].setSelected(true);
        deviceFragment = new DeviceFragment();
        replaceFragment(deviceFragment);

    }

    @OnClick({R.id.tv_device, R.id.tv_data, R.id.tv_msg, R.id.tv_user})
    public void onClick(View view) {

        //设置未点击状态为正常颜色效果
        for(int i = 0;i<textViews.length;i++){
            textViews[i].setSelected(false);
        }
        switch (view.getId()) {
            case R.id.tv_device:
                //  TODO: 2016/12/19 跳转到“我的设备”，待实现
                textViews[0].setSelected(true);//设置每个控件的选择器按钮
                deviceFragment = new DeviceFragment();
                replaceFragment(deviceFragment);
                break;
            case R.id.tv_data:
                //  TODO: 2016/12/19 跳转到“我的数据统计”，待实现
                textViews[1].setSelected(true);//设置每个控件的选择器按钮
                dataFragment = new DataFragment();
                replaceFragment(dataFragment);
                break;
            case R.id.tv_msg:
                //  TODO: 2016/12/19 跳转到“消息”，待实现
                textViews[2].setSelected(true);//设置每个控件的选择器按钮
                messageFragment = new MessageFragment();
                replaceFragment(messageFragment);
                break;
            case R.id.tv_user:
                //  TODO: 2016/12/19 跳转到“我的用户”，待实现
                textViews[3].setSelected(true);//设置每个控件的选择器按钮
                userFragmenyt = new UserFragment();
                replaceFragment(userFragmenyt);
                break;
        }
    }

    //替换相应的Fragment
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_framelayout, fragment).commit();
    }
}
