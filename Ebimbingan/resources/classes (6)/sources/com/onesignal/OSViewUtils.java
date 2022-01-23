package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import com.onesignal.ActivityLifecycleHandler;
import java.lang.ref.WeakReference;

class OSViewUtils {
    private static final int MARGIN_ERROR_PX_SIZE = dpToPx(24);

    OSViewUtils() {
    }

    static boolean isKeyboardUp(WeakReference<Activity> weakReference) {
        DisplayMetrics displayMetrics;
        Rect rect;
        WeakReference<Activity> activityWeakReference = weakReference;
        new DisplayMetrics();
        DisplayMetrics metrics = displayMetrics;
        new Rect();
        Rect visibleBounds = rect;
        View view = null;
        boolean isOpen = false;
        if (activityWeakReference.get() != null) {
            Window window = ((Activity) activityWeakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(visibleBounds);
            window.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        }
        if (view != null) {
            isOpen = metrics.heightPixels - visibleBounds.bottom > MARGIN_ERROR_PX_SIZE;
        }
        return isOpen;
    }

    static void decorViewReady(@NonNull Activity activity, @NonNull Runnable runnable) {
        StringBuilder sb;
        Runnable runnable2;
        Runnable runnable3 = runnable;
        new StringBuilder();
        final String sb2 = sb.append("decorViewReady:").append(runnable3).toString();
        final Runnable runnable4 = runnable3;
        new Runnable() {
            public void run() {
                ActivityLifecycleHandler.ActivityAvailableListener activityAvailableListener;
                ActivityLifecycleHandler handler = ActivityLifecycleListener.getActivityLifecycleHandler();
                if (handler != null) {
                    final ActivityLifecycleHandler activityLifecycleHandler = handler;
                    new ActivityLifecycleHandler.ActivityAvailableListener(this) {
                        final /* synthetic */ AnonymousClass1 this$0;

                        {
                            this.this$0 = this$0;
                        }

                        /* access modifiers changed from: package-private */
                        public void available(@NonNull Activity activity) {
                            Activity currentActivity = activity;
                            activityLifecycleHandler.removeActivityAvailableListener(sb2);
                            if (OSViewUtils.isActivityFullyReady(currentActivity)) {
                                runnable4.run();
                            } else {
                                OSViewUtils.decorViewReady(currentActivity, runnable4);
                            }
                        }
                    };
                    handler.addActivityAvailableListener(sb2, activityAvailableListener);
                }
            }
        };
        boolean post = activity.getWindow().getDecorView().post(runnable2);
    }

    @NonNull
    private static Rect getWindowVisibleDisplayFrame(@NonNull Activity activity) {
        Rect rect;
        new Rect();
        Rect rect2 = rect;
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        return rect2;
    }

    static int getWindowWidth(@NonNull Activity activity) {
        return getWindowVisibleDisplayFrame(activity).width();
    }

    static int getWindowHeight(@NonNull Activity activity) {
        Activity activity2 = activity;
        if (Build.VERSION.SDK_INT >= 23) {
            return getWindowHeightAPI23Plus(activity2);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return getWindowHeightLollipop(activity2);
        }
        return getDisplaySizeY(activity2);
    }

    @TargetApi(23)
    private static int getWindowHeightAPI23Plus(@NonNull Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets windowInsets = decorView.getRootWindowInsets();
        if (windowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - windowInsets.getStableInsetBottom()) - windowInsets.getStableInsetTop();
    }

    private static int getWindowHeightLollipop(@NonNull Activity activity) {
        Activity activity2 = activity;
        if (activity2.getResources().getConfiguration().orientation == 2) {
            return getWindowVisibleDisplayFrame(activity2).height();
        }
        return getDisplaySizeY(activity2);
    }

    private static int getDisplaySizeY(@NonNull Activity activity) {
        Point point;
        new Point();
        Point point2 = point;
        activity.getWindowManager().getDefaultDisplay().getSize(point2);
        return point2.y;
    }

    static int dpToPx(int dp) {
        return (int) (((float) dp) * Resources.getSystem().getDisplayMetrics().density);
    }

    static boolean isActivityFullyReady(@NonNull Activity activity) {
        Activity activity2 = activity;
        boolean hasToken = activity2.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return hasToken;
        }
        return hasToken && (activity2.getWindow().getDecorView().getRootWindowInsets() != null);
    }
}
