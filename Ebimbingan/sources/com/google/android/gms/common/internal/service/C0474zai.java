package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C0454TelemetryData;
import com.google.android.gms.internal.base.C1091zaa;
import com.google.android.gms.internal.base.C1093zac;

/* renamed from: com.google.android.gms.common.internal.service.zai */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0474zai extends C1091zaa implements IInterface {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0474zai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(C0454TelemetryData telemetryData) throws RemoteException {
        Parcel zaa = zaa();
        C1093zac.zac(zaa, telemetryData);
        zad(1, zaa);
    }
}
