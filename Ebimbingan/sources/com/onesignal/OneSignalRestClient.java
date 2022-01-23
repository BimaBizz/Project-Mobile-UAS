package com.onesignal;

import android.net.TrafficStats;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;
import org.shaded.apache.http.client.methods.HttpPut;

class OneSignalRestClient {
    private static final String BASE_URL = "https://api.onesignal.com/";
    static final String CACHE_KEY_GET_TAGS = "CACHE_KEY_GET_TAGS";
    static final String CACHE_KEY_REMOTE_PARAMS = "CACHE_KEY_REMOTE_PARAMS";
    private static final int GET_TIMEOUT = 60000;
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private static final int TIMEOUT = 120000;

    static abstract class ResponseHandler {
        ResponseHandler() {
        }

        /* access modifiers changed from: package-private */
        public void onSuccess(String response) {
        }

        /* access modifiers changed from: package-private */
        public void onFailure(int statusCode, String response, Throwable throwable) {
        }
    }

    OneSignalRestClient() {
    }

    private static int getThreadTimeout(int timeout) {
        return timeout + 5000;
    }

    public static void put(String url, JSONObject jsonBody, ResponseHandler responseHandler) {
        Thread thread;
        Runnable runnable;
        final String str = url;
        final JSONObject jSONObject = jsonBody;
        final ResponseHandler responseHandler2 = responseHandler;
        new Runnable() {
            public void run() {
                OneSignalRestClient.makeRequest(str, HttpPut.METHOD_NAME, jSONObject, responseHandler2, OneSignalRestClient.TIMEOUT, (String) null);
            }
        };
        new Thread(runnable, "OS_REST_ASYNC_PUT");
        thread.start();
    }

    public static void post(String url, JSONObject jsonBody, ResponseHandler responseHandler) {
        Thread thread;
        Runnable runnable;
        final String str = url;
        final JSONObject jSONObject = jsonBody;
        final ResponseHandler responseHandler2 = responseHandler;
        new Runnable() {
            public void run() {
                OneSignalRestClient.makeRequest(str, "POST", jSONObject, responseHandler2, OneSignalRestClient.TIMEOUT, (String) null);
            }
        };
        new Thread(runnable, "OS_REST_ASYNC_POST");
        thread.start();
    }

    public static void get(String url, ResponseHandler responseHandler, @NonNull String cacheKey) {
        Thread thread;
        Runnable runnable;
        final String str = url;
        final ResponseHandler responseHandler2 = responseHandler;
        final String str2 = cacheKey;
        new Runnable() {
            public void run() {
                OneSignalRestClient.makeRequest(str, (String) null, (JSONObject) null, responseHandler2, OneSignalRestClient.GET_TIMEOUT, str2);
            }
        };
        new Thread(runnable, "OS_REST_ASYNC_GET");
        thread.start();
    }

    public static void getSync(String url, ResponseHandler responseHandler, @NonNull String cacheKey) {
        makeRequest(url, (String) null, (JSONObject) null, responseHandler, GET_TIMEOUT, cacheKey);
    }

    public static void putSync(String url, JSONObject jsonBody, ResponseHandler responseHandler) {
        makeRequest(url, HttpPut.METHOD_NAME, jsonBody, responseHandler, TIMEOUT, (String) null);
    }

    public static void postSync(String url, JSONObject jsonBody, ResponseHandler responseHandler) {
        makeRequest(url, "POST", jsonBody, responseHandler, TIMEOUT, (String) null);
    }

