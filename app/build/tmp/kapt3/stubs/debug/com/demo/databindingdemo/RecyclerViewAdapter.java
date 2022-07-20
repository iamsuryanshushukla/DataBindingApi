package com.demo.databindingdemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001e\u0010\u0011\u001a\u00020\n2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/demo/databindingdemo/RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/databindingdemo/RecyclerViewAdapter$MyViewHolder;", "()V", "items", "Ljava/util/ArrayList;", "Lcom/demo/databindingdemo/RecyclerData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataList", "data", "Lkotlin/collections/ArrayList;", "MyViewHolder", "app_debug"})
public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.databindingdemo.RecyclerViewAdapter.MyViewHolder> {
    private java.util.ArrayList<com.demo.databindingdemo.RecyclerData> items;
    
    public RecyclerViewAdapter() {
        super();
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.demo.databindingdemo.RecyclerData> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.databindingdemo.RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.databindingdemo.RecyclerViewAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/demo/databindingdemo/RecyclerViewAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/demo/databindingdemo/databinding/RecyclerviewRowBinding;", "(Lcom/demo/databindingdemo/databinding/RecyclerviewRowBinding;)V", "bind", "", "data", "Lcom/demo/databindingdemo/RecyclerData;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.demo.databindingdemo.databinding.RecyclerviewRowBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.demo.databindingdemo.databinding.RecyclerviewRowBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.demo.databindingdemo.RecyclerData data) {
        }
    }
}