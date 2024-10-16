package com.extraaedge.eeblueprint.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000`\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u001e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0006\u0010\u001b\u001a\u00020\u0003\u001a>\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f\u001a\u001e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&\u001a\u0016\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003\u001a\u0006\u0010,\u001a\u00020\u0003\u001a\u000e\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u001f\u001a\u001e\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003\u001a\u0016\u00103\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003\u001a\u0006\u00104\u001a\u00020\u0003\u001a\u0010\u00105\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u000e\u00106\u001a\u0002072\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u000e\u00108\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0016\u0010:\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u0003\u001a\u0016\u0010<\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010=\u001a\u000207\u001a(\u0010>\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00032\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010@\u001a(\u0010A\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00032\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010@\u001a(\u0010B\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00032\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010@\u001a\n\u0010C\u001a\u00020D*\u00020E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"CONNECT_TIMEOUT_SECONDS", "", "HEADERS_IMPORT", "", "KEY_CLIENT_ID", "KEY_CREATED_ON", "KEY_EXPIRES_IN", "KEY_REFRESH_TOKEN", "KEY_TOKEN", "LOGGING_IMPORT", "OKLOG_IMPORT", "READ_TIMEOUT_SECONDS", "SECURITY_API_KEY_1", "SECURITY_API_KEY_1_NAME", "SECURITY_API_KEY_2_NAME", "SECURITY_KEY_HEADER", "TAG", "WRITE_TIMEOUT_SECONDS", "createGenericErrorResponse", "Lokhttp3/Response;", "context", "Landroid/content/Context;", "request", "Lokhttp3/Request;", "e", "Ljava/lang/Exception;", "createTimeoutErrorResponse", "currentTimeInISO", "customSnackBar", "", "backgroundColor", "", "textColor", "message", "actionText", "actionTextColor", "icon", "encryptAesCbc", "", "dataToEncrypt", "secretKey", "iv", "encryptStringWithKey", "stringToEncrypt", "generateGuid", "generateRandomBytes", "length", "generateSignature", "pathname", "queryString", "body", "generateSignatureFromUrlEncoded", "getAPIKey1Value", "getAuthToken", "getSession", "Lcom/extraaedge/eeblueprint/utils/EESession;", "isAuthTokenValid", "", "saveAuthToken", "token", "saveSession", "eeSession", "snackBarError", "onDismiss", "Lkotlin/Function0;", "snackBarInfo", "snackBarSuccess", "getEEError", "Lcom/extraaedge/eeblueprint/remote/EEError;", "", "eeblueprint_debug"})
public final class EEUtilsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TOKEN = "ee_token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_REFRESH_TOKEN = "ee_refresh_token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_EXPIRES_IN = "ee_expires_in";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CREATED_ON = "ee_created_on";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CLIENT_ID = "ee_client_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String HEADERS_IMPORT = "headers_import";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOGGING_IMPORT = "logging_import";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OKLOG_IMPORT = "oklog_import";
    public static final long CONNECT_TIMEOUT_SECONDS = 25L;
    public static final long READ_TIMEOUT_SECONDS = 45L;
    public static final long WRITE_TIMEOUT_SECONDS = 40L;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SECURITY_KEY_HEADER = "]{H?8hy}z5Q#ZL+(9mR+fsewed835*2dhHdfrhd!~sdgwe3453dghSEBSR";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SECURITY_API_KEY_1 = "L2dNwK@7tYz!8F6b";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SECURITY_API_KEY_1_NAME = "X-Ee-Correlation-Id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SECURITY_API_KEY_2_NAME = "x-Er-Id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "EEUtils_BluePrint:";
    
    public static final void saveAuthToken(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    public static final void saveSession(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.extraaedge.eeblueprint.utils.EESession eeSession) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.extraaedge.eeblueprint.utils.EESession getSession(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public static final boolean isAuthTokenValid(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getAuthToken(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.extraaedge.eeblueprint.remote.EEError getEEError(@org.jetbrains.annotations.NotNull
    java.lang.Throwable $this$getEEError) {
        return null;
    }
    
    public static final void snackBarSuccess(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    public static final void snackBarError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    public static final void snackBarInfo(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    public static final void customSnackBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, int backgroundColor, int textColor, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String actionText, int actionTextColor, int icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String currentTimeInISO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Response createTimeoutErrorResponse(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    okhttp3.Request request, @org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Response createGenericErrorResponse(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    okhttp3.Request request, @org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String generateSignature(@org.jetbrains.annotations.NotNull
    java.lang.String pathname, @org.jetbrains.annotations.NotNull
    java.lang.String queryString, @org.jetbrains.annotations.NotNull
    java.lang.String body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String generateSignatureFromUrlEncoded(@org.jetbrains.annotations.NotNull
    java.lang.String pathname, @org.jetbrains.annotations.NotNull
    java.lang.String body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String encryptStringWithKey(@org.jetbrains.annotations.NotNull
    java.lang.String stringToEncrypt, @org.jetbrains.annotations.NotNull
    java.lang.String secretKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final byte[] encryptAesCbc(@org.jetbrains.annotations.NotNull
    byte[] dataToEncrypt, @org.jetbrains.annotations.NotNull
    byte[] secretKey, @org.jetbrains.annotations.NotNull
    byte[] iv) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final byte[] generateRandomBytes(int length) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String generateGuid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getAPIKey1Value() {
        return null;
    }
}