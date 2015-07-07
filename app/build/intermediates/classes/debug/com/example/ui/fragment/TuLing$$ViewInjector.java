// Generated code from Butter Knife. Do not modify!
package com.example.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TuLing$$ViewInjector {
  public static void inject(Finder finder, final com.example.ui.fragment.TuLing target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492981, "field 'content'");
    target.content = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131492982, "field 'answer'");
    target.answer = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131492983, "field 'question'");
    target.question = (android.widget.Button) view;
  }

  public static void reset(com.example.ui.fragment.TuLing target) {
    target.content = null;
    target.answer = null;
    target.question = null;
  }
}
