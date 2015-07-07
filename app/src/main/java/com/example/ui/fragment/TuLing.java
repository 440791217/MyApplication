package com.example.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.example.R;
import com.example.model.json.TuLingQuery;
import com.example.network.http.ExampleClient;
import com.example.network.http.ExampleHandler;
import com.example.tool.SystemDebug;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by mark on 2015/7/6.for MyApplication
 */
public class TuLing extends Fragment implements View.OnClickListener{


	@InjectView(R.id.content)
	EditText content;
	@InjectView(R.id.answer)
	TextView answer;
	@InjectView(R.id.question)
	Button question;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_tuling, container, false);
		ButterKnife.inject(this, view);
		question.setOnClickListener(this);
		return view;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		ButterKnife.reset(this);
	}





	@Override
	public void onClick(View view) {
		ExampleClient client=new ExampleClient();
		ExampleHandler handler=new ExampleHandler()
		{
			@Override
			protected void inSuccess(int statusCode, Header[] headers, String responseString) {
				super.inSuccess(statusCode, headers, responseString);
				switch(statusCode)
				{
					case 200:
						if(responseString!=null) {
							TuLingQuery tmp = JSON.parseObject(responseString, TuLingQuery.class);
							if(tmp!=null&&tmp.getText()!=null)
								answer.setText(tmp.getText());
						}
						break;
				}




			}
		};

		RequestParams params=new RequestParams();
		params.add("key","080cb0fa6054031ea97e4fc73a631743");
		params.add("info",TuLing.this.content.getText().toString());
		client.get(view.getContext(), "http://www.tuling123.com/openapi/api", params, handler);
	}
}
