package com.extraaedge.eeblueprint.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"BAD_REQUEST_MESSAGE", "", "INVALID_SESSION_MESSAGE", "NETWORK_CODE_400", "", "NETWORK_CODE_401", "NETWORK_CODE_404", "NETWORK_CODE_500", "NETWORK_CODE_502", "NO_NETWORK_MESSAGE", "RESOURCE_NOT_FOUND", "SERVER_NOT_RESPONDING", "SOMETHING_WENT_WRONG", "errorMessageFromCode", "eeblueprint_debug"})
public final class EEErrorUtilsKt {
    public static final int NETWORK_CODE_401 = 401;
    public static final int NETWORK_CODE_404 = 404;
    public static final int NETWORK_CODE_400 = 400;
    public static final int NETWORK_CODE_500 = 500;
    public static final int NETWORK_CODE_502 = 502;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NO_NETWORK_MESSAGE = "Slow Internet connection, please retry";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SOMETHING_WENT_WRONG = "Something went wrong! please retry";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERVER_NOT_RESPONDING = "Server is not responding! please retry";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INVALID_SESSION_MESSAGE = "Your session is invalid please re-login";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RESOURCE_NOT_FOUND = "Expected resource not found, please retry";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BAD_REQUEST_MESSAGE = "Unsuccessful request, please try again";
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String errorMessageFromCode(int $this$errorMessageFromCode) {
        return null;
    }
}