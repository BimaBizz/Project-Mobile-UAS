package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.internal.zzd */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0524zzd extends C0512zzaa {
    @Nullable
    private C0424BaseGmsClient zza;
    private final int zzb;

    public C0524zzd(@NonNull C0424BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @BinderThread
    public final void onPostInitComplete(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Object checkNotNull = C0446Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @BinderThread
    public final void zzb(int i, @Nullable Bundle bundle) {
        Throwable th;
        int i2 = i;
        Bundle bundle2 = bundle;
        new Exception();
        int wtf = Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", th);
    }

    @BinderThread
    public final void zzc(int i, @NonNull IBinder iBinder, @NonNull C0529zzi zzi) {
        C0529zzi zzi2 = zzi;
        C0424BaseGmsClient baseGmsClient = this.zza;
        Object checkNotNull = C0446Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Object checkNotNull2 = C0446Preconditions.checkNotNull(zzi2);
        C0424BaseGmsClient.zzo(baseGmsClient, zzi2);
        onPostInitComplete(i, iBinder, zzi2.zza);
    }
}
