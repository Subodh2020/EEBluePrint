package com.extraaedge.eeblueprint.ui;

import java.lang.System;

/**
 * This is Abstract BlueprintActivity, it contains boilerplate code necessary for creating a
 * new activity but in a more concise way yes by using Kotlin.
 * A new activity should be created by extending BlueprintActivity which will help in
 * setting the layout. This class also has kotlin common functions, extension functions..which
 * can come handy if .. It avoids
 * writing of the boilerplate code and use direct functions given. Details about every function can be
 * found at corresponding function.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH\u0004J\b\u0010\u000b\u001a\u00020\fH&J\u0006\u0010\r\u001a\u00020\bJ\b\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0004J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J\u0012\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aJ \u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001fJ \u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001fJ \u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001fJ\b\u0010\"\u001a\u00020\u0014H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/extraaedge/eeblueprint/ui/BlueprintActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mToolbar", "Landroidx/appcompat/widget/Toolbar;", "progressDialog", "Lcom/extraaedge/eeblueprint/ui/BlueprintLoadingDialog;", "configureToolbar", "", "create", "enableHome", "getActivity", "Landroid/app/Activity;", "hideProgress", "layout", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "secure", "setTitle", "title", "", "showProgress", "message", "snackBarError", "onDismiss", "Lkotlin/Function0;", "snackBarInfo", "snackBarSuccess", "toolbarPresent", "eeblueprint_debug"})
public abstract class BlueprintActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.appcompat.widget.Toolbar mToolbar;
    private com.extraaedge.eeblueprint.ui.BlueprintLoadingDialog progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    public BlueprintActivity() {
        super();
    }
    
    /**
     * An abstract function for actual functionality
     */
    public abstract void create();
    
    /**
     * Abstract function to get the view to be inflated in the current activity.
     * Just pass in the view.
     *
     * @return Int
     */
    public abstract int layout();
    
    /**
     * Abstract function to get the Activity instance, needs to be implemented by child class
     *
     * @return instance of the current Activity
     */
    @org.jetbrains.annotations.NotNull
    public abstract android.app.Activity getActivity();
    
    public abstract boolean toolbarPresent();
    
    /**
     * All we need is to pass the layout and if or else you need to a toolbar
     * create function will do whatever you wish to do in terms of functionality.
     *
     * @param savedInstanceState Bundle?
     */
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void configureToolbar() {
    }
    
    /**
     * A function for simply setting up the title
     *
     * @param title String
     */
    protected final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    /**
     * A function that gets you a back arrow on the left of the Action Bar
     */
    protected final void enableHome() {
    }
    
    /**
     * A function that secures our application from taking the screenshot.
     */
    protected final void secure() {
    }
    
    /**
     * This function is overridden from the AppCompact Activity to check for
     * ids here when a user clicks the home i.e android.R.id.home the activity performs a
     * back press and returns true
     *
     * @param item MenuItem?
     * @return Boolean
     */
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    public final void showProgress(@org.jetbrains.annotations.Nullable
    java.lang.String message) {
    }
    
    public final void hideProgress() {
    }
    
    public final void snackBarError(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    public final void snackBarSuccess(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    public final void snackBarInfo(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
}