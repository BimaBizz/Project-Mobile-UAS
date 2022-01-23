package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api.zzal  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzal extends zzd implements zzai {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zzc(zzaa zzaa, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        zzf.zzc(zzc, (IInterface) zzaa);
        zzf.zzc(parcel, (Parcelable) beginSignInRequest);
        zzc(1, parcel);
    }

    public final void zzc(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        zzf.zzc(zzc, (IInterface) iStatusCallback);
        parcel.writeString(str);
        zzc(2, parcel);
    }

    public final void zzc(zzae zzae, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel zzc = zzc();
        Parcel parcel = zzc;
        zzf.zzc(zzc, (IInterface) zzae);
        zzf.zzc(parcel, (Parcelable) getSignInIntentRequest);
        zzc(3, parcel);
    }
}
