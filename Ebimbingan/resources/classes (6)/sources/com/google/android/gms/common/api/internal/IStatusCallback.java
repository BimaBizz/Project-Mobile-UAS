package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface IStatusCallback extends IInterface {
    void onResult(@RecentlyNonNull Status status) throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class Stub extends zab implements IStatusCallback {
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
            onResult((Status) zac.zab(parcel3, Status.CREATOR));
            return true;
        }

        @RecentlyNonNull
        public static IStatusCallback asInterface(@RecentlyNonNull IBinder iBinder) {
            IStatusCallback iStatusCallback;
            IBinder iBinder2 = iBinder;
            if (iBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof IStatusCallback) {
                return (IStatusCallback) queryLocalInterface;
            }
            new zabs(iBinder2);
            return iStatusCallback;
        }
    }
}
