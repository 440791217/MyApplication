// Generated code from Butter Knife. Do not modify!
package com.example.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainMenuActivity$$ViewInjector {
  public static void inject(Finder finder, final com.example.ui.activity.MainMenuActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492974, "field 'buttonAction'");
    target.buttonAction = (android.widget.RadioGroup) view;
    view = finder.findRequiredView(source, 2131492975, "field 'menu'");
    target.menu = (android.widget.RadioButton) view;
  }

  public static void reset(com.example.ui.activity.MainMenuActivity target) {
    target.buttonAction = null;
    target.menu = null;
  }
}
