package com.google.firebase.auth.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_auth.zze;

public final class zzdo extends GmsClient<zzdz> implements zzdp {
    private static Logger zzjt;
    private final Context zzml;
    private final zzee zzos;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzdo(android.content.Context r15, android.os.Looper r16, com.google.android.gms.common.internal.ClientSettings r17, com.google.firebase.auth.api.internal.zzee r18, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r19, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r20) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = 112(0x70, float:1.57E-43)
            r11 = r3
            r12 = r5
            r13 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r7 = r0
            r8 = r1
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            android.content.Context r8 = (android.content.Context) r8
            r7.zzml = r8
            r7 = r0
            r8 = r4
            r7.zzos = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzdo.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.ClientSettings, com.google.firebase.auth.api.internal.zzee, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener):void");
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServicePackage() {
        String property = zzfe.getProperty("firebear.preference");
        String str = property;
        if (TextUtils.isEmpty(property)) {
            str = "default";
        }
        String str2 = str;
        boolean z = true;
        switch (str2.hashCode()) {
            case 103145323:
                if (str2.equals("local")) {
                    z = false;
                    break;
                }
                break;
            case 1544803905:
                if (str2.equals("default")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
                break;
            default:
                str = "default";
                break;
        }
        String str3 = str;
        boolean z2 = true;
        switch (str3.hashCode()) {
            case 103145323:
                if (str3.equals("local")) {
                    z2 = false;
                    break;
                }
                break;
        }
        switch (z2) {
            case false:
                zzjt.i("Loading fallback module override.", new Object[0]);
                return this.zzml.getPackageName();
            default:
                zzjt.i("Loading module via FirebaseOptions.", new Object[0]);
                if (this.zzos.zzmc) {
                    zzjt.i("Preparing to create service connection to fallback implementation", new Object[0]);
                    return this.zzml.getPackageName();
                }
                zzjt.i("Preparing to create service connection to gms implementation", new Object[0]);
                return "com.google.android.gms";
        }
    }

    public final boolean requiresGooglePlayServices() {
        return DynamiteModule.getLocalVersion(this.zzml, "com.google.firebase.auth") == 0;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle;
        Bundle getServiceRequestExtraArgs = zzdo.super.getGetServiceRequestExtraArgs();
        Bundle bundle2 = getServiceRequestExtraArgs;
        if (getServiceRequestExtraArgs == null) {
            new Bundle();
            bundle2 = bundle;
        }
        if (this.zzos != null) {
            bundle2.putString("com.google.firebase.auth.API_KEY", this.zzos.getApiKey());
        }
        bundle2.putString("com.google.firebase.auth.LIBRARY_VERSION", zzeg.zzek());
        return bundle2;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final Feature[] getApiFeatures() {
        return zze.zzh;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        IInterface iInterface;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        IInterface iInterface2 = queryLocalInterface;
        if (queryLocalInterface instanceof zzdz) {
            return (zzdz) iInterface2;
        }
        new zzea(iBinder3);
        return iInterface;
    }

    @KeepForSdk
    public final /* synthetic */ zzdz zzeb() throws DeadObjectException {
        return (zzdz) zzdo.super.getService();
    }

    static {
        Logger logger;
        Logger logger2 = logger;
        new Logger("FirebaseAuth", new String[]{"FirebaseAuth:"});
        zzjt = logger2;
    }
}
