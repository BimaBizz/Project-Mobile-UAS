package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zah */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0353zah extends C0349zad<Boolean> {
    public final C0254ListenerHolder.ListenerKey<?> zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0353zah(C0254ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zab = listenerKey;
    }

    @Nullable
    public final C0186Feature[] zaa(C0309zabl<?> zabl) {
        C0327zacc zacc = zabl.zag().get(this.zab);
        if (zacc == null) {
            return null;
        }
        return zacc.zaa.getRequiredFeatures();
    }

    public final boolean zab(C0309zabl<?> zabl) {
        C0327zacc zacc = zabl.zag().get(this.zab);
        return zacc != null && zacc.zaa.zaa();
    }

    public final /* bridge */ /* synthetic */ void zae(@NonNull C0271zaaa zaaa, boolean z) {
    }

    public final void zag(C0309zabl<?> zabl) throws RemoteException {
        C0309zabl<?> zabl2 = zabl;
        C0327zacc remove = zabl2.zag().remove(this.zab);
        if (remove != null) {
            remove.zab.unregisterListener(zabl2.zaf(), this.zaa);
            remove.zaa.clearListener();
            return;
        }
        boolean trySetResult = this.zaa.trySetResult(false);
    }
}
