package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.C0173zze;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;

/* renamed from: com.google.android.gms.internal.auth.zzi */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0992zzi extends C0433GmsClient<C1082zzr> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0992zzi(Context context, Looper looper, C0427ClientSettings clientSettings, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 224, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    public final C0186Feature[] getApiFeatures() {
        C0186Feature[] featureArr = new C0186Feature[2];
        featureArr[0] = C0173zze.zza;
        C0186Feature[] featureArr2 = featureArr;
        featureArr2[1] = C0173zze.zzb;
        return featureArr2;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final void disconnect(String str) {
        String str2;
        String str3;
        String str4 = str;
        String valueOf = String.valueOf(str4);
        String str5 = valueOf;
        if (valueOf.length() != 0) {
            str3 = "GoogleAuthServiceClientImpl disconnected with reason: ".concat(str5);
        } else {
            str3 = str2;
            new String("GoogleAuthServiceClientImpl disconnected with reason: ");
        }
        int w = Log.w("GoogleAuthSvcClientImpl", str3);
        super.disconnect(str4);
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
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof C1082zzr) {
            return (C1082zzr) iInterface2;
        }
        new C1081zzq(iBinder3);
        return iInterface;
    }
}
