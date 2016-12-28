package com.liantai.ui.fragment.data;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import com.liantai.ui.R;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/12/20.
 */

public class UseRateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    @BindView(R.id.tv_show_start_time)
    TextView StartTime;
    @BindView(R.id.tv_show_stop_time)
    TextView StopTime;
    private  int state;//设置状态；




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_show, container, false);
        ButterKnife.bind(this, view);

        Calendar cl = Calendar.getInstance();
        int year = cl.get(Calendar.YEAR);
        int month = cl.get(Calendar.MONTH);
        int date = cl.get(Calendar.DATE);
        StartTime.setText(year + "-" + (month + 1) + "-" + date);
        StopTime.setText((year + 1) + "-" + (month - 2) + "-" + (date + 6));
        return view;


    }



    @OnClick({R.id.tv_show_start_time, R.id.tv_show_stop_time})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_show_start_time:
                state=0;//点击时，给定状态
                setDialog();

                break;
            case R.id.tv_show_stop_time:
                state=1;//点击时，给定状态
                setDialog();
                break;
        }
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        switch (state){
            case 0:
                StartTime.setText(year + "-" + (month + 1) + "-" + dayOfMonth);
//                state=1;
                break;
            case 1:
                StopTime.setText(year + "-" + (month + 1) + "-" + dayOfMonth);
//                state=0;
                break;
        }


    }

    //点击按钮显示时间对话框
    private void  setDialog(){
        Calendar cl=Calendar.getInstance();
        int year=cl.get(Calendar.YEAR);
        int month=cl.get(Calendar.MONTH);
        int date=cl.get(Calendar.DATE);
        Log.e("11",year+"/"+month+"/"+date+"");
        DatePickerDialog datePickerDialog=new DatePickerDialog(getActivity(),this,year,month,date);
        datePickerDialog.show();
    }
}
