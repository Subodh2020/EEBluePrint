package com.extraaedge.eeblueprint.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b*\u0002H\u0007\u00a2\u0006\u0002\u0010\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\r\u001a\u00020\f*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\f\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014*\u00020\u000e\u00a2\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f\u001a\u001d\u0010\u001a\u001a\u00020\u001b*\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014\u00a2\u0006\u0002\u0010\u001d\u001a\n\u0010\u001e\u001a\u00020\u001b*\u00020\u0001\u001a\n\u0010\u001f\u001a\u00020\u001b*\u00020\u0001\u001a\n\u0010 \u001a\u00020\u001b*\u00020\u0001\u001a\n\u0010!\u001a\u00020\f*\u00020\"\u001a\u0014\u0010#\u001a\u00020\u0001*\u00020$2\b\b\u0002\u0010%\u001a\u00020\f\u001a\u0012\u0010&\u001a\u00020\u0017*\u00020\'2\u0006\u0010(\u001a\u00020\u0001\u001a\u0012\u0010)\u001a\u00020\u0017*\u00020\'2\u0006\u0010(\u001a\u00020\u0001\u001a\u0012\u0010*\u001a\u00020\u0017*\u00020\'2\u0006\u0010(\u001a\u00020\u0001\u001a\u0010\u0010+\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010,\u001a\u0010\u0010-\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010,\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006."}, d2 = {"value", "", "Landroid/widget/EditText;", "getValue", "(Landroid/widget/EditText;)Ljava/lang/String;", "TAG", "kotlin.jvm.PlatformType", "T", "", "(Ljava/lang/Object;)Ljava/lang/String;", "ellipsize", "at", "", "getColorCompat", "Landroid/content/Context;", "color", "getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "id", "getManifestPermissions", "", "(Landroid/content/Context;)[Ljava/lang/String;", "handleOverlayPermission", "", "Landroid/app/Activity;", "requestCode", "hasPermissions", "", "permissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "isEmail", "isNumeric", "isOnlyIndianPhone", "random", "Lkotlin/ranges/IntRange;", "randomString", "Ljava/util/Random;", "length", "snackBarError", "Landroid/view/View;", "message", "snackBarInfo", "snackBarSuccess", "toCommaSeparatedString", "Ljava/util/ArrayList;", "toLineSeparatedString", "eeblueprint_debug"})
public final class CommonExtensionsKt {
    
    /**
     * An extension function to check active network connections
     * @receiver Context
     * @return Boolean
     */
    public static final boolean hasPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hasPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
    
    public static final void handleOverlayPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$handleOverlayPermission, int requestCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String[] getManifestPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getManifestPermissions) {
        return null;
    }
    
    public static final void snackBarSuccess(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackBarSuccess, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void snackBarError(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackBarError, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void snackBarInfo(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackBarInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final int getColorCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorCompat, int color) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable getDrawableCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDrawableCompat, @androidx.annotation.DrawableRes()
    int id) {
        return null;
    }
    
    /**
     * An Extension function that separates the items of array list into a new line
     *
     * @receiver ArrayList<String>
     * @return String
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toLineSeparatedString(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> $this$toLineSeparatedString) {
        return null;
    }
    
    /**
     * An Extension function that separate the items of array list by comma
     *
     * @receiver ArrayList<String>
     * @return String
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toCommaSeparatedString(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> $this$toCommaSeparatedString) {
        return null;
    }
    
    public static final boolean isEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isEmail) {
        return false;
    }
    
    public static final boolean isNumeric(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isNumeric) {
        return false;
    }
    
    public static final boolean isOnlyIndianPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isOnlyIndianPhone) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$value) {
        return null;
    }
    
    public static final <T extends java.lang.Object>java.lang.String TAG(@org.jetbrains.annotations.NotNull()
    T $this$TAG) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ellipsize(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$ellipsize, int at) {
        return null;
    }
    
    public static final int random(@org.jetbrains.annotations.NotNull()
    kotlin.ranges.IntRange $this$random) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String randomString(@org.jetbrains.annotations.NotNull()
    java.util.Random $this$randomString, int length) {
        return null;
    }
}