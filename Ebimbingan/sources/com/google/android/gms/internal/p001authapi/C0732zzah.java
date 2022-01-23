package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzah  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class C0732zzah extends C0752zzc implements C0729zzae {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0732zzah() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        if (i != 1) {
            return false;
        }
        zzc((C0236Status) C0755zzf.zzc(parcel3, C0236Status.CREATOR), (PendingIntent) C0755zzf.zzc(parcel3, PendingIntent.CREATOR));
        return true;
    }
}
