package com.example.tool;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by mark on 2015/7/3.for MyApplication
 */
public class MaterialDialog {

	private static me.drakeet.materialdialog.MaterialDialog dialog=null;

	public static void onCreate(Context context)
	{
		if(dialog==null&&context!=null)
		{
			dialog=new me.drakeet.materialdialog.MaterialDialog(context);
		}
	}

	public static me.drakeet.materialdialog.MaterialDialog getInstance()
	{
		return dialog;
	}

	public static void showDialog(String msg,String title)
	{
		if(dialog!=null)
		{
			if(msg!=null)
			{
				dialog.setMessage(msg);
			}
			if(title!=null)
			{
				dialog.setTitle(title);
			}
			dialog.show();
		}

	}





}
