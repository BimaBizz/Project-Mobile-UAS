package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.common.api.internal.zacs */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0343zacs implements Continuation<Boolean, Void> {
    C0343zacs() {
    }

    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        Throwable th;
        C0236Status status;
        if (((Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        new C0236Status(13, "listener already unregistered");
        new C0212ApiException(status);
        throw th;
    }
}
