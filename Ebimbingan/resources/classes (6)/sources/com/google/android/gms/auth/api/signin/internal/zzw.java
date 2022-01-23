package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p001authapi.zzd;
import com.google.android.gms.internal.p001authapi.zzf;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzw extends zzd implements zzt {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zzc(zzr zzr, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        zzf.zzc(zzc, (IInterface) zzr);
        zzf.zzc(parcel, (Parcelable) googleSignInOptions);
        zzc(101, parcel);
    }

    public final void zzd(zzr zzr, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        zzf.zzc(zzc, (IInterface) zzr);
        zzf.zzc(parcel, (Parcelable) googleSignInOptions);
        zzc(102, parcel);
    }

    public final void zze(zzr zzr, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        zzf.zzc(zzc, (IInterface) zzr);
        zzf.zzc(parcel, (Parcelable) googleSignInOptions);
        zzc(103, parcel);
    }
}
