package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaag implements zaba {
    /* access modifiers changed from: private */
    public final zabd zaa;
    private boolean zab = false;

    public zaag(zabd zabd) {
        this.zaa = zabd;
    }

    public final void zaa() {
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zab(T t) {
        T t2 = t;
        BaseImplementation.ApiMethodImpl zac = zac(t2);
        return t2;
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zac(T t) {
        zabb zabb;
        Status status;
        T t2 = t;
        try {
            this.zaa.zag.zai.zaa(t2);
            zaaz zaaz = this.zaa.zag;
            Api.Client client = zaaz.zac.get(t2.getClientKey());
            Object checkNotNull = Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zaa.zab.containsKey(t2.getClientKey())) {
                t2.run(client);
            } else {
                new Status(17);
                t2.setFailedResult(status);
            }
        } catch (DeadObjectException e) {
            zabd zabd = this.zaa;
            new zaae(this, this);
            zabd.zar(zabb);
        }
        return t2;
    }

    public final void zae() {
        zabb zabb;
        if (this.zab) {
            this.zab = false;
            zabd zabd = this.zaa;
            new zaaf(this, this);
            zabd.zar(zabb);
        }
    }

    public final void zaf(@Nullable Bundle bundle) {
    }

    public final void zag(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final void zah(int i) {
        this.zaa.zaq((ConnectionResult) null);
        this.zaa.zah.zac(i, this.zab);
    }

    /* access modifiers changed from: package-private */
    public final void zai() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zag.zai.zab();
            boolean zad = zad();
        }
    }

    public final boolean zad() {
        if (this.zab) {
            return false;
        }
        Set<zacv> set = this.zaa.zag.zah;
        if (set == null || set.isEmpty()) {
            this.zaa.zaq((ConnectionResult) null);
            return true;
        }
        this.zab = true;
        for (zacv zab2 : set) {
            zab2.zab();
        }
        return false;
    }
}
