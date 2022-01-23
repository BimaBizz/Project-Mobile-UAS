package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.common.internal.service.zah */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0473zah extends C0433GmsClient<C0477zal> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0473zah(Context context, Looper looper, C0427ClientSettings clientSettings, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 39, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C0477zal zal;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            zal = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            if (queryLocalInterface instanceof C0477zal) {
                zal = (C0477zal) queryLocalInterface;
            } else {
                new C0477zal(iBinder2);
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
