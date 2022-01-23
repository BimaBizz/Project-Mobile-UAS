package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.p001authapi.C0752zzc;
import com.google.android.gms.internal.p001authapi.C0755zzf;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzu */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class C0155zzu extends C0752zzc implements C0152zzr {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0155zzu() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 101:
                zzc((C0122GoogleSignInAccount) C0755zzf.zzc(parcel3, C0122GoogleSignInAccount.CREATOR), (C0236Status) C0755zzf.zzc(parcel3, C0236Status.CREATOR));
                break;
            case 102:
                zze((C0236Status) C0755zzf.zzc(parcel3, C0236Status.CREATOR));
                break;
            case 103:
                zzf((C0236Status) C0755zzf.zzc(parcel3, C0236Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
