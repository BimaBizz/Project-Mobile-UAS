package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface ICancelToken extends IInterface {
    void cancel() throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class Stub extends zzb implements ICancelToken {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        /* access modifiers changed from: protected */
        public final boolean zza(int i, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, int i2) throws RemoteException {
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            int i3 = i2;
            if (i != 2) {
                return false;
            }
            cancel();
            return true;
        }

        @RecentlyNonNull
        public static ICancelToken asInterface(@RecentlyNonNull IBinder iBinder) {
            ICancelToken iCancelToken;
            IBinder iBinder2 = iBinder;
            if (iBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof ICancelToken) {
                return (ICancelToken) queryLocalInterface;
            }
            new zzv(iBinder2);
            return iCancelToken;
        }
    }
}
