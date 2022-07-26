// Generated by data binding compiler. Do not edit!
package com.demo.databindingdemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.demo.databindingdemo.R;
import com.demo.databindingdemo.RecyclerData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecyclerviewRowBinding extends ViewDataBinding {
  @NonNull
  public final TextView createdDateTextView;

  @NonNull
  public final TextView descTextView;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final ImageView thubmImage;

  @Bindable
  protected RecyclerData mRecyclerData;

  protected RecyclerviewRowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView createdDateTextView, TextView descTextView, TextView nameTextView,
      ImageView thubmImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.createdDateTextView = createdDateTextView;
    this.descTextView = descTextView;
    this.nameTextView = nameTextView;
    this.thubmImage = thubmImage;
  }

  public abstract void setRecyclerData(@Nullable RecyclerData recyclerData);

  @Nullable
  public RecyclerData getRecyclerData() {
    return mRecyclerData;
  }

  @NonNull
  public static RecyclerviewRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recyclerview_row, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerviewRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecyclerviewRowBinding>inflateInternal(inflater, R.layout.recyclerview_row, root, attachToRoot, component);
  }

  @NonNull
  public static RecyclerviewRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recyclerview_row, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerviewRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecyclerviewRowBinding>inflateInternal(inflater, R.layout.recyclerview_row, null, false, component);
  }

  public static RecyclerviewRowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RecyclerviewRowBinding bind(@NonNull View view, @Nullable Object component) {
    return (RecyclerviewRowBinding)bind(component, view, R.layout.recyclerview_row);
  }
}
