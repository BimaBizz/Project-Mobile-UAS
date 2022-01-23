package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zacs implements Continuation<Boolean, Void> {
    zacs() {
    }

    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        Throwable th;
        Status status;
        if (((Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        new Status(13, "listener already unregistered");
        new ApiException(status);
        throw th;
    }
}
