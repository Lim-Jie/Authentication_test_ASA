// Generated by view binder compiler. Do not edit!
package com.example.NoteSquad_TestApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.NoteSquad_TestApp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView Connections;

  @NonNull
  public final LinearLayout ConnectionsLinearLayout;

  @NonNull
  public final TextView ConnectionsVal;

  @NonNull
  public final TextView Contributions;

  @NonNull
  public final LinearLayout ContributionsLinearLayout;

  @NonNull
  public final TextView ContributionsVal;

  @NonNull
  public final TextView Engagement;

  @NonNull
  public final LinearLayout EngagementLinearLayout;

  @NonNull
  public final TextView EngagementVal;

  @NonNull
  public final ConstraintLayout ProfilePageConstraintLayout;

  @NonNull
  public final TextView biographyPP;

  @NonNull
  public final CardView circularProfilepicBackground;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final TextView profileEmail;

  @NonNull
  public final TextView profileNameUser;

  @NonNull
  public final ImageView profilePictureUser;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView universityPP;

  @NonNull
  public final Button updateUserDetailsButton;

  private FragmentProfileBinding(@NonNull ScrollView rootView, @NonNull TextView Connections,
      @NonNull LinearLayout ConnectionsLinearLayout, @NonNull TextView ConnectionsVal,
      @NonNull TextView Contributions, @NonNull LinearLayout ContributionsLinearLayout,
      @NonNull TextView ContributionsVal, @NonNull TextView Engagement,
      @NonNull LinearLayout EngagementLinearLayout, @NonNull TextView EngagementVal,
      @NonNull ConstraintLayout ProfilePageConstraintLayout, @NonNull TextView biographyPP,
      @NonNull CardView circularProfilepicBackground, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3,
      @NonNull TextView profileEmail, @NonNull TextView profileNameUser,
      @NonNull ImageView profilePictureUser, @NonNull RecyclerView recyclerView,
      @NonNull TextView universityPP, @NonNull Button updateUserDetailsButton) {
    this.rootView = rootView;
    this.Connections = Connections;
    this.ConnectionsLinearLayout = ConnectionsLinearLayout;
    this.ConnectionsVal = ConnectionsVal;
    this.Contributions = Contributions;
    this.ContributionsLinearLayout = ContributionsLinearLayout;
    this.ContributionsVal = ContributionsVal;
    this.Engagement = Engagement;
    this.EngagementLinearLayout = EngagementLinearLayout;
    this.EngagementVal = EngagementVal;
    this.ProfilePageConstraintLayout = ProfilePageConstraintLayout;
    this.biographyPP = biographyPP;
    this.circularProfilepicBackground = circularProfilepicBackground;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
    this.profileEmail = profileEmail;
    this.profileNameUser = profileNameUser;
    this.profilePictureUser = profilePictureUser;
    this.recyclerView = recyclerView;
    this.universityPP = universityPP;
    this.updateUserDetailsButton = updateUserDetailsButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Connections;
      TextView Connections = ViewBindings.findChildViewById(rootView, id);
      if (Connections == null) {
        break missingId;
      }

      id = R.id.ConnectionsLinearLayout;
      LinearLayout ConnectionsLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (ConnectionsLinearLayout == null) {
        break missingId;
      }

      id = R.id.ConnectionsVal;
      TextView ConnectionsVal = ViewBindings.findChildViewById(rootView, id);
      if (ConnectionsVal == null) {
        break missingId;
      }

      id = R.id.Contributions;
      TextView Contributions = ViewBindings.findChildViewById(rootView, id);
      if (Contributions == null) {
        break missingId;
      }

      id = R.id.ContributionsLinearLayout;
      LinearLayout ContributionsLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (ContributionsLinearLayout == null) {
        break missingId;
      }

      id = R.id.ContributionsVal;
      TextView ContributionsVal = ViewBindings.findChildViewById(rootView, id);
      if (ContributionsVal == null) {
        break missingId;
      }

      id = R.id.Engagement;
      TextView Engagement = ViewBindings.findChildViewById(rootView, id);
      if (Engagement == null) {
        break missingId;
      }

      id = R.id.EngagementLinearLayout;
      LinearLayout EngagementLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (EngagementLinearLayout == null) {
        break missingId;
      }

      id = R.id.EngagementVal;
      TextView EngagementVal = ViewBindings.findChildViewById(rootView, id);
      if (EngagementVal == null) {
        break missingId;
      }

      id = R.id.ProfilePageConstraintLayout;
      ConstraintLayout ProfilePageConstraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (ProfilePageConstraintLayout == null) {
        break missingId;
      }

      id = R.id.biographyPP;
      TextView biographyPP = ViewBindings.findChildViewById(rootView, id);
      if (biographyPP == null) {
        break missingId;
      }

      id = R.id.circularProfilepicBackground;
      CardView circularProfilepicBackground = ViewBindings.findChildViewById(rootView, id);
      if (circularProfilepicBackground == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.profileEmail;
      TextView profileEmail = ViewBindings.findChildViewById(rootView, id);
      if (profileEmail == null) {
        break missingId;
      }

      id = R.id.profileNameUser;
      TextView profileNameUser = ViewBindings.findChildViewById(rootView, id);
      if (profileNameUser == null) {
        break missingId;
      }

      id = R.id.profilePictureUser;
      ImageView profilePictureUser = ViewBindings.findChildViewById(rootView, id);
      if (profilePictureUser == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.universityPP;
      TextView universityPP = ViewBindings.findChildViewById(rootView, id);
      if (universityPP == null) {
        break missingId;
      }

      id = R.id.updateUserDetailsButton;
      Button updateUserDetailsButton = ViewBindings.findChildViewById(rootView, id);
      if (updateUserDetailsButton == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ScrollView) rootView, Connections, ConnectionsLinearLayout,
          ConnectionsVal, Contributions, ContributionsLinearLayout, ContributionsVal, Engagement,
          EngagementLinearLayout, EngagementVal, ProfilePageConstraintLayout, biographyPP,
          circularProfilepicBackground, linearLayout, linearLayout2, linearLayout3, profileEmail,
          profileNameUser, profilePictureUser, recyclerView, universityPP, updateUserDetailsButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}