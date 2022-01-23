package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.internal.auth-api.zzq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0766zzq extends C0433GmsClient<C0773zzx> {
    private final C0031Auth.AuthCredentialsOptions zzar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0766zzq(Context context, Looper looper, C0427ClientSettings clientSettings, C0031Auth.AuthCredentialsOptions authCredentialsOptions, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        C0031Auth.AuthCredentialsOptions authCredentialsOptions2 = authCredentialsOptions;
        C0031Auth.AuthCredentialsOptions.Builder builder = r14;
        C0031Auth.AuthCredentialsOptions.Builder builder2 = new C0031Auth.AuthCredentialsOptions.Builder(authCredentialsOptions2 == null ? C0031Auth.AuthCredentialsOptions.zzk : authCredentialsOptions2);
        this.zzar = builder.zzc(C0751zzba.zzw()).zze();
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
    public final C0031Auth.AuthCredentialsOptions zzf() {
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
        if (queryLocalInterface instanceof C0773zzx) {
            return (C0773zzx) iInterface2;
        }
        new C0772zzw(iBinder3);
        return iInterface;
    }
}
