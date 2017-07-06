package com.shui.fragment_fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

@SuppressLint("NewApi")
public class Maintab1 extends Fragment implements OnClickListener  {
	private View viewMain;
	Button but1;
	Button but2;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//viewMain必须定义成下面的形式，否则viewMain不能使用
		viewMain=inflater.inflate(com.shui.fragment_fragment.R.layout.tab1,container,false);
		return viewMain;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		but1=(Button)viewMain.findViewById(R.id.but1);
		but1.setOnClickListener(this); 
		but2=(Button)viewMain.findViewById(R.id.but2);
		but2.setOnClickListener(this); 
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
		
		case R.id.but1:
			Toast.makeText(getActivity(), "haha",1).show();
			break;
		case R.id.but2:
			//System.out.println("wait the result");
			MainActivity parentActivity = (MainActivity)getActivity();
			parentActivity.touch();
			break;
		default:
			break;
		}
	}

	

}
