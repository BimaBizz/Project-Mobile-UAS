package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0083BeginSignInRequest;
import com.google.android.gms.auth.api.identity.C0086GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api.zzal  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0736zzal extends C0753zzd implements C0733zzai {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0736zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zzc(C0725zzaa zzaa, C0083BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzaa);
        C0755zzf.zzc(parcel, (Parcelable) beginSignInRequest);
        zzc(1, parcel);
    }

    public final void zzc(C0250IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) iStatusCallback);
        parcel.writeString(str);
        zzc(2, parcel);
    }

    public final void zzc(C0729zzae zzae, C0086GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        C0755zzf.zzc(zzc, (IInterface) zzae);
        C0755zzf.zzc(parcel, (Parcelable) getSignInIntentRequest);
        zzc(3, parcel);
    }
}
