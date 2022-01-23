package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzd extends zzaa {
    @Nullable
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @BinderThread
    public final void onPostInitComplete(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Object checkNotNull = Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
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
    public final void zzc(int i, @NonNull IBinder iBinder, @NonNull zzi zzi) {
        zzi zzi2 = zzi;
        BaseGmsClient baseGmsClient = this.zza;
        Object checkNotNull = Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Object checkNotNull2 = Preconditions.checkNotNull(zzi2);
        BaseGmsClient.zzo(baseGmsClient, zzi2);
        onPostInitComplete(i, iBinder, zzi2.zza);
    }
}
