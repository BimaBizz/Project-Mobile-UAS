package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class zad<T> extends zac {
    protected final TaskCompletionSource<T> zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zad(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zaa = taskCompletionSource;
    }

    public final void zac(@NonNull Status status) {
        Exception exc;
        TaskCompletionSource<T> taskCompletionSource = this.zaa;
        new ApiException(status);
        boolean trySetException = taskCompletionSource.trySetException(exc);
    }

    public final void zad(@NonNull Exception exc) {
        boolean trySetException = this.zaa.trySetException(exc);
    }

    public void zae(@NonNull zaaa zaaa, boolean z) {
    }

    public final void zaf(zabl<?> zabl) throws DeadObjectException {
        try {
            zag(zabl);
        } catch (DeadObjectException e) {
            DeadObjectException deadObjectException = e;
            zac(zai.zah(deadObjectException));
            throw deadObjectException;
        } catch (RemoteException e2) {
            zac(zai.zah(e2));
        } catch (RuntimeException e3) {
            boolean trySetException = this.zaa.trySetException(e3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zag(zabl<?> zabl) throws RemoteException;
}
