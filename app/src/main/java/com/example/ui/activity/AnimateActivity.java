package com.example.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.R;
import com.example.base.BaseActivity;
import com.example.tool.FrameAnnotation;
import com.example.ui.adapter.ViewPagerAdapter;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class AnimateActivity extends BaseActivity {

	private SharedPreferences data=null;
	private SharedPreferences.Editor editor=null;
	private final String isDisplay="isDisplay";


	@InjectView(R.id.face)
	ViewPager face;
	private ViewPagerAdapter adapter=null;





	@Override
	protected void onCreateMethod() {

		if(isDisplay())
		{
			FrameAnnotation.setRoot(this,R.layout.activity_animate);
			FrameAnnotation.goneTitle(this);
			ButterKnife.inject(this);
			onCreateFace();

		}
		else
		{
			toEntry();
		}

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

	private Boolean isDisplay()
	{
		Boolean status=false;
	  data=this.getPreferences(Context.MODE_PRIVATE);
		if(data!=null)
		{
			editor=data.edit();
		}
		if(editor!=null)
		{
			int ver=data.getInt(isDisplay,0);
			if(ver==0)
				status=true;
			else
				status=false;

			ver++;
			if(ver>2)
				ver=0;
			editor.putInt(isDisplay,ver);
			editor.commit();
		}

		return status;
	}

	private void onCreateFace()
	{
		if(face!=null)
		{
			LayoutInflater inflater=LayoutInflater.from(this);
			List<View> list=new ArrayList<>();
			/*
			fill list
			 */
			if(inflater!=null)
			{
				View first=inflater.inflate(R.layout.launchpager1,null);
				View second=inflater.inflate(R.layout.launchpager2,null);
				list.add(first);
				list.add(second);
			}


			adapter=new ViewPagerAdapter(list);
			face.setAdapter(adapter);
		}
	}




	private void toEntry()
	{
		Intent intent=new Intent(this,EntryActivity.class);
		this.startActivity(intent);
		finish();

	}


	public void toEntry(View view)
	{
		toEntry();
	}

}
