package com.example.network.http;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by mark on 2015/7/6.for MyApplication
 */
public class ExampleClient {

	private static ExampleClient mthis;
	private static final String BASE_URL = "http://www.tuling123.com/openapi/api";
	private static AsyncHttpClient client = new AsyncHttpClient();

	public ExampleClient()
	{
		mthis=this;
	}

	public void get(Context context,String url,RequestParams params,AsyncHttpResponseHandler handler)
	{
		client.get(context,url,null,params,handler);
	}




}
