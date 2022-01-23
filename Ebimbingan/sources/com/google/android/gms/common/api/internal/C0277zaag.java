package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.zaag */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0277zaag implements C0298zaba {
    /* access modifiers changed from: private */
    public final C0301zabd zaa;
    private boolean zab = false;

    public C0277zaag(C0301zabd zabd) {
        this.zaa = zabd;
    }

    public final void zaa() {
    }

    public final <A extends C0211Api.AnyClient, R extends C0231Result, T extends C0243BaseImplementation.ApiMethodImpl<R, A>> T zab(T t) {
        T t2 = t;
        C0243BaseImplementation.ApiMethodImpl zac = zac(t2);
        return t2;
    }

    public final <A extends C0211Api.AnyClient, T extends C0243BaseImplementation.ApiMethodImpl<? extends C0231Result, A>> T zac(T t) {
        C0299zabb zabb;
        C0236Status status;
        T t2 = t;
        try {
            this.zaa.zag.zai.zaa(t2);
            C0296zaaz zaaz = this.zaa.zag;
            C0211Api.Client client = zaaz.zac.get(t2.getClientKey());
            Object checkNotNull = C0446Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zaa.zab.containsKey(t2.getClientKey())) {
                t2.run(client);
            } else {
                new C0236Status(17);
                t2.setFailedResult(status);
            }
        } catch (DeadObjectException e) {
            C0301zabd zabd = this.zaa;
            new C0275zaae(this, this);
            zabd.zar(zabb);
        }
        return t2;
    }

    public final void zae() {
        C0299zabb zabb;
        if (this.zab) {
            this.zab = false;
            C0301zabd zabd = this.zaa;
            new C0276zaaf(this, this);
            zabd.zar(zabb);
        }
    }

    public final void zaf(@Nullable Bundle bundle) {
    }

    public final void zag(C0184ConnectionResult connectionResult, C0211Api<?> api, boolean z) {
    }

    public final void zah(int i) {
        this.zaa.zaq((C0184ConnectionResult) null);
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
        Set<C0346zacv> set = this.zaa.zag.zah;
        if (set == null || set.isEmpty()) {
            this.zaa.zaq((C0184ConnectionResult) null);
            return true;
        }
        this.zab = true;
        for (C0346zacv zab2 : set) {
            zab2.zab();
        }
        return false;
    }
}
