package com.example.tool;

import android.app.Application;
import android.widget.Toast;

/**
 * Created by mark on 2015/7/2.for MyApplication
 */
public class ToastPromt {
	private  static Application application=null;

	public static void ShowShort(String msg)
	{
		if(application!=null)
		{
			Toast.makeText(application,msg,Toast.LENGTH_SHORT).show();
		}

	}

	public static void setApplication(Application application) {
		ToastPromt.application = application;
	}
}
