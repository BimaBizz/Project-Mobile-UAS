package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C0032AuthProxy;
import com.google.android.gms.auth.api.C0033AuthProxyOptions;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.internal.auth.zzbg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0810zzbg extends C0433GmsClient<C0815zzbl> {
    private final Bundle zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0810zzbg(Context context, Looper looper, C0427ClientSettings clientSettings, C0033AuthProxyOptions authProxyOptions, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        Bundle zza;
        Bundle bundle;
        if (authProxyOptions == null) {
            zza = bundle;
            new Bundle();
        } else {
            zza = C0033AuthProxyOptions.zza();
        }
        this.zzd = zza;
    }

    public final boolean requiresSignIn() {
        C0427ClientSettings clientSettings = getClientSettings();
        C0427ClientSettings clientSettings2 = clientSettings;
        if (TextUtils.isEmpty(clientSettings.getAccountName()) || clientSettings2.getApplicableScopes(C0032AuthProxy.API).isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
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
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof C0815zzbl) {
            return (C0815zzbl) iInterface2;
        }
        new C0814zzbk(iBinder3);
        return iInterface;
    }
}
