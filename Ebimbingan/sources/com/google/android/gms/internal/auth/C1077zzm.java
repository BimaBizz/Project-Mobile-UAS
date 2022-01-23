package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.C0013AccountChangeEventsResponse;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzm */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C1077zzm extends C0776zza implements C1078zzn {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1077zzm() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        if (i != 2) {
            return false;
        }
        zza((C0236Status) C0857zzd.zza(parcel3, C0236Status.CREATOR), (C0013AccountChangeEventsResponse) C0857zzd.zza(parcel3, C0013AccountChangeEventsResponse.CREATOR));
        return true;
    }
}
