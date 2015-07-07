package com.example.ui.listener;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/*
 by mark
 */
public class HiddenTouchListener implements View.OnTouchListener {

	@Override
	public boolean onTouch(View v, MotionEvent event) {

		InputMethodManager imm = (InputMethodManager) v.getContext()
				.getSystemService(Context.INPUT_METHOD_SERVICE);

			/*
			 * by mark
			 */

		v.setFocusable(true);
		v.setFocusableInTouchMode(true);
		v.requestFocus();

		return imm.hideSoftInputFromWindow(((Activity) v.getContext())
				.getCurrentFocus().getWindowToken(), 0);

	}

}