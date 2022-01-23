package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.internal.p001authapi.C0753zzd;
import com.google.android.gms.internal.p001authapi.C0755zzf;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzw */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0157zzw extends C0753zzd implements C0154zzt {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0157zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zzc(C0152zzr zzr, C0125GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzr);
        C0755zzf.zzc(parcel, (Parcelable) googleSignInOptions);
        zzc(101, parcel);
    }

    public final void zzd(C0152zzr zzr, C0125GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzr);
        C0755zzf.zzc(parcel, (Parcelable) googleSignInOptions);
        zzc(102, parcel);
    }

    public final void zze(C0152zzr zzr, C0125GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzr);
        C0755zzf.zzc(parcel, (Parcelable) googleSignInOptions);
        zzc(103, parcel);
    }
}
