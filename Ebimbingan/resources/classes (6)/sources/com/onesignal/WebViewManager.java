package com.onesignal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.InAppMessageView;
import com.onesignal.OneSignal;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(19)
class WebViewManager extends ActivityLifecycleHandler.ActivityAvailableListener {
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private static final int MARGIN_PX_SIZE = OSViewUtils.dpToPx(24);
    private static final String TAG = WebViewManager.class.getCanonicalName();
    @Nullable
    protected static WebViewManager lastInstance = null;
    /* access modifiers changed from: private */
    @NonNull
    public Activity activity;
    private String currentActivityName = null;
    private Integer lastPageHeight = null;
    /* access modifiers changed from: private */
    @NonNull
    public OSInAppMessage message;
    /* access modifiers changed from: private */
    @Nullable
    public InAppMessageView messageView;
    /* access modifiers changed from: private */
    @Nullable
    public OSWebView webView;

    interface OneSignalGenericCallback {
        void onComplete();
    }

    static /* synthetic */ InAppMessageView access$202(WebViewManager x0, InAppMessageView x1) {
        InAppMessageView inAppMessageView = x1;
        InAppMessageView inAppMessageView2 = inAppMessageView;
        x0.messageView = inAppMessageView2;
        return inAppMessageView;
    }

    enum Position {
        ;

        /* access modifiers changed from: package-private */
        public boolean isBanner() {
            switch (this) {
                case TOP_BANNER:
                case BOTTOM_BANNER:
                    return true;
                default:
                    return false;
            }
        }
    }

    protected WebViewManager(@NonNull OSInAppMessage message2, @NonNull Activity activity2) {
        this.message = message2;
        this.activity = activity2;
    }

