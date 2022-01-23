package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.C0194GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.C0195GooglePlayServicesRepairableException;
import com.google.android.gms.security.C1132ProviderInstaller;

/* renamed from: com.google.android.gms.security.zza */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C1133zza extends AsyncTask<Void, Void, Integer> {
    final /* synthetic */ Context zza;
    final /* synthetic */ C1132ProviderInstaller.ProviderInstallListener zzb;

    C1133zza(Context context, C1132ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.zza = context;
        this.zzb = providerInstallListener;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Integer valueOf;
        Void[] voidArr = (Void[]) objArr;
        try {
            C1132ProviderInstaller.installIfNeeded(this.zza);
            valueOf = 0;
        } catch (C0195GooglePlayServicesRepairableException e) {
            valueOf = Integer.valueOf(e.getConnectionStatusCode());
        } catch (C0194GooglePlayServicesNotAvailableException e2) {
            valueOf = Integer.valueOf(e2.errorCode);
        }
        return valueOf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.zzb.onProviderInstalled();
            return;
        }
        this.zzb.onProviderInstallFailed(num.intValue(), C1132ProviderInstaller.zza.getErrorResolutionIntent(this.zza, num.intValue(), "pi"));
    }
}
