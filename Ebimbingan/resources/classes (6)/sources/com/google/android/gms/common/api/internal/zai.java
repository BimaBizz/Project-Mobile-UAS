package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class zai {
    public final int zac;

    public zai(int i) {
        this.zac = i;
    }

    static /* synthetic */ Status zah(RemoteException remoteException) {
        StringBuilder sb;
        Status status;
        RemoteException remoteException2 = remoteException;
        new StringBuilder();
        StringBuilder append = sb.append(remoteException2.getClass().getSimpleName());
        StringBuilder append2 = sb.append(": ");
        StringBuilder append3 = sb.append(remoteException2.getLocalizedMessage());
        new Status(19, sb.toString());
        return status;
    }

    public abstract void zac(@NonNull Status status);

    public abstract void zad(@NonNull Exception exc);

    public abstract void zae(@NonNull zaaa zaaa, boolean z);

    public abstract void zaf(zabl<?> zabl) throws DeadObjectException;
}
