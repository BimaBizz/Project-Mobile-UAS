package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzi extends GmsClient<zzr> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzi(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
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

    public final Feature[] getApiFeatures() {
        Feature[] featureArr = new Feature[2];
        featureArr[0] = zze.zza;
        Feature[] featureArr2 = featureArr;
        featureArr2[1] = zze.zzb;
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
        if (queryLocalInterface instanceof zzr) {
            return (zzr) iInterface2;
        }
        new zzq(iBinder3);
        return iInterface;
    }
}
