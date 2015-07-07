// Generated code from Butter Knife. Do not modify!
package com.example.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class AnimateActivity$$ViewInjector {
  public static void inject(Finder finder, final com.example.ui.activity.AnimateActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492967, "field 'face'");
    target.face = (android.support.v4.view.ViewPager) view;
  }

  public static void reset(com.example.ui.activity.AnimateActivity target) {
    target.face = null;
  }
}
