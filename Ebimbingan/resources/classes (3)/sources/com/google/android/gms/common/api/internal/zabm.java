package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabm {
    /* access modifiers changed from: private */
    public final ApiKey<?> zaa;
    /* access modifiers changed from: private */
    public final Feature zab;

    /* synthetic */ zabm(ApiKey apiKey, Feature feature, zabg zabg) {
        zabg zabg2 = zabg;
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj2 == null || !(obj2 instanceof zabm)) {
            return false;
        }
        zabm zabm = (zabm) obj2;
        return Objects.equal(this.zaa, zabm.zaa) && Objects.equal(this.zab, zabm.zab);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa, this.zab);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
    }
}
