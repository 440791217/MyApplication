package com.example.base;

import android.app.Application;

import com.example.tool.ToastPromt;

import me.drakeet.materialdialog.MaterialDialog;

/**
 * Created by Administrator on 2015/7/1.
 */
public class BaseApplication extends Application {


	public void onCreate() {
		super.onCreate();
		try{
			initApplication();
		}catch (Throwable e)
		{

		}
	}


	private void initApplication()
	{
		/*
		init ToastShow
		 */
		ToastPromt.setApplication(this);
		/*
		init MaterialDialog
		 */
		com.example.tool.MaterialDialog.onCreate(this);


	}

}
