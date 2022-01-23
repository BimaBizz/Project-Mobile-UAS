package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zai {
    protected final A zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zae(int i, A a) {
        super(i);
        this.zaa = (BaseImplementation.ApiMethodImpl) Preconditions.checkNotNull(a, "Null methods are not runnable.");
    }

    public final void zac(@NonNull Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e) {
            int w = Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void zad(@NonNull Exception exc) {
        Status status;
        StringBuilder sb;
        Exception exc2 = exc;
        String simpleName = exc2.getClass().getSimpleName();
        String localizedMessage = exc2.getLocalizedMessage();
        new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        StringBuilder append = sb.append(simpleName);
        StringBuilder append2 = sb.append(": ");
        StringBuilder append3 = sb.append(localizedMessage);
        new Status(10, sb.toString());
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e) {
            int w = Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void zae(@NonNull zaaa zaaa, boolean z) {
        zaaa.zaa(this.zaa, z);
    }

    public final void zaf(zabl<?> zabl) throws DeadObjectException {
        try {
            this.zaa.run(zabl.zaf());
        } catch (RuntimeException e) {
            zad(e);
        }
    }
}
