package com.example.sys.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.sys.aidl.StubSample;
import com.example.tool.SystemDebug;


/**
 * Created by mark on 2015/7/2.for MyApplication
 */
public class ServiceSample extends Service{

	private BinderSample iBinder=null;

	@Override
	public void onCreate() {
		super.onCreate();
		iBinder=new BinderSample();
	}

	public IBinder onBind(Intent intent) {
		return iBinder;
	}


	public class BinderSample extends StubSample.Stub{

		@Override
		public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

		}

		@Override
		public void test() throws RemoteException {

			SystemDebug.d("Hello!"+this.getClass().getName()+" is OK!");

		}
	}



}
