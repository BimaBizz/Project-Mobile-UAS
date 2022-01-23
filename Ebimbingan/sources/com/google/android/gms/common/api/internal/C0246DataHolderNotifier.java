package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.data.C0400DataHolder;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.DataHolderNotifier */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0246DataHolderNotifier<L> implements C0254ListenerHolder.Notifier<L> {
    private final C0400DataHolder zaa;

    @C0206KeepForSdk
    protected C0246DataHolderNotifier(@RecentlyNonNull C0400DataHolder dataHolder) {
        this.zaa = dataHolder;
    }

    @C0206KeepForSdk
    public final void notifyListener(@RecentlyNonNull L l) {
        notifyListener(l, this.zaa);
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public abstract void notifyListener(@RecentlyNonNull L l, @RecentlyNonNull C0400DataHolder dataHolder);

    @C0206KeepForSdk
    public void onNotifyListenerFailed() {
        C0400DataHolder dataHolder = this.zaa;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
