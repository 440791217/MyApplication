package com.example.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.R;
import com.example.interfaceclass.ActivityInterface;
import com.example.tool.FrameAnnotation;

/**
 * Created by Administrator on 2015/7/1.
 */
public abstract class BaseActivity extends FragmentActivity {

    protected abstract void onCreateMethod();
    protected abstract void onStartMethod();
    protected abstract void onResumeMethod();
    protected abstract void onPauseMethod();
    protected abstract void onStopMethod();
    protected abstract void onDestroyMethod();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameAnnotation.setFrameWork(this, R.layout.activity_baseframe);
        onCreateMethod();
    }

    @Override
    protected void onStart() {
        super.onStart();
        onStartMethod();
    }

    @Override
    protected void onResume() {
        super.onResume();
        onResumeMethod();
    }

    @Override
    protected void onPause() {
        onPauseMethod();
        super.onPause();
    }

    @Override
    protected void onStop() {
        onStopMethod();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        onDestroyMethod();
        super.onDestroy();
    }
}
