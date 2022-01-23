package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.api.internal.C0243BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.zae */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0350zae<A extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, C0211Api.AnyClient>> extends C0354zai {
    protected final A zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0350zae(int i, A a) {
        super(i);
        this.zaa = (C0243BaseImplementation.ApiMethodImpl) C0446Preconditions.checkNotNull(a, "Null methods are not runnable.");
    }

    public final void zac(@NonNull C0236Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e) {
            int w = Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void zad(@NonNull Exception exc) {
        C0236Status status;
        StringBuilder sb;
        Exception exc2 = exc;
        String simpleName = exc2.getClass().getSimpleName();
        String localizedMessage = exc2.getLocalizedMessage();
        new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        StringBuilder append = sb.append(simpleName);
        StringBuilder append2 = sb.append(": ");
        StringBuilder append3 = sb.append(localizedMessage);
        new C0236Status(10, sb.toString());
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException e) {
            int w = Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void zae(@NonNull C0271zaaa zaaa, boolean z) {
        zaaa.zaa(this.zaa, z);
    }

    public final void zaf(C0309zabl<?> zabl) throws DeadObjectException {
        try {
            this.zaa.run(zabl.zaf());
        } catch (RuntimeException e) {
            zad(e);
        }
    }
}
