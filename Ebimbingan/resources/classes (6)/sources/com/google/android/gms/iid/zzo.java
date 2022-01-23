package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

final class zzo {
    private final KeyPair zzcb;
    /* access modifiers changed from: private */
    public final long zzcc;

    @VisibleForTesting
    zzo(KeyPair keyPair, long j) {
        this.zzcb = keyPair;
        this.zzcc = j;
    }

    /* access modifiers changed from: package-private */
    public final KeyPair getKeyPair() {
        return this.zzcb;
    }

    /* access modifiers changed from: package-private */
    public final long getCreationTime() {
        return this.zzcc;
    }

    public final boolean equals(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof zzo)) {
            return false;
        }
        zzo zzo = (zzo) obj2;
        if (this.zzcc != zzo.zzcc || !this.zzcb.getPublic().equals(zzo.zzcb.getPublic()) || !this.zzcb.getPrivate().equals(zzo.zzcb.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.zzcb.getPublic();
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzcb.getPrivate();
        Object[] objArr3 = objArr2;
        objArr3[2] = Long.valueOf(this.zzcc);
        return Objects.hashCode(objArr3);
    }

    /* access modifiers changed from: private */
    public final String zzq() {
        return Base64.encodeToString(this.zzcb.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    public final String zzr() {
        return Base64.encodeToString(this.zzcb.getPrivate().getEncoded(), 11);
    }
}
