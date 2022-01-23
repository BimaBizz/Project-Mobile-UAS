package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.zza */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0372zza implements Runnable {
    final /* synthetic */ C0252LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ C0373zzb zzc;

    C0372zza(C0373zzb zzb2, C0252LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzb2;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    public final void run() {
        Bundle bundle;
        if (this.zzc.zzc > 0) {
            C0252LifecycleCallback lifecycleCallback = this.zza;
            if (this.zzc.zzd != null) {
                bundle = this.zzc.zzd.getBundle(this.zzb);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.zzc.zzc >= 2) {
            this.zza.onStart();
        }
        if (this.zzc.zzc >= 3) {
            this.zza.onResume();
        }
        if (this.zzc.zzc >= 4) {
            this.zza.onStop();
        }
        if (this.zzc.zzc >= 5) {
            this.zza.onDestroy();
        }
    }
}
