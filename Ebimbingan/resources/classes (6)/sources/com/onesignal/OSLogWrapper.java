package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;

class OSLogWrapper implements OSLogger {
    OSLogWrapper() {
    }

    public void verbose(@NonNull String message) {
        OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, message);
    }

    public void debug(@NonNull String message) {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, message);
    }

    public void warning(@NonNull String message) {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, message);
    }

    public void error(@NonNull String message, @Nullable Throwable throwable) {
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, message, throwable);
    }
}
