package com.liantai.ui.fragment.device.print;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liantai.ui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LvPrintFragment extends Fragment {
    private View view;


    public LvPrintFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_lv_print, container,false);
        return view;
    }

}
