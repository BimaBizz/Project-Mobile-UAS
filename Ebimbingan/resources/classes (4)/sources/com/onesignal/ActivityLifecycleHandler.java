package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import com.microsoft.appcenter.Constants;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ActivityLifecycleHandler implements OSSystemConditionController.OSSystemConditionHandler {
    private static final String FOCUS_LOST_WORKER_TAG = "FOCUS_LOST_WORKER_TAG";
    private static final Object SYNC_LOCK;
    static FocusHandlerThread focusHandlerThread;
    /* access modifiers changed from: private */
    public static final Map<String, ActivityAvailableListener> sActivityAvailableListeners;
    private static final Map<String, KeyboardListener> sKeyboardListeners;
    private static final Map<String, OSSystemConditionController.OSSystemConditionObserver> sSystemConditionObservers;
    @SuppressLint({"StaticFieldLeak"})
    private Activity curActivity = null;
    private boolean nextResumeIsFirstActivity = false;

    ActivityLifecycleHandler() {
    }

    static abstract class ActivityAvailableListener {
        ActivityAvailableListener() {
        }

        /* access modifiers changed from: package-private */
        public void available(@NonNull Activity activity) {
        }

        /* access modifiers changed from: package-private */
        public void stopped(@NonNull Activity activity) {
        }

        /* access modifiers changed from: package-private */
        public void lostFocus() {
        }
    }

    static {
        Object obj;
        Map<String, ActivityAvailableListener> map;
        Map<String, OSSystemConditionController.OSSystemConditionObserver> map2;
        Map<String, KeyboardListener> map3;
        FocusHandlerThread focusHandlerThread2;
        new Object();
        SYNC_LOCK = obj;
        new ConcurrentHashMap();
        sActivityAvailableListeners = map;
        new ConcurrentHashMap();
        sSystemConditionObservers = map2;
        new ConcurrentHashMap();
        sKeyboardListeners = map3;
        new FocusHandlerThread();
        focusHandlerThread = focusHandlerThread2;
    }

    /* access modifiers changed from: package-private */
    public void onConfigurationChanged(Configuration configuration, Activity activity) {
        Configuration newConfig = configuration;
        Activity activity2 = activity;
        if (this.curActivity != null && OSUtils.hasConfigChangeFlag(this.curActivity, 128)) {
            logOrientationChange(newConfig.orientation, activity2);
            onOrientationChanged(activity2);
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityCreated(Activity activity) {
    }

    /* access modifiers changed from: package-private */
    public void onActivityStarted(Activity activity) {
    }

    /* access modifiers changed from: package-private */
    public void onActivityResumed(Activity activity) {
        StringBuilder sb;
        Activity activity2 = activity;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("onActivityResumed: ").append(activity2).toString());
        setCurActivity(activity2);
        logCurActivity();
        handleFocus();
    }

    /* access modifiers changed from: package-private */
    public void onActivityPaused(Activity activity) {
        StringBuilder sb;
        Activity activity2 = activity;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("onActivityPaused: ").append(activity2).toString());
        if (activity2 == this.curActivity) {
            this.curActivity = null;
            handleLostFocus();
        }
        logCurActivity();
    }

    /* access modifiers changed from: package-private */
    public void onActivityStopped(Activity activity) {
        StringBuilder sb;
        Activity activity2 = activity;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("onActivityStopped: ").append(activity2).toString());
        if (activity2 == this.curActivity) {
            this.curActivity = null;
            handleLostFocus();
        }
        for (Map.Entry<String, ActivityAvailableListener> value : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value.getValue()).stopped(activity2);
        }
        logCurActivity();
    }

    /* access modifiers changed from: package-private */
    public void onActivityDestroyed(Activity activity) {
        StringBuilder sb;
        Activity activity2 = activity;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("onActivityDestroyed: ").append(activity2).toString());
        sKeyboardListeners.clear();
        if (activity2 == this.curActivity) {
            this.curActivity = null;
            handleLostFocus();
        }
        logCurActivity();
    }

    private void logCurActivity() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        StringBuilder append = sb.append("curActivity is NOW: ");
        if (this.curActivity != null) {
            new StringBuilder();
            str = sb2.append("").append(this.curActivity.getClass().getName()).append(Constants.COMMON_SCHEMA_PREFIX_SEPARATOR).append(this.curActivity).toString();
        } else {
            str = "null";
        }
        OneSignal.Log(log_level, append.append(str).toString());
    }

    private void logOrientationChange(int i, Activity activity) {
        StringBuilder sb;
        StringBuilder sb2;
        int orientation = i;
        Activity activity2 = activity;
        if (orientation == 2) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb2.append("Configuration Orientation Change: LANDSCAPE (").append(orientation).append(") on activity: ").append(activity2).toString());
        } else if (orientation == 1) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level2, sb.append("Configuration Orientation Change: PORTRAIT (").append(orientation).append(") on activity: ").append(activity2).toString());
        }
    }

    private void onOrientationChanged(Activity activity) {
        KeyboardListener keyboardListener;
        Activity activity2 = activity;
        handleLostFocus();
        for (Map.Entry<String, ActivityAvailableListener> value : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value.getValue()).stopped(activity2);
        }
        for (Map.Entry<String, ActivityAvailableListener> value2 : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value2.getValue()).available(this.curActivity);
        }
        ViewTreeObserver treeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry<String, OSSystemConditionController.OSSystemConditionObserver> entry : sSystemConditionObservers.entrySet()) {
            new KeyboardListener(this, entry.getValue(), entry.getKey(), (AnonymousClass1) null);
            KeyboardListener keyboardListener2 = keyboardListener;
            treeObserver.addOnGlobalLayoutListener(keyboardListener2);
            KeyboardListener put = sKeyboardListeners.put(entry.getKey(), keyboardListener2);
        }
        handleFocus();
    }

    /* access modifiers changed from: package-private */
    public void addSystemConditionObserver(String str, OSSystemConditionController.OSSystemConditionObserver oSSystemConditionObserver) {
        KeyboardListener keyboardListener;
        String key = str;
        OSSystemConditionController.OSSystemConditionObserver systemConditionObserver = oSSystemConditionObserver;
        if (this.curActivity != null) {
            ViewTreeObserver treeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
            new KeyboardListener(this, systemConditionObserver, key, (AnonymousClass1) null);
            KeyboardListener keyboardListener2 = keyboardListener;
            treeObserver.addOnGlobalLayoutListener(keyboardListener2);
            KeyboardListener put = sKeyboardListeners.put(key, keyboardListener2);
        }
        OSSystemConditionController.OSSystemConditionObserver put2 = sSystemConditionObservers.put(key, systemConditionObserver);
    }

    public void removeSystemConditionObserver(@NonNull String str, @NonNull KeyboardListener keyboardListener) {
        String key = str;
        KeyboardListener keyboardListener2 = keyboardListener;
        if (this.curActivity != null) {
            ViewTreeObserver treeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
            if (Build.VERSION.SDK_INT < 16) {
                treeObserver.removeGlobalOnLayoutListener(keyboardListener2);
            } else {
                treeObserver.removeOnGlobalLayoutListener(keyboardListener2);
            }
        }
        KeyboardListener remove = sKeyboardListeners.remove(key);
        OSSystemConditionController.OSSystemConditionObserver remove2 = sSystemConditionObservers.remove(key);
    }

    /* access modifiers changed from: package-private */
    public void addActivityAvailableListener(String key, ActivityAvailableListener activityAvailableListener) {
        ActivityAvailableListener activityAvailableListener2 = activityAvailableListener;
        ActivityAvailableListener put = sActivityAvailableListeners.put(key, activityAvailableListener2);
        if (this.curActivity != null) {
            activityAvailableListener2.available(this.curActivity);
        }
    }

    /* access modifiers changed from: package-private */
    public void removeActivityAvailableListener(String key) {
        ActivityAvailableListener remove = sActivityAvailableListeners.remove(key);
    }

    public Activity getCurActivity() {
        return this.curActivity;
    }

    public void setCurActivity(Activity activity) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        this.curActivity = activity;
        for (Map.Entry<String, ActivityAvailableListener> value : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value.getValue()).available(this.curActivity);
        }
        try {
            ViewTreeObserver treeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry<String, OSSystemConditionController.OSSystemConditionObserver> entry : sSystemConditionObservers.entrySet()) {
                new KeyboardListener(this, entry.getValue(), entry.getKey(), (AnonymousClass1) null);
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                treeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener2);
                KeyboardListener put = sKeyboardListeners.put(entry.getKey(), onGlobalLayoutListener2);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void setNextResumeIsFirstActivity(boolean nextResumeIsFirstActivity2) {
        boolean z = nextResumeIsFirstActivity2;
        this.nextResumeIsFirstActivity = z;
    }

    private void handleLostFocus() {
        AppFocusRunnable appFocusRunnable;
        new AppFocusRunnable((AnonymousClass1) null);
        focusHandlerThread.runRunnable(appFocusRunnable);
    }

    private void handleFocus() {
        if (focusHandlerThread.hasBackgrounded() || this.nextResumeIsFirstActivity) {
            setNextResumeIsFirstActivity(false);
            focusHandlerThread.resetBackgroundState();
            OneSignal.onAppFocus();
            return;
        }
        focusHandlerThread.stopScheduledRunnable();
    }

    static class FocusHandlerThread extends HandlerThread {
        private AppFocusRunnable appFocusRunnable;
        private Handler mHandler;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        FocusHandlerThread() {
            super("FocusHandlerThread");
            Handler handler;
            start();
            new Handler(getLooper());
            this.mHandler = handler;
        }

        /* access modifiers changed from: package-private */
        public Looper getHandlerLooper() {
            return this.mHandler.getLooper();
        }

        /* access modifiers changed from: package-private */
        public void resetBackgroundState() {
            if (this.appFocusRunnable != null) {
                boolean access$202 = AppFocusRunnable.access$202(this.appFocusRunnable, false);
            }
        }

        /* access modifiers changed from: package-private */
        public void stopScheduledRunnable() {
            this.mHandler.removeCallbacksAndMessages((Object) null);
        }

        /* access modifiers changed from: package-private */
        public void runRunnable(AppFocusRunnable appFocusRunnable2) {
            AppFocusRunnable runnable = appFocusRunnable2;
            if (this.appFocusRunnable == null || !this.appFocusRunnable.backgrounded || this.appFocusRunnable.completed) {
                this.appFocusRunnable = runnable;
                this.mHandler.removeCallbacksAndMessages((Object) null);
                boolean postDelayed = this.mHandler.postDelayed(runnable, 2000);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean hasBackgrounded() {
            return this.appFocusRunnable != null && this.appFocusRunnable.backgrounded;
        }
    }

    private static class AppFocusRunnable implements Runnable {
        /* access modifiers changed from: private */
        public boolean backgrounded;
        /* access modifiers changed from: private */
        public boolean completed;

        private AppFocusRunnable() {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ AppFocusRunnable(AnonymousClass1 r4) {
            this();
            AnonymousClass1 r1 = r4;
        }

        static /* synthetic */ boolean access$202(AppFocusRunnable x0, boolean x1) {
            boolean z = x1;
            boolean z2 = z;
            x0.backgrounded = z2;
            return z;
        }

        public void run() {
            if (OneSignal.getCurrentActivity() == null) {
                this.backgrounded = true;
                for (Map.Entry value : ActivityLifecycleHandler.sActivityAvailableListeners.entrySet()) {
                    ((ActivityAvailableListener) value.getValue()).lostFocus();
                }
                OneSignal.onAppLostFocus();
                this.completed = true;
            }
        }
    }

    static class KeyboardListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private final String key;
        private final OSSystemConditionController.OSSystemConditionObserver observer;
        private final OSSystemConditionController.OSSystemConditionHandler systemConditionListener;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ KeyboardListener(OSSystemConditionController.OSSystemConditionHandler x0, OSSystemConditionController.OSSystemConditionObserver x1, String x2, AnonymousClass1 r13) {
            this(x0, x1, x2);
            AnonymousClass1 r4 = r13;
        }

        private KeyboardListener(OSSystemConditionController.OSSystemConditionHandler systemConditionListener2, OSSystemConditionController.OSSystemConditionObserver observer2, String key2) {
            this.systemConditionListener = systemConditionListener2;
            this.observer = observer2;
            this.key = key2;
        }

        public void onGlobalLayout() {
            WeakReference weakReference;
            new WeakReference(OneSignal.getCurrentActivity());
            if (!OSViewUtils.isKeyboardUp(weakReference)) {
                this.systemConditionListener.removeSystemConditionObserver(this.key, this);
                this.observer.systemConditionChanged();
            }
        }
    }
}
