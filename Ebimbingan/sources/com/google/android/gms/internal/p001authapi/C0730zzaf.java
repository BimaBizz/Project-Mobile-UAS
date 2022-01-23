package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0088SavePasswordRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zzaf  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0730zzaf extends C0753zzd implements C0727zzac {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0730zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zzc(C0731zzag zzag, C0088SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzag);
        C0755zzf.zzc(parcel, (Parcelable) savePasswordRequest);
        zzc(2, parcel);
    }
}
