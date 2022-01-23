package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zah extends GmsClient<zal> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zah(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 39, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        zal zal;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            zal = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            if (queryLocalInterface instanceof zal) {
                zal = (zal) queryLocalInterface;
            } else {
                new zal(iBinder2);
            }
        }
        return zal;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.common.service.START";
    }
}
