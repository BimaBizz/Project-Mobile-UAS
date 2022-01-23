package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzbg extends GmsClient<zzbl> {
    private final Bundle zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbg(Context context, Looper looper, ClientSettings clientSettings, AuthProxyOptions authProxyOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        Bundle zza;
        Bundle bundle;
        if (authProxyOptions == null) {
            zza = bundle;
            new Bundle();
        } else {
            zza = AuthProxyOptions.zza();
        }
        this.zzd = zza;
    }

    public final boolean requiresSignIn() {
        ClientSettings clientSettings = getClientSettings();
        ClientSettings clientSettings2 = clientSettings;
        if (TextUtils.isEmpty(clientSettings.getAccountName()) || clientSettings2.getApplicableScopes(AuthProxy.API).isEmpty()) {
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
        if (queryLocalInterface instanceof zzbl) {
            return (zzbl) iInterface2;
        }
        new zzbk(iBinder3);
        return iInterface;
    }
}
