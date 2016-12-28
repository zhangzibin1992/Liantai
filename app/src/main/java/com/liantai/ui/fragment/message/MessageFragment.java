package com.liantai.ui.fragment.message;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liantai.ui.R;

/**
 * Created by Administrator on 2016/12/19.
 */

public class MessageFragment extends Fragment{
   private View mView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.fragment_message,container,false);
        return mView;
    }
}
