package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.ConnectionCallbacks */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0245ConnectionCallbacks {
    @C0452ShowFirstParty
    @C0206KeepForSdk
    void onConnected(@Nullable Bundle bundle);

    @C0452ShowFirstParty
    @C0206KeepForSdk
    void onConnectionSuspended(int i);
}
