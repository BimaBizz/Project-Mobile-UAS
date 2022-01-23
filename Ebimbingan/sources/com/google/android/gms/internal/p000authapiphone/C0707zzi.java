package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzi  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public abstract class C0707zzi extends C0694zza implements C0704zzf {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0707zzi() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        if (i != 1) {
            return false;
        }
        zza((C0236Status) C0702zzd.zza(parcel3, C0236Status.CREATOR), C0702zzd.zza(parcel3));
        return true;
    }
}
