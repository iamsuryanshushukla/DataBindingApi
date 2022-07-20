package com.demo.databindingdemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J \u0010\u0016\u001a\u00020\u00132\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/demo/databindingdemo/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "recyclerListData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/demo/databindingdemo/RecyclerList;", "getRecyclerListData", "()Landroidx/lifecycle/MutableLiveData;", "setRecyclerListData", "(Landroidx/lifecycle/MutableLiveData;)V", "recyclerViewAdapter", "Lcom/demo/databindingdemo/RecyclerViewAdapter;", "getRecyclerViewAdapter", "()Lcom/demo/databindingdemo/RecyclerViewAdapter;", "setRecyclerViewAdapter", "(Lcom/demo/databindingdemo/RecyclerViewAdapter;)V", "getAdapter", "getRecyclerListDataObserver", "makeAPICall", "", "input", "", "setAdapterData", "data", "Ljava/util/ArrayList;", "Lcom/demo/databindingdemo/RecyclerData;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.demo.databindingdemo.RecyclerList> recyclerListData;
    @org.jetbrains.annotations.NotNull()
    private com.demo.databindingdemo.RecyclerViewAdapter recyclerViewAdapter;
    
    public MainActivityViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.demo.databindingdemo.RecyclerList> getRecyclerListData() {
        return null;
    }
    
    public final void setRecyclerListData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.demo.databindingdemo.RecyclerList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.databindingdemo.RecyclerViewAdapter getRecyclerViewAdapter() {
        return null;
    }
    
    public final void setRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    com.demo.databindingdemo.RecyclerViewAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.databindingdemo.RecyclerViewAdapter getAdapter() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.demo.databindingdemo.RecyclerData> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.demo.databindingdemo.RecyclerList> getRecyclerListDataObserver() {
        return null;
    }
    
    public final void makeAPICall(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
    }
}