package com.liantai.ui.fragment.device.state;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.liantai.ui.R;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment {
    private View view;
    private Unbinder unbinder;
    @BindViews({R.id.btn_Equipment_operation_records,R.id.btn_error_message})
    Button[] buttons;

    public StatusFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_state,null);
        unbinder= ButterKnife.bind(this,view);
        init();
        return view;
    }

    @OnClick({R.id.btn_Equipment_operation_records,R.id.btn_error_message})
    public void onClick(View v){
        for (int i = 0; i <buttons.length ; i++) {
            buttons[i].setSelected(false);
        }
        v.setSelected(true);
    }

    private void init() {
        buttons[0].setSelected(true);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
