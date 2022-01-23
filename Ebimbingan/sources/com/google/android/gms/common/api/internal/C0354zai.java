package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.common.api.internal.zai */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0354zai {
    public final int zac;

    public C0354zai(int i) {
        this.zac = i;
    }

    static /* synthetic */ C0236Status zah(RemoteException remoteException) {
        StringBuilder sb;
        C0236Status status;
        RemoteException remoteException2 = remoteException;
        new StringBuilder();
        StringBuilder append = sb.append(remoteException2.getClass().getSimpleName());
        StringBuilder append2 = sb.append(": ");
        StringBuilder append3 = sb.append(remoteException2.getLocalizedMessage());
        new C0236Status(19, sb.toString());
        return status;
    }

    public abstract void zac(@NonNull C0236Status status);

    public abstract void zad(@NonNull Exception exc);

    public abstract void zae(@NonNull C0271zaaa zaaa, boolean z);

    public abstract void zaf(C0309zabl<?> zabl) throws DeadObjectException;
}
