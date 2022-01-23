package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzu  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzu extends zzc implements zzv {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzu() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                zzc((Status) zzf.zzc(parcel3, Status.CREATOR), (Credential) zzf.zzc(parcel3, Credential.CREATOR));
                break;
            case 2:
                zzd((Status) zzf.zzc(parcel3, Status.CREATOR));
                break;
            case 3:
                zzc((Status) zzf.zzc(parcel3, Status.CREATOR), parcel3.readString());
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
