package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.zaf */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0351zaf extends C0349zad<Void> {
    public final C0327zacc zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0351zaf(C0327zacc zacc, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zab = zacc;
    }

    @Nullable
    public final C0186Feature[] zaa(C0309zabl<?> zabl) {
        C0309zabl<?> zabl2 = zabl;
        return this.zab.zaa.getRequiredFeatures();
    }

    public final boolean zab(C0309zabl<?> zabl) {
        C0309zabl<?> zabl2 = zabl;
        return this.zab.zaa.zaa();
    }

    public final /* bridge */ /* synthetic */ void zae(@NonNull C0271zaaa zaaa, boolean z) {
    }

    public final void zag(C0309zabl<?> zabl) throws RemoteException {
        C0309zabl<?> zabl2 = zabl;
        this.zab.zaa.registerListener(zabl2.zaf(), this.zaa);
        C0254ListenerHolder.ListenerKey<?> listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            C0327zacc put = zabl2.zag().put(listenerKey, this.zab);
        }
    }
}
