// Generated by view binder compiler. Do not edit!
package com.example.NoteSquad_TestApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.NoteSquad_TestApp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentUpdateuserdetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText Biography;

  @NonNull
  public final EditText University;

  @NonNull
  public final EditText Username;

  @NonNull
  public final TextView UsernameExistErrorTextView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final Button updateButtonProfilePage;

  private FragmentUpdateuserdetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText Biography, @NonNull EditText University, @NonNull EditText Username,
      @NonNull TextView UsernameExistErrorTextView, @NonNull TextView textView3,
      @NonNull Button updateButtonProfilePage) {
    this.rootView = rootView;
    this.Biography = Biography;
    this.University = University;
    this.Username = Username;
    this.UsernameExistErrorTextView = UsernameExistErrorTextView;
    this.textView3 = textView3;
    this.updateButtonProfilePage = updateButtonProfilePage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUpdateuserdetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUpdateuserdetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_updateuserdetails, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUpdateuserdetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Biography;
      EditText Biography = ViewBindings.findChildViewById(rootView, id);
      if (Biography == null) {
        break missingId;
      }

      id = R.id.University;
      EditText University = ViewBindings.findChildViewById(rootView, id);
      if (University == null) {
        break missingId;
      }

      id = R.id.Username;
      EditText Username = ViewBindings.findChildViewById(rootView, id);
      if (Username == null) {
        break missingId;
      }

      id = R.id.UsernameExistErrorTextView;
      TextView UsernameExistErrorTextView = ViewBindings.findChildViewById(rootView, id);
      if (UsernameExistErrorTextView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.updateButtonProfilePage;
      Button updateButtonProfilePage = ViewBindings.findChildViewById(rootView, id);
      if (updateButtonProfilePage == null) {
        break missingId;
      }

      return new FragmentUpdateuserdetailsBinding((ConstraintLayout) rootView, Biography,
          University, Username, UsernameExistErrorTextView, textView3, updateButtonProfilePage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
