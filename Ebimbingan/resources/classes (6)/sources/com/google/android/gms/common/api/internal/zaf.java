package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaf extends zad<Void> {
    public final zacc zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaf(zacc zacc, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zab = zacc;
    }

    @Nullable
    public final Feature[] zaa(zabl<?> zabl) {
        zabl<?> zabl2 = zabl;
        return this.zab.zaa.getRequiredFeatures();
    }

    public final boolean zab(zabl<?> zabl) {
        zabl<?> zabl2 = zabl;
        return this.zab.zaa.zaa();
    }

    public final /* bridge */ /* synthetic */ void zae(@NonNull zaaa zaaa, boolean z) {
    }

    public final void zag(zabl<?> zabl) throws RemoteException {
        zabl<?> zabl2 = zabl;
        this.zab.zaa.registerListener(zabl2.zaf(), this.zaa);
        ListenerHolder.ListenerKey<?> listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            zacc put = zabl2.zag().put(listenerKey, this.zab);
        }
    }
}
