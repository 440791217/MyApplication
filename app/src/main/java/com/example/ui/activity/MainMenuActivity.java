package com.example.ui.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alibaba.fastjson.JSON;
import com.example.R;
import com.example.base.BaseActivity;
import com.example.global.FragmentProtocol;
import com.example.model.json.TuLingQuery;
import com.example.network.http.ExampleClient;
import com.example.network.http.ExampleHandler;
import com.example.tool.FrameAnnotation;
import com.example.tool.SystemDebug;
import com.example.ui.fragment.MenuAction;
import com.example.ui.fragment.SelfAction;
import com.example.ui.fragment.TuLing;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;

public class MainMenuActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener{

	private FragmentManager fragmentManager=null;
	private FragmentTransaction fragmentTranction=null;
	private HashMap<String,Fragment> fmap=null;



	@InjectView(R.id.buttonAction)
	RadioGroup buttonAction;

	@InjectView(R.id.menu)
	RadioButton menu;




	@Override
	protected void onCreateMethod() {
		FrameAnnotation.setRoot(this, R.layout.activity_main_menu);
		onCreateFragment();
		ButterKnife.inject(this);
		buttonAction.setOnCheckedChangeListener(this);
		menu.setChecked(true);

	}

	@Override
	protected void onStartMethod() {

	}

	@Override
	protected void onResumeMethod() {

	}

	@Override
	protected void onPauseMethod() {

	}

	@Override
	protected void onStopMethod() {

	}

	@Override
	protected void onDestroyMethod() {

	}

	private void onCreateFragment()
	{
		/*
		 fill map
		 */
		fmap=new HashMap<String,Fragment>();
		fmap.put(FragmentProtocol.MenuAction,new MenuAction());
		fmap.put(FragmentProtocol.reserved1,new MenuAction());
		fmap.put(FragmentProtocol.reserved2,new MenuAction());
		fmap.put(FragmentProtocol.reserved3,new TuLing());

		fragmentManager=this.getSupportFragmentManager();
//		fragmentTranction.commit();

	}


	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {

		switch(checkedId)
		{
			case R.id.menu:
				onReplaceAction(R.id.fragment,fmap.get(FragmentProtocol.MenuAction));
				break;
			case R.id.reserved1:
				onReplaceAction(R.id.fragment,fmap.get(FragmentProtocol.reserved1));
				break;
			case R.id.reserved2:
				onReplaceAction(R.id.fragment,fmap.get(FragmentProtocol.reserved2));
				break;
			case R.id.reserved3:
				onReplaceAction(R.id.fragment,fmap.get(FragmentProtocol.reserved3));
				break;
		}

	}

	private void onReplaceAction(int contentId,Fragment fragment)
	{
		fragmentTranction=fragmentManager.beginTransaction();
		fragmentTranction.replace(contentId,fragment);
		fragmentTranction.commit();
	}

}
