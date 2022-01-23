package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* renamed from: com.google.android.gms.internal.auth-api.zzq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzq extends GmsClient<zzx> {
    private final Auth.AuthCredentialsOptions zzar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzq(Context context, Looper looper, ClientSettings clientSettings, Auth.AuthCredentialsOptions authCredentialsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        Auth.AuthCredentialsOptions authCredentialsOptions2 = authCredentialsOptions;
        Auth.AuthCredentialsOptions.Builder builder = r14;
        Auth.AuthCredentialsOptions.Builder builder2 = new Auth.AuthCredentialsOptions.Builder(authCredentialsOptions2 == null ? Auth.AuthCredentialsOptions.zzk : authCredentialsOptions2);
        this.zzar = builder.zzc(zzba.zzw()).zze();
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zzar.toBundle();
    }

    /* access modifiers changed from: package-private */
    public final Auth.AuthCredentialsOptions zzf() {
        return this.zzar;
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        IInterface iInterface;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof zzx) {
            return (zzx) iInterface2;
        }
        new zzw(iBinder3);
        return iInterface;
    }
}
