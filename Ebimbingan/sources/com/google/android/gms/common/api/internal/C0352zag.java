package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zag */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0352zag<ResultT> extends C0324zac {
    private final C0267TaskApiCall<C0211Api.AnyClient, ResultT> zaa;
    private final TaskCompletionSource<ResultT> zab;
    private final C0265StatusExceptionMapper zad;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0352zag(int r8, com.google.android.gms.common.api.internal.C0267TaskApiCall<com.google.android.gms.common.api.C0211Api.AnyClient, ResultT> r9, com.google.android.gms.tasks.TaskCompletionSource<ResultT> r10, com.google.android.gms.common.api.internal.C0265StatusExceptionMapper r11) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r0
            r6 = r1
            r5.<init>(r6)
            r5 = r0
            r6 = r3
            r5.zab = r6
            r5 = r0
            r6 = r2
            r5.zaa = r6
            r5 = r0
            r6 = r4
            r5.zad = r6
            r5 = r1
            r6 = 2
            if (r5 != r6) goto L_0x002d
            r5 = r2
            boolean r5 = r5.shouldAutoResolveMissingFeatures()
            if (r5 == 0) goto L_0x002d
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r0 = r5
            r5 = r0
            java.lang.String r6 = "Best-effort write calls cannot pass methods that should auto-resolve missing features."
            r5.<init>(r6)
            r5 = r0
            throw r5
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0352zag.<init>(int, com.google.android.gms.common.api.internal.TaskApiCall, com.google.android.gms.tasks.TaskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @Nullable
    public final C0186Feature[] zaa(C0309zabl<?> zabl) {
        C0309zabl<?> zabl2 = zabl;
        return this.zaa.zaa();
    }

    public final boolean zab(C0309zabl<?> zabl) {
        C0309zabl<?> zabl2 = zabl;
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    public final void zac(@NonNull C0236Status status) {
        boolean trySetException = this.zab.trySetException(this.zad.getException(status));
    }

    public final void zad(@NonNull Exception exc) {
        boolean trySetException = this.zab.trySetException(exc);
    }

    public final void zae(@NonNull C0271zaaa zaaa, boolean z) {
        zaaa.zab(this.zab, z);
    }

    public final void zaf(C0309zabl<?> zabl) throws DeadObjectException {
        try {
            this.zaa.doExecute(zabl.zaf(), this.zab);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zac(C0354zai.zah(e2));
        } catch (RuntimeException e3) {
            boolean trySetException = this.zab.trySetException(e3);
        }
    }
}
