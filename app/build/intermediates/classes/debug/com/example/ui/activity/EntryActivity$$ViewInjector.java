// Generated code from Butter Knife. Do not modify!
package com.example.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class EntryActivity$$ViewInjector {
  public static void inject(Finder finder, final com.example.ui.activity.EntryActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492970, "field 'Account'");
    target.Account = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131492969, "field 'textinputAccount'");
    target.textinputAccount = (android.support.design.widget.TextInputLayout) view;
    view = finder.findRequiredView(source, 2131492972, "field 'Password'");
    target.Password = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131492971, "field 'textinputPassword'");
    target.textinputPassword = (android.support.design.widget.TextInputLayout) view;
  }

  public static void reset(com.example.ui.activity.EntryActivity target) {
    target.Account = null;
    target.textinputAccount = null;
    target.Password = null;
    target.textinputPassword = null;
  }
}
