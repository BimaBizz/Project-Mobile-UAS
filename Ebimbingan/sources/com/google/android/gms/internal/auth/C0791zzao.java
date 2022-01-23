package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.C0173zze;
import com.google.android.gms.auth.account.C0026zzc;
import com.google.android.gms.auth.account.C0027zzd;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.internal.auth.zzao */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0791zzao extends C0433GmsClient<C0027zzd> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0791zzao(Context context, Looper looper, C0427ClientSettings clientSettings, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 120, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    public final C0186Feature[] getApiFeatures() {
        return new C0186Feature[]{C0173zze.zzc};
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return C0026zzc.zza(iBinder);
    }
}
