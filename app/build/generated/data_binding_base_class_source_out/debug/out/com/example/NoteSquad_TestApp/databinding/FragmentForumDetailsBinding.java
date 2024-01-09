// Generated by view binder compiler. Do not edit!
package com.example.NoteSquad_TestApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.NoteSquad_TestApp.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentForumDetailsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton btnDelete;

  @NonNull
  public final MaterialButton btnDislike;

  @NonNull
  public final MaterialButton btnLike;

  @NonNull
  public final Button btnSubmitComment;

  @NonNull
  public final LinearLayout commentBoxLayout;

  @NonNull
  public final RecyclerView commentsRecyclerView;

  @NonNull
  public final View dividerLine;

  @NonNull
  public final EditText editTextComment;

  @NonNull
  public final TextView forumDetailsDescription;

  @NonNull
  public final TextView forumDetailsTitle;

  @NonNull
  public final TextView textViewLikes;

  @NonNull
  public final TextView textViewNoComments;

  @NonNull
  public final MaterialButtonToggleGroup toggleGroup;

  private FragmentForumDetailsBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageButton btnDelete, @NonNull MaterialButton btnDislike,
      @NonNull MaterialButton btnLike, @NonNull Button btnSubmitComment,
      @NonNull LinearLayout commentBoxLayout, @NonNull RecyclerView commentsRecyclerView,
      @NonNull View dividerLine, @NonNull EditText editTextComment,
      @NonNull TextView forumDetailsDescription, @NonNull TextView forumDetailsTitle,
      @NonNull TextView textViewLikes, @NonNull TextView textViewNoComments,
      @NonNull MaterialButtonToggleGroup toggleGroup) {
    this.rootView = rootView;
    this.btnDelete = btnDelete;
    this.btnDislike = btnDislike;
    this.btnLike = btnLike;
    this.btnSubmitComment = btnSubmitComment;
    this.commentBoxLayout = commentBoxLayout;
    this.commentsRecyclerView = commentsRecyclerView;
    this.dividerLine = dividerLine;
    this.editTextComment = editTextComment;
    this.forumDetailsDescription = forumDetailsDescription;
    this.forumDetailsTitle = forumDetailsTitle;
    this.textViewLikes = textViewLikes;
    this.textViewNoComments = textViewNoComments;
    this.toggleGroup = toggleGroup;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForumDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForumDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forum_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForumDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDelete;
      ImageButton btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btnDislike;
      MaterialButton btnDislike = ViewBindings.findChildViewById(rootView, id);
      if (btnDislike == null) {
        break missingId;
      }

      id = R.id.btnLike;
      MaterialButton btnLike = ViewBindings.findChildViewById(rootView, id);
      if (btnLike == null) {
        break missingId;
      }

      id = R.id.btnSubmitComment;
      Button btnSubmitComment = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmitComment == null) {
        break missingId;
      }

      id = R.id.commentBoxLayout;
      LinearLayout commentBoxLayout = ViewBindings.findChildViewById(rootView, id);
      if (commentBoxLayout == null) {
        break missingId;
      }

      id = R.id.commentsRecyclerView;
      RecyclerView commentsRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (commentsRecyclerView == null) {
        break missingId;
      }

      id = R.id.dividerLine;
      View dividerLine = ViewBindings.findChildViewById(rootView, id);
      if (dividerLine == null) {
        break missingId;
      }

      id = R.id.editTextComment;
      EditText editTextComment = ViewBindings.findChildViewById(rootView, id);
      if (editTextComment == null) {
        break missingId;
      }

      id = R.id.forumDetailsDescription;
      TextView forumDetailsDescription = ViewBindings.findChildViewById(rootView, id);
      if (forumDetailsDescription == null) {
        break missingId;
      }

      id = R.id.forumDetailsTitle;
      TextView forumDetailsTitle = ViewBindings.findChildViewById(rootView, id);
      if (forumDetailsTitle == null) {
        break missingId;
      }

      id = R.id.textViewLikes;
      TextView textViewLikes = ViewBindings.findChildViewById(rootView, id);
      if (textViewLikes == null) {
        break missingId;
      }

      id = R.id.textViewNoComments;
      TextView textViewNoComments = ViewBindings.findChildViewById(rootView, id);
      if (textViewNoComments == null) {
        break missingId;
      }

      id = R.id.toggleGroup;
      MaterialButtonToggleGroup toggleGroup = ViewBindings.findChildViewById(rootView, id);
      if (toggleGroup == null) {
        break missingId;
      }

      return new FragmentForumDetailsBinding((RelativeLayout) rootView, btnDelete, btnDislike,
          btnLike, btnSubmitComment, commentBoxLayout, commentsRecyclerView, dividerLine,
          editTextComment, forumDetailsDescription, forumDetailsTitle, textViewLikes,
          textViewNoComments, toggleGroup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