    static void showHTMLString(@NonNull OSInAppMessage oSInAppMessage, @NonNull String str) {
        StringBuilder sb;
        Handler handler;
        Runnable runnable;
        OneSignalGenericCallback oneSignalGenericCallback;
        OSInAppMessage message2 = oSInAppMessage;
        String htmlStr = str;
        Activity currentActivity = OneSignal.getCurrentActivity();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("in app message showHTMLString on currentActivity: ").append(currentActivity).toString());
        if (currentActivity == null) {
            Looper.prepare();
            new Handler();
            final OSInAppMessage oSInAppMessage2 = message2;
            final String str2 = htmlStr;
            new Runnable() {
                public void run() {
                    WebViewManager.showHTMLString(oSInAppMessage2, str2);
                }
            };
            boolean postDelayed = handler.postDelayed(runnable, 200);
        } else if (lastInstance == null || !message2.isPreview) {
            initInAppMessage(currentActivity, message2, htmlStr);
        } else {
            final Activity activity2 = currentActivity;
            final OSInAppMessage oSInAppMessage3 = message2;
            final String str3 = htmlStr;
            new OneSignalGenericCallback() {
                public void onComplete() {
                    WebViewManager.lastInstance = null;
                    WebViewManager.initInAppMessage(activity2, oSInAppMessage3, str3);
                }
            };
            lastInstance.dismissAndAwaitNextMessage(oneSignalGenericCallback);
        }
    }

    static void dismissCurrentInAppMessage() {
        StringBuilder sb;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: ").append(lastInstance).toString());
        if (lastInstance != null) {
            lastInstance.dismissAndAwaitNextMessage((OneSignalGenericCallback) null);
        }
    }

    /* access modifiers changed from: private */
    public static void initInAppMessage(@NonNull Activity activity2, @NonNull OSInAppMessage oSInAppMessage, @NonNull String htmlStr) {
        WebViewManager webViewManager;
        Runnable runnable;
        Activity currentActivity = activity2;
        OSInAppMessage message2 = oSInAppMessage;
        try {
            String base64Str = Base64.encodeToString(htmlStr.getBytes(Key.STRING_CHARSET_NAME), 2);
            new WebViewManager(message2, currentActivity);
            WebViewManager webViewManager2 = webViewManager;
            lastInstance = webViewManager2;
            final Activity activity3 = currentActivity;
            final String str = base64Str;
            new Runnable(webViewManager2) {
                final /* synthetic */ WebViewManager val$webViewManager;

                {
                    this.val$webViewManager = r7;
                }

                public void run() {
                    this.val$webViewManager.setupWebView(activity3, str);
                }
            };
            OSUtils.runOnMainUIThread(runnable);
        } catch (UnsupportedEncodingException e) {
            UnsupportedEncodingException e2 = e;
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Catch on initInAppMessage: ", e2);
            e2.printStackTrace();
        }
    }

    class OSJavaScriptInterface {
        static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
        static final String EVENT_TYPE_KEY = "type";
        static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
        static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
        static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
        static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
        static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
        static final String JS_OBJ_NAME = "OSAndroid";
        final /* synthetic */ WebViewManager this$0;

        OSJavaScriptInterface(WebViewManager this$02) {
            this.this$0 = this$02;
        }

        @JavascriptInterface
        public void postMessage(String str) {
            StringBuilder sb;
            JSONObject jSONObject;
            String message = str;
            try {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("OSJavaScriptInterface:postMessage: ").append(message).toString());
                new JSONObject(message);
                JSONObject jsonObject = jSONObject;
                String messageType = jsonObject.getString("type");
                if (messageType.equals(EVENT_TYPE_RENDERING_COMPLETE)) {
                    handleRenderComplete(jsonObject);
                } else if (messageType.equals(EVENT_TYPE_ACTION_TAKEN) && !this.this$0.messageView.isDragging()) {
                    handleActionTaken(jsonObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        private void handleRenderComplete(JSONObject jSONObject) {
            JSONObject jsonObject = jSONObject;
            Position displayType = getDisplayLocation(jsonObject);
            this.this$0.createNewInAppMessageView(displayType, displayType == Position.FULL_SCREEN ? -1 : getPageHeightData(jsonObject), getDragToDismissDisabled(jsonObject));
        }

        private int getPageHeightData(JSONObject jsonObject) {
            try {
                return WebViewManager.pageRectToViewHeight(this.this$0.activity, jsonObject.getJSONObject(IAM_PAGE_META_DATA_KEY));
            } catch (JSONException e) {
                JSONException jSONException = e;
                return -1;
            }
        }

        @NonNull
        private Position getDisplayLocation(JSONObject jSONObject) {
            JSONObject jsonObject = jSONObject;
            Position displayLocation = Position.FULL_SCREEN;
            try {
                if (jsonObject.has(IAM_DISPLAY_LOCATION_KEY) && !jsonObject.get(IAM_DISPLAY_LOCATION_KEY).equals("")) {
                    displayLocation = Position.valueOf(jsonObject.optString(IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN").toUpperCase());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return displayLocation;
        }

        private boolean getDragToDismissDisabled(JSONObject jsonObject) {
            try {
                return jsonObject.getBoolean(IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException e) {
                JSONException jSONException = e;
                return false;
            }
        }

        private void handleActionTaken(JSONObject jsonObject) throws JSONException {
            JSONObject body = jsonObject.getJSONObject("body");
            String id = body.optString(CommonProperties.ID, (String) null);
            if (this.this$0.message.isPreview) {
                OneSignal.getInAppMessageController().onMessageActionOccurredOnPreview(this.this$0.message, body);
            } else if (id != null) {
                OneSignal.getInAppMessageController().onMessageActionOccurredOnMessage(this.this$0.message, body);
            }
            if (body.getBoolean("close")) {
                this.this$0.dismissAndAwaitNextMessage((OneSignalGenericCallback) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public static int pageRectToViewHeight(@NonNull Activity activity2, @NonNull JSONObject jsonObject) {
        StringBuilder sb;
        StringBuilder sb2;
        Activity activity3 = activity2;
        try {
            int pxHeight = OSViewUtils.dpToPx(jsonObject.getJSONObject("rect").getInt("height"));
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb.append("getPageHeightData:pxHeight: ").append(pxHeight).toString());
            int maxPxHeight = getWebViewMaxSizeY(activity3);
            if (pxHeight > maxPxHeight) {
                pxHeight = maxPxHeight;
                OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.Log(log_level2, sb2.append("getPageHeightData:pxHeight is over screen max: ").append(maxPxHeight).toString());
            }
            return pxHeight;
        } catch (JSONException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "pageRectToViewHeight could not get page height", e);
            return -1;
        }
    }

    private void calculateHeightAndShowWebViewAfterNewActivity() {
        Runnable runnable;
        if (this.messageView != null) {
            if (this.messageView.getDisplayPosition() == Position.FULL_SCREEN) {
                showMessageView((Integer) null);
                return;
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "In app message new activity, calculate height and show ");
            new Runnable(this) {
                final /* synthetic */ WebViewManager this$0;

                {
                    this.this$0 = this$0;
                }

                public void run() {
                    ValueCallback valueCallback;
                    this.this$0.setWebViewToMaxSize(this.this$0.activity);
                    new ValueCallback<String>(this) {
                        final /* synthetic */ AnonymousClass4 this$1;

                        {
                            this.this$1 = this$1;
                        }

                        public void onReceiveValue(String value) {
                            JSONObject jSONObject;
                            try {
                                new JSONObject(value);
                                this.this$1.this$0.showMessageView(Integer.valueOf(WebViewManager.pageRectToViewHeight(this.this$1.this$0.activity, jSONObject)));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    this.this$0.webView.evaluateJavascript("getPageMetaData()", valueCallback);
                }
            };
            OSViewUtils.decorViewReady(this.activity, runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public void available(@NonNull Activity activity2) {
        Activity activity3 = activity2;
        String lastActivityName = this.currentActivityName;
        this.activity = activity3;
        this.currentActivityName = activity3.getLocalClassName();
        if (lastActivityName == null) {
            showMessageView((Integer) null);
        } else if (!lastActivityName.equals(this.currentActivityName)) {
            if (this.messageView != null) {
                this.messageView.removeAllViews();
            }
            showMessageView(this.lastPageHeight);
        } else {
            calculateHeightAndShowWebViewAfterNewActivity();
        }
    }

    /* access modifiers changed from: package-private */
    public void stopped(Activity activity2) {
        Activity activity3 = activity2;
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "In app message activity stopped, cleaning views");
        if (this.messageView != null && this.currentActivityName.equals(activity3.getLocalClassName())) {
            this.messageView.removeAllViews();
        }
    }

    /* access modifiers changed from: package-private */
    public void lostFocus() {
        OneSignal.getInAppMessageController().messageWasDismissedByBackPress(this.message);
        removeActivityListener();
        this.messageView = null;
    }

    /* access modifiers changed from: private */
    public void showMessageView(@Nullable Integer num) {
        StringBuilder sb;
        Integer newHeight = num;
        if (this.messageView == null) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "No messageView found to update a with a new height.");
            return;
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("In app message, showing first one with height: ").append(newHeight).toString());
        this.messageView.setWebView(this.webView);
        if (newHeight != null) {
            this.lastPageHeight = newHeight;
            this.messageView.updateHeight(newHeight.intValue());
        }
        this.messageView.showView(this.activity);
        this.messageView.checkIfShouldDismiss();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public void setupWebView(@NonNull Activity activity2, @NonNull String base64Message) {
        OSWebView oSWebView;
        Object obj;
        Runnable runnable;
        Activity currentActivity = activity2;
        enableWebViewRemoteDebugging();
        new OSWebView(currentActivity);
        this.webView = oSWebView;
        this.webView.setOverScrollMode(2);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.getSettings().setJavaScriptEnabled(true);
        new OSJavaScriptInterface(this);
        this.webView.addJavascriptInterface(obj, "OSAndroid");
        blurryRenderingWebViewForKitKatWorkAround(this.webView);
        final Activity activity3 = currentActivity;
        final String str = base64Message;
        new Runnable(this) {
            final /* synthetic */ WebViewManager this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                this.this$0.setWebViewToMaxSize(activity3);
                this.this$0.webView.loadData(str, "text/html; charset=utf-8", "base64");
            }
        };
        OSViewUtils.decorViewReady(currentActivity, runnable);
    }

    private void blurryRenderingWebViewForKitKatWorkAround(@NonNull WebView webView2) {
        WebView webView3 = webView2;
        if (Build.VERSION.SDK_INT == 19) {
            webView3.setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: private */
    public void setWebViewToMaxSize(Activity activity2) {
        Activity activity3 = activity2;
        this.webView.layout(0, 0, getWebViewMaxSizeX(activity3), getWebViewMaxSizeY(activity3));
    }

    /* access modifiers changed from: private */
    public void createNewInAppMessageView(@NonNull Position displayLocation, int i, boolean z) {
        InAppMessageView inAppMessageView;
        InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
        StringBuilder sb;
        int pageHeight = i;
        boolean z2 = z;
        this.lastPageHeight = Integer.valueOf(pageHeight);
        new InAppMessageView(this.webView, displayLocation, pageHeight, this.message.getDisplayDuration());
        this.messageView = inAppMessageView;
        new InAppMessageView.InAppMessageViewListener(this) {
            final /* synthetic */ WebViewManager this$0;

            {
                this.this$0 = this$0;
            }

            public void onMessageWasShown() {
                OneSignal.getInAppMessageController().onMessageWasShown(this.this$0.message);
            }

            public void onMessageWasDismissed() {
                OneSignal.getInAppMessageController().messageWasDismissed(this.this$0.message);
                this.this$0.removeActivityListener();
            }
        };
        this.messageView.setMessageController(inAppMessageViewListener);
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            new StringBuilder();
            activityLifecycleHandler.addActivityAvailableListener(sb.append(TAG).append(this.message.messageId).toString(), this);
        }
    }

    private static void enableWebViewRemoteDebugging() {
        if (Build.VERSION.SDK_INT >= 19 && OneSignal.atLogLevel(OneSignal.LOG_LEVEL.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private static int getWebViewMaxSizeX(Activity activity2) {
        return OSViewUtils.getWindowWidth(activity2) - (MARGIN_PX_SIZE * 2);
    }

    private static int getWebViewMaxSizeY(Activity activity2) {
        return OSViewUtils.getWindowHeight(activity2) - (MARGIN_PX_SIZE * 2);
    }

    /* access modifiers changed from: private */
    public void removeActivityListener() {
        StringBuilder sb;
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            new StringBuilder();
            activityLifecycleHandler.removeActivityAvailableListener(sb.append(TAG).append(this.message.messageId).toString());
        }
    }

    /* access modifiers changed from: protected */
    public void dismissAndAwaitNextMessage(@Nullable OneSignalGenericCallback oneSignalGenericCallback) {
        OneSignalGenericCallback oneSignalGenericCallback2;
        OneSignalGenericCallback callback = oneSignalGenericCallback;
        if (this.messageView != null) {
            final OneSignalGenericCallback oneSignalGenericCallback3 = callback;
            new OneSignalGenericCallback(this) {
                final /* synthetic */ WebViewManager this$0;

                {
                    this.this$0 = this$0;
                }

                public void onComplete() {
                    InAppMessageView access$202 = WebViewManager.access$202(this.this$0, (InAppMessageView) null);
                    if (oneSignalGenericCallback3 != null) {
                        oneSignalGenericCallback3.onComplete();
                    }
                }
            };
            this.messageView.dismissAndAwaitNextMessage(oneSignalGenericCallback2);
        } else if (callback != null) {
            callback.onComplete();
        }
    }
}
