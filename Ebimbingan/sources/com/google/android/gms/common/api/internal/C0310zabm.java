package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.internal.C0444Objects;

/* renamed from: com.google.android.gms.common.api.internal.zabm */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0310zabm {
    /* access modifiers changed from: private */
    public final C0241ApiKey<?> zaa;
    /* access modifiers changed from: private */
    public final C0186Feature zab;

    /* synthetic */ C0310zabm(C0241ApiKey apiKey, C0186Feature feature, C0304zabg zabg) {
        C0304zabg zabg2 = zabg;
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj2 == null || !(obj2 instanceof C0310zabm)) {
            return false;
        }
        C0310zabm zabm = (C0310zabm) obj2;
        return C0444Objects.equal(this.zaa, zabm.zaa) && C0444Objects.equal(this.zab, zabm.zab);
    }

    public final int hashCode() {
        return C0444Objects.hashCode(this.zaa, this.zab);
    }

    public final String toString() {
        return C0444Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
    }
}
