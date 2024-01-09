// Generated by view binder compiler. Do not edit!
package com.example.NoteSquad_TestApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.NoteSquad_TestApp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentExploreBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ListView ScheduleListView1;

  @NonNull
  public final Button editScheduleButton9;

  @NonNull
  public final TextView studysession;

  @NonNull
  public final TextView upcoming;

  private FragmentExploreBinding(@NonNull ScrollView rootView, @NonNull ListView ScheduleListView1,
      @NonNull Button editScheduleButton9, @NonNull TextView studysession,
      @NonNull TextView upcoming) {
    this.rootView = rootView;
    this.ScheduleListView1 = ScheduleListView1;
    this.editScheduleButton9 = editScheduleButton9;
    this.studysession = studysession;
    this.upcoming = upcoming;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentExploreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentExploreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_explore, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentExploreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ScheduleListView1;
      ListView ScheduleListView1 = ViewBindings.findChildViewById(rootView, id);
      if (ScheduleListView1 == null) {
        break missingId;
      }

      id = R.id.editScheduleButton9;
      Button editScheduleButton9 = ViewBindings.findChildViewById(rootView, id);
      if (editScheduleButton9 == null) {
        break missingId;
      }

      id = R.id.studysession;
      TextView studysession = ViewBindings.findChildViewById(rootView, id);
      if (studysession == null) {
        break missingId;
      }

      id = R.id.upcoming;
      TextView upcoming = ViewBindings.findChildViewById(rootView, id);
      if (upcoming == null) {
        break missingId;
      }

      return new FragmentExploreBinding((ScrollView) rootView, ScheduleListView1,
          editScheduleButton9, studysession, upcoming);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}