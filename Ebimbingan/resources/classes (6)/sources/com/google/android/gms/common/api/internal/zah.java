package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zah extends zad<Boolean> {
    public final ListenerHolder.ListenerKey<?> zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zab = listenerKey;
    }

    @Nullable
    public final Feature[] zaa(zabl<?> zabl) {
        zacc zacc = zabl.zag().get(this.zab);
        if (zacc == null) {
            return null;
        }
        return zacc.zaa.getRequiredFeatures();
    }

    public final boolean zab(zabl<?> zabl) {
        zacc zacc = zabl.zag().get(this.zab);
        return zacc != null && zacc.zaa.zaa();
    }

    public final /* bridge */ /* synthetic */ void zae(@NonNull zaaa zaaa, boolean z) {
    }

    public final void zag(zabl<?> zabl) throws RemoteException {
        zabl<?> zabl2 = zabl;
        zacc remove = zabl2.zag().remove(this.zab);
        if (remove != null) {
            remove.zab.unregisterListener(zabl2.zaf(), this.zaa);
            remove.zaa.clearListener();
            return;
        }
        boolean trySetResult = this.zaa.trySetResult(false);
    }
}
