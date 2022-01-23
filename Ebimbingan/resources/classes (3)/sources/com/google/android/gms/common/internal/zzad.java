package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class zzad extends zzb implements zzae {
    public static zzae zzb(IBinder iBinder) {
        zzae zzae;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof zzae) {
            return (zzae) queryLocalInterface;
        }
        new zzac(iBinder2);
        return zzae;
    }
}
