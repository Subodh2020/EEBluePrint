package com.extraaedge.eeblueprint.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u000e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u0014"}, d2 = {"beforeIcs", "", "beforeKitkat", "beforeLollipop", "beforeMarshmallow", "beforeNougat", "beforeOreo", "beforeVersion", "version", "", "currentVersion", "icsOrNewer", "isOlderVersionThen", "isOnVersionOrNewer", "kitkatOrNewer", "lollipopOrNewer", "marshmallowOrNewer", "nougatOrNewer", "oreoOrNewer", "versionOrNewer", "eeblueprint_debug"})
public final class PlatformKt {
    
    public static final boolean beforeOreo() {
        return false;
    }
    
    public static final boolean oreoOrNewer() {
        return false;
    }
    
    public static final boolean beforeNougat() {
        return false;
    }
    
    public static final boolean nougatOrNewer() {
        return false;
    }
    
    public static final boolean beforeMarshmallow() {
        return false;
    }
    
    public static final boolean marshmallowOrNewer() {
        return false;
    }
    
    public static final boolean beforeLollipop() {
        return false;
    }
    
    public static final boolean lollipopOrNewer() {
        return false;
    }
    
    public static final boolean beforeKitkat() {
        return false;
    }
    
    public static final boolean kitkatOrNewer() {
        return false;
    }
    
    public static final boolean beforeIcs() {
        return false;
    }
    
    public static final boolean icsOrNewer() {
        return false;
    }
    
    public static final boolean beforeVersion(int version) {
        return false;
    }
    
    public static final boolean versionOrNewer(int version) {
        return false;
    }
    
    public static final int currentVersion() {
        return 0;
    }
    
    private static final boolean isOlderVersionThen(int version) {
        return false;
    }
    
    private static final boolean isOnVersionOrNewer(int version) {
        return false;
    }
}