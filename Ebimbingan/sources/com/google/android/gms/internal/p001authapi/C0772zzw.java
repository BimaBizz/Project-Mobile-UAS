package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C0064CredentialRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zzw  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0772zzw extends C0753zzd implements C0773zzx {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0772zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zzc(C0771zzv zzv, C0064CredentialRequest credentialRequest) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzv);
        C0755zzf.zzc(parcel, (Parcelable) credentialRequest);
        zzc(1, parcel);
    }

    public final void zzc(C0771zzv zzv, C0775zzz zzz) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzv);
        C0755zzf.zzc(parcel, (Parcelable) zzz);
        zzc(2, parcel);
    }

    public final void zzc(C0771zzv zzv, C0769zzt zzt) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzv);
        C0755zzf.zzc(parcel, (Parcelable) zzt);
        zzc(3, parcel);
    }

    public final void zzc(C0771zzv zzv) throws RemoteException {
        Parcel zzc = zzc();
        C0755zzf.zzc(zzc, (IInterface) zzv);
        zzc(4, zzc);
    }
}
