package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.base.C1092zab;
import com.google.android.gms.internal.base.C1093zac;

/* renamed from: com.google.android.gms.common.api.internal.IStatusCallback */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0250IStatusCallback extends IInterface {
    void onResult(@RecentlyNonNull C0236Status status) throws RemoteException;

    /* renamed from: com.google.android.gms.common.api.internal.IStatusCallback$Stub */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class Stub extends C1092zab implements C0250IStatusCallback {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* access modifiers changed from: protected */
        public final boolean zaa(int i, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, int i2) throws RemoteException {
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            int i3 = i2;
            if (i != 1) {
                return false;
            }
            onResult((C0236Status) C1093zac.zab(parcel3, C0236Status.CREATOR));
            return true;
        }

        @RecentlyNonNull
        public static C0250IStatusCallback asInterface(@RecentlyNonNull IBinder iBinder) {
            C0250IStatusCallback iStatusCallback;
            IBinder iBinder2 = iBinder;
            if (iBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof C0250IStatusCallback) {
                return (C0250IStatusCallback) queryLocalInterface;
            }
            new C0316zabs(iBinder2);
            return iStatusCallback;
        }
    }
}
