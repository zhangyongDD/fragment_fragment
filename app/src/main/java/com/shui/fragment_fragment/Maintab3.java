package com.shui.fragment_fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



@SuppressLint("NewApi")
public class Maintab3 extends Fragment {
	private View viewMain;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		viewMain=inflater.inflate(com.shui.fragment_fragment.R.layout.tab3,container,false);
		return viewMain;
	}
	
}
