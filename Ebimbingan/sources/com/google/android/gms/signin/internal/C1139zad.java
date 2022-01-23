package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.base.C1092zab;
import com.google.android.gms.internal.base.C1093zac;

/* renamed from: com.google.android.gms.signin.internal.zad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C1139zad extends C1092zab implements C1140zae {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1139zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 3:
                C0184ConnectionResult connectionResult = (C0184ConnectionResult) C1093zac.zab(parcel3, C0184ConnectionResult.CREATOR);
                C1136zaa zaa = (C1136zaa) C1093zac.zab(parcel3, C1136zaa.CREATOR);
                break;
            case 4:
                C0236Status status = (C0236Status) C1093zac.zab(parcel3, C0236Status.CREATOR);
                break;
            case 6:
                C0236Status status2 = (C0236Status) C1093zac.zab(parcel3, C0236Status.CREATOR);
                break;
            case 7:
                C0236Status status3 = (C0236Status) C1093zac.zab(parcel3, C0236Status.CREATOR);
                C0122GoogleSignInAccount googleSignInAccount = (C0122GoogleSignInAccount) C1093zac.zab(parcel3, C0122GoogleSignInAccount.CREATOR);
                break;
            case 8:
                zab((C1146zak) C1093zac.zab(parcel3, C1146zak.CREATOR));
                break;
            case 9:
                C1142zag zag = (C1142zag) C1093zac.zab(parcel3, C1142zag.CREATOR);
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
