package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapi.zzc;
import com.google.android.gms.internal.p001authapi.zzf;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzu extends zzc implements zzr {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzu() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 101:
                zzc((GoogleSignInAccount) zzf.zzc(parcel3, GoogleSignInAccount.CREATOR), (Status) zzf.zzc(parcel3, Status.CREATOR));
                break;
            case 102:
                zze((Status) zzf.zzc(parcel3, Status.CREATOR));
                break;
            case 103:
                zzf((Status) zzf.zzc(parcel3, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
