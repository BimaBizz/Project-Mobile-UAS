package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class zad extends zab implements zae {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) zac.zab(parcel3, ConnectionResult.CREATOR);
                zaa zaa = (zaa) zac.zab(parcel3, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) zac.zab(parcel3, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) zac.zab(parcel3, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) zac.zab(parcel3, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zac.zab(parcel3, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                zab((zak) zac.zab(parcel3, zak.CREATOR));
                break;
            case ConnectionResult.SERVICE_INVALID:
                zag zag = (zag) zac.zab(parcel3, zag.CREATOR);
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
