package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzx  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0722zzx extends C0433GmsClient<C0706zzh> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0722zzx(Context context, Looper looper, C0427ClientSettings clientSettings, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 126, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final C0186Feature[] getApiFeatures() {
        return C0698zzad.zze;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        IInterface iInterface;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof C0706zzh) {
            return (C0706zzh) iInterface2;
        }
        new C0709zzk(iBinder3);
        return iInterface;
    }
}
