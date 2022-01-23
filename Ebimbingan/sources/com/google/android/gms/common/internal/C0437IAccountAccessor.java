package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.common.C1108zzb;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.common.internal.IAccountAccessor */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0437IAccountAccessor extends IInterface {
    @RecentlyNonNull
    Account zzb() throws RemoteException;

    /* renamed from: com.google.android.gms.common.internal.IAccountAccessor$Stub */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class Stub extends C1108zzb implements C0437IAccountAccessor {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        /* access modifiers changed from: protected */
        public final boolean zza(int i, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, int i2) throws RemoteException {
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            int i3 = i2;
            if (i != 2) {
                return false;
            }
            Account zzb = zzb();
            parcel4.writeNoException();
            C1109zzc.zze(parcel4, zzb);
            return true;
        }

        @RecentlyNonNull
        public static C0437IAccountAccessor asInterface(@RecentlyNonNull IBinder iBinder) {
            C0437IAccountAccessor iAccountAccessor;
            IBinder iBinder2 = iBinder;
            if (iBinder2 == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C0437IAccountAccessor) {
                return (C0437IAccountAccessor) queryLocalInterface;
            }
            new C0541zzu(iBinder2);
            return iAccountAccessor;
        }
    }
}
