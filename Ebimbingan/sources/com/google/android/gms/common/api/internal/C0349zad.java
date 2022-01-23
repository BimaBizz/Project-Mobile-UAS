package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class C0349zad<T> extends C0324zac {
    protected final TaskCompletionSource<T> zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0349zad(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zaa = taskCompletionSource;
    }

    public final void zac(@NonNull C0236Status status) {
        Exception exc;
        TaskCompletionSource<T> taskCompletionSource = this.zaa;
        new C0212ApiException(status);
        boolean trySetException = taskCompletionSource.trySetException(exc);
    }

    public final void zad(@NonNull Exception exc) {
        boolean trySetException = this.zaa.trySetException(exc);
    }

    public void zae(@NonNull C0271zaaa zaaa, boolean z) {
    }

    public final void zaf(C0309zabl<?> zabl) throws DeadObjectException {
        try {
            zag(zabl);
        } catch (DeadObjectException e) {
            DeadObjectException deadObjectException = e;
            zac(C0354zai.zah(deadObjectException));
            throw deadObjectException;
        } catch (RemoteException e2) {
            zac(C0354zai.zah(e2));
        } catch (RuntimeException e3) {
            boolean trySetException = this.zaa.trySetException(e3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zag(C0309zabl<?> zabl) throws RemoteException;
}
