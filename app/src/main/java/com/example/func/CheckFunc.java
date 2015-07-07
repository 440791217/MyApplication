package com.example.func;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import java.util.Iterator;
import java.util.List;

/**
 * Created by mark on 2015/7/2.for MyApplication
 */
public class CheckFunc {

	/*
	check service is running
	 */

	public static Boolean ServiceIsRunning(String serviceName,Context context)
	{
		boolean serviceRunning = false;


		ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);

		List<ActivityManager.RunningServiceInfo> l = am.getRunningServices(9999);

		Iterator<ActivityManager.RunningServiceInfo> i = l.iterator();

		while (i.hasNext()) {

			ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo) i.next();


			if(runningServiceInfo.service.getClassName().equals(serviceName)){

				serviceRunning = true;
				break;
			}

		}

		return serviceRunning;
	}




}
