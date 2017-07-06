package com.shui.fragment_fragment;

import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.text.Layout;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	private Maintab1 tab1;
	private Maintab2 tab2;
	private Maintab3 tab3;
	
	private FragmentManager fragmentmanager; 
	
	private LinearLayout but1;
	private LinearLayout but2;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment);
		
		but1=(LinearLayout) findViewById(R.id.id_tab_bottom_weixin);
		but2=(LinearLayout) findViewById(R.id.id_tab_bottom_friend);
		but1.setOnClickListener(this);
		but2.setOnClickListener(this);
		//获取一个fragmentmanager对象
		fragmentmanager=getFragmentManager();
		settabselection(0);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.id_tab_bottom_weixin:
			settabselection(0);
			Toast.makeText(this,"点击按键一", 1).show();
			break;
		case R.id.id_tab_bottom_friend:
			settabselection(1);
			Toast.makeText(this,"点击按键二", 1).show();
			break;
		default:
			break;
		}
		
	}
	public void touch(){
		settabselection(2);
	}
	
	@SuppressLint("NewApi")
	private void settabselection(int index) {
		// TODO Auto-generated method stub
		//开启一个fragment的事务
		FragmentTransaction transaction = fragmentmanager.beginTransaction();
		
		hideFragments(transaction);
		switch (index) {
		case 0:
			if (tab1 == null)
			{
				tab1 = new Maintab1();
				transaction.add(R.id.frag1, tab1);
			} else
			{
				transaction.show(tab1);
			}
			break;
		case 1:
			if (tab2 == null)
			{
				tab2 = new Maintab2();
				transaction.add(R.id.frag1, tab2);
			} else
			{
				transaction.show(tab2);
			}
			break;
		case 2:
			if (tab3 == null)
			{
				tab3 = new Maintab3();
				transaction.add(R.id.frag1, tab3);
			} else
			{
				transaction.show(tab3);
			}
			break;
		default:
			break;
		}
		/*
		 * 提交fragment事务
		 */
		transaction.commit();
	}
	/**
	 * 防止多个fragment显示在屏幕上
	 * @param transaction
	 */
	@SuppressLint("NewApi")
	private void hideFragments(FragmentTransaction transaction)
	{
		if (tab1 != null)
		{
			transaction.hide(tab1);
		}
		if (tab2 != null)
		{
			transaction.hide(tab2);
		}
		if (tab3 != null)
		{
			transaction.hide(tab3);
		}	
	}


}