    /* access modifiers changed from: private */
    public static void makeRequest(String str, String str2, JSONObject jSONObject, ResponseHandler responseHandler, int i, String str3) {
        Thread thread;
        Runnable runnable;
        Throwable th;
        StringBuilder sb;
        String url = str;
        String method = str2;
        JSONObject jsonBody = jSONObject;
        ResponseHandler responseHandler2 = responseHandler;
        int timeout = i;
        String cacheKey = str3;
        if (OSUtils.isRunningOnMainThread()) {
            Throwable th2 = th;
            new StringBuilder();
            new OneSignalNetworkCallException(sb.append("Method: ").append(method).append(" was called from the Main Thread!").toString());
            throw th2;
        } else if (method == null || !OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName((String) null)) {
            Thread[] callbackThread = new Thread[1];
            final Thread[] threadArr = callbackThread;
            final String str4 = url;
            final String str5 = method;
            final JSONObject jSONObject2 = jsonBody;
            final ResponseHandler responseHandler3 = responseHandler2;
            final int i2 = timeout;
            final String str6 = cacheKey;
            new Runnable() {
                public void run() {
                    threadArr[0] = OneSignalRestClient.startHTTPConnection(str4, str5, jSONObject2, responseHandler3, i2, str6);
                }
            };
            new Thread(runnable, "OS_HTTPConnection");
            Thread connectionThread = thread;
            connectionThread.start();
            try {
                connectionThread.join((long) getThreadTimeout(timeout));
                if (connectionThread.getState() != Thread.State.TERMINATED) {
                    connectionThread.interrupt();
                }
                if (callbackThread[0] != null) {
                    callbackThread[0].join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static Thread startHTTPConnection(String str, String str2, JSONObject jSONObject, ResponseHandler responseHandler, int i, @Nullable String str3) {
        Thread callbackThread;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        Scanner scanner;
        StringBuilder sb6;
        String eTag;
        StringBuilder sb7;
        StringBuilder sb8;
        StringBuilder sb9;
        StringBuilder sb10;
        StringBuilder sb11;
        StringBuilder sb12;
        StringBuilder sb13;
        Scanner scanner2;
        StringBuilder sb14;
        StringBuilder sb15;
        StringBuilder sb16;
        StringBuilder sb17;
        String url = str;
        String method = str2;
        JSONObject jsonBody = jSONObject;
        ResponseHandler responseHandler2 = responseHandler;
        int timeout = i;
        String cacheKey = str3;
        int httpResponse = -1;
        HttpURLConnection con = null;
        if (Build.VERSION.SDK_INT >= 26) {
            TrafficStats.setThreadStatsTag(10000);
        }
        try {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb3.append("OneSignalRestClient: Making request to: https://api.onesignal.com/").append(url).toString());
            con = newHttpURLConnection(url);
            con.setUseCaches(false);
            con.setConnectTimeout(timeout);
            con.setReadTimeout(timeout);
            con.setRequestProperty("SDK-Version", "onesignal/android/031507");
            con.setRequestProperty("Accept", OS_ACCEPT_HEADER);
            if (jsonBody != null) {
                con.setDoInput(true);
            }
            if (method != null) {
                con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                con.setRequestMethod(method);
                con.setDoOutput(true);
            }
            if (jsonBody != null) {
                String strJsonBody = jsonBody.toString();
                OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.Log(log_level2, sb17.append("OneSignalRestClient: ").append(method).append(" SEND JSON: ").append(strJsonBody).toString());
                byte[] sendBytes = strJsonBody.getBytes("UTF-8");
                con.setFixedLengthStreamingMode(sendBytes.length);
                con.getOutputStream().write(sendBytes);
            }
            if (cacheKey != null) {
                String str4 = OneSignalPrefs.PREFS_ONESIGNAL;
                new StringBuilder();
                String eTag2 = OneSignalPrefs.getString(str4, sb15.append(OneSignalPrefs.PREFS_OS_ETAG_PREFIX).append(cacheKey).toString(), (String) null);
                if (eTag2 != null) {
                    con.setRequestProperty("if-none-match", eTag2);
                    OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level3, sb16.append("OneSignalRestClient: Adding header if-none-match: ").append(eTag2).toString());
                }
            }
            httpResponse = con.getResponseCode();
            OneSignal.LOG_LEVEL log_level4 = OneSignal.LOG_LEVEL.VERBOSE;
            new StringBuilder();
            OneSignal.Log(log_level4, sb4.append("OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/").append(url).toString());
            switch (httpResponse) {
                case 200:
                case 202:
                    OneSignal.LOG_LEVEL log_level5 = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level5, sb5.append("OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/").append(url).toString());
                    new Scanner(con.getInputStream(), "UTF-8");
                    Scanner scanner3 = scanner;
                    String json = scanner3.useDelimiter("\\A").hasNext() ? scanner3.next() : "";
                    scanner3.close();
                    OneSignal.LOG_LEVEL log_level6 = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level6, sb6.append("OneSignalRestClient: ").append(method == null ? "GET" : method).append(" RECEIVED JSON: ").append(json).toString());
                    if (!(cacheKey == null || (eTag = con.getHeaderField("etag")) == null)) {
                        OneSignal.LOG_LEVEL log_level7 = OneSignal.LOG_LEVEL.DEBUG;
                        new StringBuilder();
                        OneSignal.Log(log_level7, sb7.append("OneSignalRestClient: Response has etag of ").append(eTag).append(" so caching the response.").toString());
                        String str5 = OneSignalPrefs.PREFS_ONESIGNAL;
                        new StringBuilder();
                        OneSignalPrefs.saveString(str5, sb8.append(OneSignalPrefs.PREFS_OS_ETAG_PREFIX).append(cacheKey).toString(), eTag);
                        String str6 = OneSignalPrefs.PREFS_ONESIGNAL;
                        new StringBuilder();
                        OneSignalPrefs.saveString(str6, sb9.append(OneSignalPrefs.PREFS_OS_HTTP_CACHE_PREFIX).append(cacheKey).toString(), json);
                    }
                    callbackThread = callResponseHandlerOnSuccess(responseHandler2, json);
                    break;
                case 304:
                    String str7 = OneSignalPrefs.PREFS_ONESIGNAL;
                    new StringBuilder();
                    String cachedResponse = OneSignalPrefs.getString(str7, sb10.append(OneSignalPrefs.PREFS_OS_HTTP_CACHE_PREFIX).append(cacheKey).toString(), (String) null);
                    OneSignal.LOG_LEVEL log_level8 = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level8, sb11.append("OneSignalRestClient: ").append(method == null ? "GET" : method).append(" - Using Cached response due to 304: ").append(cachedResponse).toString());
                    callbackThread = callResponseHandlerOnSuccess(responseHandler2, cachedResponse);
                    break;
                default:
                    OneSignal.LOG_LEVEL log_level9 = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level9, sb12.append("OneSignalRestClient: Failed request to: https://api.onesignal.com/").append(url).toString());
                    InputStream inputStream = con.getErrorStream();
                    if (inputStream == null) {
                        inputStream = con.getInputStream();
                    }
                    String jsonResponse = null;
                    if (inputStream != null) {
                        new Scanner(inputStream, "UTF-8");
                        Scanner scanner4 = scanner2;
                        jsonResponse = scanner4.useDelimiter("\\A").hasNext() ? scanner4.next() : "";
                        scanner4.close();
                        OneSignal.LOG_LEVEL log_level10 = OneSignal.LOG_LEVEL.WARN;
                        new StringBuilder();
                        OneSignal.Log(log_level10, sb14.append("OneSignalRestClient: ").append(method).append(" RECEIVED JSON: ").append(jsonResponse).toString());
                    } else {
                        OneSignal.LOG_LEVEL log_level11 = OneSignal.LOG_LEVEL.WARN;
                        new StringBuilder();
                        OneSignal.Log(log_level11, sb13.append("OneSignalRestClient: ").append(method).append(" HTTP Code: ").append(httpResponse).append(" No response body!").toString());
                    }
                    callbackThread = callResponseHandlerOnFailure(responseHandler2, httpResponse, jsonResponse, (Throwable) null);
                    break;
            }
            if (con != null) {
                con.disconnect();
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            if (con != null) {
                con.disconnect();
            }
            throw th2;
        }
        return callbackThread;
    }

    private static Thread callResponseHandlerOnSuccess(ResponseHandler responseHandler, String str) {
        Thread thread;
        Runnable runnable;
        ResponseHandler handler = responseHandler;
        String response = str;
        if (handler == null) {
            return null;
        }
        final ResponseHandler responseHandler2 = handler;
        final String str2 = response;
        new Runnable() {
            public void run() {
                responseHandler2.onSuccess(str2);
            }
        };
        new Thread(runnable, "OS_REST_SUCCESS_CALLBACK");
        Thread thread2 = thread;
        thread2.start();
        return thread2;
    }

    private static Thread callResponseHandlerOnFailure(ResponseHandler responseHandler, int i, String str, Throwable th) {
        Thread thread;
        Runnable runnable;
        ResponseHandler handler = responseHandler;
        int statusCode = i;
        String response = str;
        Throwable throwable = th;
        if (handler == null) {
            return null;
        }
        final ResponseHandler responseHandler2 = handler;
        final int i2 = statusCode;
        final String str2 = response;
        final Throwable th2 = throwable;
        new Runnable() {
            public void run() {
                responseHandler2.onFailure(i2, str2, th2);
            }
        };
        new Thread(runnable, "OS_REST_FAILURE_CALLBACK");
        Thread thread2 = thread;
        thread2.start();
        return thread2;
    }

    private static HttpURLConnection newHttpURLConnection(String url) throws IOException {
        URL url2;
        StringBuilder sb;
        new StringBuilder();
        new URL(sb.append(BASE_URL).append(url).toString());
        return (HttpURLConnection) url2.openConnection();
    }

    private static class OneSignalNetworkCallException extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OneSignalNetworkCallException(String message) {
            super(message);
        }
    }
}
