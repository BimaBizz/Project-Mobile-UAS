package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0433GmsClient;
import com.google.android.gms.common.internal.C0457TelemetryLoggingOptions;
import com.google.android.gms.internal.base.C1094zad;

/* renamed from: com.google.android.gms.common.internal.service.zap */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0481zap extends C0433GmsClient<C0474zai> {
    private final C0457TelemetryLoggingOptions zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0481zap(Context context, Looper looper, C0427ClientSettings clientSettings, C0457TelemetryLoggingOptions telemetryLoggingOptions, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 270, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zaa = telemetryLoggingOptions;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C0474zai zai;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            zai = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            if (queryLocalInterface instanceof C0474zai) {
                zai = (C0474zai) queryLocalInterface;
            } else {
                new C0474zai(iBinder2);
            }
        }
        return zai;
    }

    public final C0186Feature[] getApiFeatures() {
        return C1094zad.zab;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zaa.zaa();
    }

    public final int getMinApkVersion() {
        return 203390000;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
