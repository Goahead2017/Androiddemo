package com.bignerdranch.android.viewpagertest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 14158 on 2017/12/25.
 */

public class Fragment3 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.view3,container,false);
    }
}
