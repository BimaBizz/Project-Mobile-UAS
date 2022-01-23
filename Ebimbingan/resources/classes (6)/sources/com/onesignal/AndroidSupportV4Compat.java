package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;

class AndroidSupportV4Compat {

    interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    AndroidSupportV4Compat() {
    }

    static class ContextCompat {
        ContextCompat() {
        }

        static int checkSelfPermission(@NonNull Context context, @NonNull String permission) {
            try {
                return context.checkPermission(permission, Process.myPid(), Process.myUid());
            } catch (Throwable th) {
                Throwable th2 = th;
                int e = Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
                return -1;
            }
        }

        static int getColor(Context context, int i) {
            Context context2 = context;
            int id = i;
            if (Build.VERSION.SDK_INT > 22) {
                return context2.getColor(id);
            }
            return context2.getResources().getColor(id);
        }
    }

    static class ActivityCompat {
        ActivityCompat() {
        }

        static void requestPermissions(@NonNull Activity activity, @NonNull String[] permissions, int requestCode) {
            ActivityCompatApi23.requestPermissions(activity, permissions, requestCode);
        }

        static boolean shouldShowRequestPermissionRationale(Activity activity, String permission) {
            return ActivityCompatApi23.shouldShowRequestPermissionRationale(activity, permission);
        }
    }

    @TargetApi(23)
    static class ActivityCompatApi23 {
        ActivityCompatApi23() {
        }

        static void requestPermissions(Activity activity, String[] strArr, int i) {
            Activity activity2 = activity;
            String[] permissions = strArr;
            int requestCode = i;
            if (activity2 instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity2).validateRequestPermissionsRequestCode(requestCode);
            }
            activity2.requestPermissions(permissions, requestCode);
        }

        static boolean shouldShowRequestPermissionRationale(Activity activity, String permission) {
            return androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
        }
    }
}
