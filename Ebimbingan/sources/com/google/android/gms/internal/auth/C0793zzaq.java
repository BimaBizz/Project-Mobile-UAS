package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.accounttransfer.C0052zzm;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.internal.auth.zzaq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0793zzaq extends C0433GmsClient<C0800zzax> {
    private final Bundle zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0793zzaq(Context context, Looper looper, C0427ClientSettings clientSettings, C0052zzm zzm, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 128, clientSettings, connectionCallbacks, onConnectionFailedListener);
        Bundle zza;
        Bundle bundle;
        if (zzm == null) {
            zza = bundle;
            new Bundle();
        } else {
            zza = C0052zzm.zza();
        }
        this.zzd = zza;
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zzd;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        IInterface iInterface;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof C0800zzax) {
            return (C0800zzax) iInterface2;
        }
        new C0799zzaw(iBinder3);
        return iInterface;
    }
}
