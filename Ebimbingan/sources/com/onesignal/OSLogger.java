package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface OSLogger {
    void debug(@NonNull String str);

    void error(@NonNull String str, @Nullable Throwable th);

    void verbose(@NonNull String str);

    void warning(@NonNull String str);
}
