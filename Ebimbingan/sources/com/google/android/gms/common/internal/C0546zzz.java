package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C1107zza;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.common.internal.zzz */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0546zzz extends C1107zza implements C0439IGmsCallbacks {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0546zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        C1109zzc.zzd(zza, bundle);
        zzD(1, zza);
    }

    public final void zzb(int i, Bundle bundle) throws RemoteException {
        int i2 = i;
        Bundle bundle2 = bundle;
        throw null;
    }

    public final void zzc(int i, IBinder iBinder, C0529zzi zzi) throws RemoteException {
        int i2 = i;
        IBinder iBinder2 = iBinder;
        C0529zzi zzi2 = zzi;
        throw null;
    }
}
