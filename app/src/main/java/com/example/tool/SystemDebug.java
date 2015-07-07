package com.example.tool;

import android.util.Log;

/**
 * Created by mark on 2015/7/2.for MyApplication
 */
public class SystemDebug {


	private static String Tag="mark";
	private static boolean debug=true;


	public static void v(String msg)
	{
		if(debug)
			Log.v(Tag,msg);
	}

	public static void d(String msg)
	{
		if(debug)
		Log.d(Tag, msg);
	}

	public static void w(String msg)
	{
		if(debug)
			Log.w(Tag,msg);
	}

	public static void e(String msg)
	{
		if(debug)
			Log.e(Tag,msg);
	}




}
