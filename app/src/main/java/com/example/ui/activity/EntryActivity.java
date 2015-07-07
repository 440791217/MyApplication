package com.example.ui.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.design.widget.TextInputLayout;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.R;
import com.example.base.BaseActivity;
import com.example.global.ServiceProtocol;
import com.example.sys.aidl.StubSample;
import com.example.tool.FrameAnnotation;
import com.example.tool.ToastPromt;

import butterknife.ButterKnife;
import butterknife.InjectView;


/**
 * Created by Administrator on 2015/7/1.
 */
public class EntryActivity extends BaseActivity {


	@InjectView(R.id.Account)
	EditText Account;
	@InjectView(R.id.textinputAccount)
	TextInputLayout textinputAccount;
	@InjectView(R.id.Password)
	EditText Password;
	@InjectView(R.id.textinputPassword)
	TextInputLayout textinputPassword;
	private ServiceConnection connection = null;
	private StubSample stubSample = null;


	@Override
	protected void onCreateMethod() {
		FrameAnnotation.setRoot(this, R.layout.activity_main);
		ButterKnife.inject(this);
		getService();

	}

	@Override
	protected void onStartMethod() {

	}

	@Override
	protected void onResumeMethod() {
		Account.setText("mark");

	}

	@Override
	protected void onPauseMethod() {

	}

	@Override
	protected void onStopMethod() {

	}

	@Override
	protected void onDestroyMethod() {

	}


	private void getService() {
		Intent intent = new Intent(ServiceProtocol.ServiceSample);

		connection = new ServiceConnection() {
			@Override
			public void onServiceConnected(ComponentName name, IBinder service) {
				stubSample = StubSample.Stub.asInterface(service);
				Log.v("mark","onconnection");
			}

			@Override
			public void onServiceDisconnected(ComponentName name) {
				stubSample = null;
			}
		};

		bindService(intent, connection, BIND_AUTO_CREATE);

	}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO: add setContentView(...) invocation
		ButterKnife.inject(this);
	}

	public void Login(View view)
	{
		String account=null;
		if(Account!=null)
		{
			account=Account.getText().toString();
		}
		else
		{
			return;
		}

		if(account.equals("mark"))
		{
			Intent intent=new Intent(this,MainMenuActivity.class);
			this.startActivity(intent);
		}
		else
		{
			//MaterialDialog.showDialog("mm","mmm");
			ToastPromt.ShowShort("Account or Password is Error!");
			return;
		}



	}

}
