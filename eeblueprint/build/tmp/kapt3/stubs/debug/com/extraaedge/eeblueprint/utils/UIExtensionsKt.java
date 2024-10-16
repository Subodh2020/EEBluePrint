package com.extraaedge.eeblueprint.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u001a\u0010\f\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\n\u0010\r\u001a\u00020\u0007*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0007*\u00020\u0010\u001a\u001a\u0010\u000f\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u00100\u0011j\b\u0012\u0004\u0012\u00020\u0010`\u0012\u001a\n\u0010\u0013\u001a\u00020\u0007*\u00020\u0014\u001a\u001a\u0010\u0013\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u00140\u0011j\b\u0012\u0004\u0012\u00020\u0014`\u0012\u001a\n\u0010\u0015\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u0017\u001a\u00020\u0007*\u00020\u0014\u001a\u001a\u0010\u0017\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u00140\u0011j\b\u0012\u0004\u0012\u00020\u0014`\u0012\u001a\n\u0010\u0018\u001a\u00020\u0019*\u00020\u001a\u001a\n\u0010\u001b\u001a\u00020\u0014*\u00020\u0014\u001a\u001a\u0010\u001b\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u00140\u0011j\b\u0012\u0004\u0012\u00020\u0014`\u0012\u001a\n\u0010\u001c\u001a\u00020\u0014*\u00020\u0014\u001a\"\u0010\u001d\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u00140\u0011j\b\u0012\u0004\u0012\u00020\u0014`\u00122\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u0018\u0010 \u001a\u00020\u0007*\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070!\u001a\u001e\u0010\"\u001a\u00020\u0007*\u00020\u00102\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070#\u001a\"\u0010$\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&\u001a\"\u0010\'\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&\u001a\u001a\u0010(\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0001\u001a\u0012\u0010+\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010,\u001a\u00020\u0001\u001a\n\u0010-\u001a\u00020\u0014*\u00020\u0014\u001a\u001a\u0010-\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u00140\u0011j\b\u0012\u0004\u0012\u00020\u0014`\u0012\u001a\n\u0010.\u001a\u00020\u0007*\u00020\u000e\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\u00a8\u0006/"}, d2 = {"dp", "", "getDp", "(I)I", "px", "getPx", "addFragAllowingStateLoss", "", "Landroidx/fragment/app/FragmentManager;", "container", "fragment", "Landroidx/fragment/app/Fragment;", "addFragment", "bold", "Landroid/widget/TextView;", "clear", "Landroid/widget/EditText;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "disable", "Landroid/view/View;", "disableError", "Lcom/google/android/material/textfield/TextInputLayout;", "enable", "getCheckedButtonText", "", "Landroid/widget/RadioGroup;", "gone", "invisible", "onClick", "listener", "Landroid/view/View$OnClickListener;", "onFocusLost", "Lkotlin/Function0;", "onTextChanged", "Lkotlin/Function1;", "replaceFragAllowingStateLoss", "addToBackStack", "", "replaceFragment", "setColorOfSubstring", "substring", "color", "setDrawableLeft", "drawable", "show", "underLine", "eeblueprint_debug"})
public final class UIExtensionsKt {
    
    /**
     * An Extension function that allows the commit after the state of the Activity is saved.
     *
     * @receiver FragmentManager
     * @param container Int
     * @param fragment Fragment
     */
    public static final void addFragAllowingStateLoss(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager $this$addFragAllowingStateLoss, int container, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
    
    /**
     * An Extension function to add a fragment
     *
     * @receiver FragmentManager
     * @param container Int
     * @param fragment Fragment
     */
    public static final void addFragment(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager $this$addFragment, int container, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
    
    /**
     * An Extension function that allows the commit after the state of the Activity is saved.
     *
     * @receiver FragmentManager
     * @param container Int
     * @param fragment Fragment
     * @param addToBackStack Boolean
     */
    public static final void replaceFragAllowingStateLoss(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager $this$replaceFragAllowingStateLoss, int container, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, boolean addToBackStack) {
    }
    
    /**
     * An Extension function that replaces the fragment
     *
     * @receiver FragmentManager
     * @param container Int
     * @param fragment Fragment
     * @param addToBackStack Boolean
     */
    public static final void replaceFragment(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager $this$replaceFragment, int container, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, boolean addToBackStack) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.view.View show(@org.jetbrains.annotations.NotNull
    android.view.View $this$show) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.view.View invisible(@org.jetbrains.annotations.NotNull
    android.view.View $this$invisible) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.view.View gone(@org.jetbrains.annotations.NotNull
    android.view.View $this$gone) {
        return null;
    }
    
    public static final void gone(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<android.view.View> $this$gone) {
    }
    
    public static final void show(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<android.view.View> $this$show) {
    }
    
    public static final void enable(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<android.view.View> $this$enable) {
    }
    
    public static final void disable(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<android.view.View> $this$disable) {
    }
    
    public static final void onClick(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<android.view.View> $this$onClick, @org.jetbrains.annotations.NotNull
    android.view.View.OnClickListener listener) {
    }
    
    public static final void enable(@org.jetbrains.annotations.NotNull
    android.view.View $this$enable) {
    }
    
    public static final void disable(@org.jetbrains.annotations.NotNull
    android.view.View $this$disable) {
    }
    
    public static final int getDp(int $this$dp) {
        return 0;
    }
    
    public static final int getPx(int $this$px) {
        return 0;
    }
    
    /**
     * An Extension function to get the text of the selected checked button
     *
     * @receiver RadioGroup
     * @return String
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCheckedButtonText(@org.jetbrains.annotations.NotNull
    android.widget.RadioGroup $this$getCheckedButtonText) {
        return null;
    }
    
    public static final void bold(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$bold) {
    }
    
    public static final void underLine(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$underLine) {
    }
    
    public static final void setColorOfSubstring(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setColorOfSubstring, @org.jetbrains.annotations.NotNull
    java.lang.String substring, int color) {
    }
    
    public static final void setDrawableLeft(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setDrawableLeft, int drawable) {
    }
    
    public static final void clear(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<android.widget.EditText> $this$clear) {
    }
    
    public static final void clear(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$clear) {
    }
    
    public static final void disableError(@org.jetbrains.annotations.NotNull
    com.google.android.material.textfield.TextInputLayout $this$disableError) {
    }
    
    public static final void onTextChanged(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$onTextChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChanged) {
    }
    
    public static final void onFocusLost(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$onFocusLost, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFocusLost) {
    }
}