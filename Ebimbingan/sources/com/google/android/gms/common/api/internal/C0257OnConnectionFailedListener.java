package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.OnConnectionFailedListener */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public interface C0257OnConnectionFailedListener {
    @C0452ShowFirstParty
    @C0206KeepForSdk
    void onConnectionFailed(@RecentlyNonNull C0184ConnectionResult connectionResult);
}
