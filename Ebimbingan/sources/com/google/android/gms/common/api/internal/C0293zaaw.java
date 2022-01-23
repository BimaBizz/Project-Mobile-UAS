package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.C0135Storage;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0232ResultCallback;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.common.api.internal.zaaw */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0293zaaw implements C0232ResultCallback<C0236Status> {
    final /* synthetic */ C0266StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ C0222GoogleApiClient zac;
    final /* synthetic */ C0296zaaz zad;

    C0293zaaw(C0296zaaz zaaz, C0266StatusPendingResult statusPendingResult, boolean z, C0222GoogleApiClient googleApiClient) {
        this.zad = zaaz;
        this.zaa = statusPendingResult;
        this.zab = z;
        this.zac = googleApiClient;
    }

    public final /* bridge */ /* synthetic */ void onResult(@NonNull C0231Result result) {
        C0236Status status = (C0236Status) result;
        C0135Storage.getInstance(this.zad.zan).zac();
        if (status.isSuccess() && this.zad.isConnected()) {
            C0296zaaz zaaz = this.zad;
            zaaz.disconnect();
            zaaz.connect();
        }
        this.zaa.setResult(status);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}
