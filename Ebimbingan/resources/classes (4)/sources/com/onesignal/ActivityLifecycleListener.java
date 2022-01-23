package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class ActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static ActivityLifecycleHandler activityLifecycleHandler;
    @Nullable
    private static ComponentCallbacks configuration;
    @Nullable
    private static ActivityLifecycleListener instance;

    ActivityLifecycleListener() {
    }

    static void registerActivityLifecycleCallbacks(@NonNull Application application) {
        ComponentCallbacks componentCallbacks;
        ActivityLifecycleHandler activityLifecycleHandler2;
        ActivityLifecycleListener activityLifecycleListener;
        Application application2 = application;
        if (instance == null) {
            new ActivityLifecycleListener();
            instance = activityLifecycleListener;
            application2.registerActivityLifecycleCallbacks(instance);
        }
        if (activityLifecycleHandler == null) {
            new ActivityLifecycleHandler();
            activityLifecycleHandler = activityLifecycleHandler2;
        }
        if (configuration == null) {
            new ComponentCallbacks() {
                public void onConfigurationChanged(Configuration newConfig) {
                    ActivityLifecycleListener.activityLifecycleHandler.onConfigurationChanged(newConfig, ActivityLifecycleListener.activityLifecycleHandler.getCurActivity());
                }

                public void onLowMemory() {
                }
            };
            configuration = componentCallbacks;
            application2.registerComponentCallbacks(configuration);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityCreated(activity2);
        }
    }

    public void onActivityStarted(Activity activity) {
        Activity activity2 = activity;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityStarted(activity2);
        }
    }

    public void onActivityResumed(Activity activity) {
        Activity activity2 = activity;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityResumed(activity2);
        }
    }

    public void onActivityPaused(Activity activity) {
        Activity activity2 = activity;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityPaused(activity2);
        }
    }

    public void onActivityStopped(Activity activity) {
        Activity activity2 = activity;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityStopped(activity2);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = activity;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityDestroyed(activity2);
        }
    }

    @Nullable
    public static ActivityLifecycleHandler getActivityLifecycleHandler() {
        return activityLifecycleHandler;
    }
}
