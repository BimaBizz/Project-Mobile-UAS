package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p001authapi.zzc;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzs extends zzc implements zzp {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                zzp();
                break;
            case 2:
                zzq();
                break;
            default:
                return false;
        }
        return true;
    }
}
