package com.example.network.http;

import com.example.tool.SystemDebug;
import com.loopj.android.http.TextHttpResponseHandler;

import org.apache.http.Header;

/**
 * Created by mark on 2015/7/6.for MyApplication
 */
public class ExampleHandler extends TextHttpResponseHandler{

	private static ExampleHandler mthis;

	public ExampleHandler()
	{
		mthis=this;
	}



	public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
			inFailure(statusCode,headers,responseString,throwable);
			reset();
	}


	public void onSuccess(int statusCode, Header[] headers, String responseString) {
			inSuccess(statusCode,headers,responseString);
			reset();
	}

	protected void inFailure(int statusCode, Header[] headers, String responseString, Throwable throwable)
	{
		switch(statusCode)
		{
			default:
				SystemDebug.e("statusCode:"+"onFailure!");
		}
	}

	protected void inSuccess(int statusCode, Header[] headers, String responseString) {

		switch(statusCode)
		{
			default:
				SystemDebug.d("statusCode:" + statusCode);
		}

	}

	protected void reset()
	{

	}

}
