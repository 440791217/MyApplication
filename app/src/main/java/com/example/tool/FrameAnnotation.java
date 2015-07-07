package com.example.tool;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.R;

/**
 * Created by mark on 2015/7/2.for MyApplication
 */
public class FrameAnnotation {

	public static void setFrameWork(Activity activity,int layout)
	{
		activity.setContentView(layout);
	}

	public static void setTitle(Activity activity)
	{

	}

	public static void goneTitle(Activity activity)
	{
		activity.findViewById(R.id.title).setVisibility(View.GONE);
	}

	public static void setRoot(Activity activity,int layout)
	{
		View view=null;
		RelativeLayout root= (RelativeLayout) activity.findViewById(R.id.root);
		LayoutInflater inflater=LayoutInflater.from(activity);
		if(inflater!=null)
		{
			 view=inflater.inflate(layout,null);
		}
		if(view !=null)
		{
			root.addView(view);
		}



	}







}
