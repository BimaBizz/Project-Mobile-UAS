package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.internal.IGmsCallbacks */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0439IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, @RecentlyNonNull IBinder iBinder, @RecentlyNonNull Bundle bundle) throws RemoteException;

    void zzb(int i, @RecentlyNonNull Bundle bundle) throws RemoteException;

    void zzc(int i, IBinder iBinder, C0529zzi zzi) throws RemoteException;
}
