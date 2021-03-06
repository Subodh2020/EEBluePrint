// Generated by view binder compiler. Do not edit!
package com.extraaedge.eeblueprint.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.extraaedge.eeblueprint.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogLoadingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout ctlView;

  @NonNull
  public final LottieAnimationView lottieLoadingView;

  @NonNull
  public final TextView txtLoading;

  private DialogLoadingBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout ctlView, @NonNull LottieAnimationView lottieLoadingView,
      @NonNull TextView txtLoading) {
    this.rootView = rootView;
    this.ctlView = ctlView;
    this.lottieLoadingView = lottieLoadingView;
    this.txtLoading = txtLoading;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogLoadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_loading, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogLoadingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout ctlView = (ConstraintLayout) rootView;

      id = R.id.lottieLoadingView;
      LottieAnimationView lottieLoadingView = rootView.findViewById(id);
      if (lottieLoadingView == null) {
        break missingId;
      }

      id = R.id.txtLoading;
      TextView txtLoading = rootView.findViewById(id);
      if (txtLoading == null) {
        break missingId;
      }

      return new DialogLoadingBinding((ConstraintLayout) rootView, ctlView, lottieLoadingView,
          txtLoading);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
