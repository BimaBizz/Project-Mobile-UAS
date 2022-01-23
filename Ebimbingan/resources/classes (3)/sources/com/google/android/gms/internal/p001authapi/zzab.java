package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.zzf;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* renamed from: com.google.android.gms.internal.auth-api.zzab  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzab extends GmsClient<zzac> {
    private final Bundle zzbm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzab(Context context, Looper looper, zzf zzf, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 223, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzbm = zzf.toBundle();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zzbm;
    }

    public final Feature[] getApiFeatures() {
        return zzay.zzdj;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        IInterface iInterface;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof zzac) {
            return (zzac) iInterface2;
        }
        new zzaf(iBinder3);
        return iInterface;
    }
}
