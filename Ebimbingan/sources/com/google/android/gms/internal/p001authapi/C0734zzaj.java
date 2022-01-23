package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0089SavePasswordResult;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzaj  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class C0734zzaj extends C0752zzc implements C0731zzag {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0734zzaj() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        if (i != 1) {
            return false;
        }
        zzc((C0236Status) C0755zzf.zzc(parcel3, C0236Status.CREATOR), (C0089SavePasswordResult) C0755zzf.zzc(parcel3, C0089SavePasswordResult.CREATOR));
        return true;
    }
}
