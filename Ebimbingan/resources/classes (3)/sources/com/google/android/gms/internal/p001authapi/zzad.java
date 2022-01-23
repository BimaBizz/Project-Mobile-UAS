package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzad  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzad extends zzc implements zzaa {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzad() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        if (i != 1) {
            return false;
        }
        zzc((Status) zzf.zzc(parcel3, Status.CREATOR), (BeginSignInResult) zzf.zzc(parcel3, BeginSignInResult.CREATOR));
        return true;
    }
}
