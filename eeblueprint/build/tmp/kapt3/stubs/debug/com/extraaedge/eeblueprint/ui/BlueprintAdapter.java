package com.extraaedge.eeblueprint.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0002:\u0001\u001eB%\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH&J%\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00132\u0010\u0010\u0019\u001a\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u001a\u001a\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/extraaedge/eeblueprint/ui/BlueprintAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/extraaedge/eeblueprint/ui/BlueprintAdapter$ItemViewHolder;", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "mContext", "mItems", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "layout", "load", "", "view", "Landroid/view/View;", "item", "(Landroid/view/View;ILjava/lang/Object;)V", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "eeblueprint_debug"})
public abstract class BlueprintAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.extraaedge.eeblueprint.ui.BlueprintAdapter<T>.ItemViewHolder> {
    private java.util.ArrayList<T> mItems;
    private android.content.Context mContext;
    
    public BlueprintAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.extraaedge.eeblueprint.ui.BlueprintAdapter<T>.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public abstract int layout();
    
    public abstract void load(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, T item);
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.extraaedge.eeblueprint.ui.BlueprintAdapter<T>.ItemViewHolder holder, int position) {
    }
    
    public final T getItem(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/extraaedge/eeblueprint/ui/BlueprintAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/extraaedge/eeblueprint/ui/BlueprintAdapter;Landroid/view/View;)V", "eeblueprint_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}