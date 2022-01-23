package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.C1108zzb;

/* renamed from: com.google.android.gms.common.internal.zzad */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0515zzad extends C1108zzb implements C0516zzae {
    public static C0516zzae zzb(IBinder iBinder) {
        C0516zzae zzae;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C0516zzae) {
            return (C0516zzae) queryLocalInterface;
        }
        new C0514zzac(iBinder2);
        return zzae;
    }
}
