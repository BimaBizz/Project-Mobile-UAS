package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa = Objects.hashCode(this.zab, this.zac, this.zad);
    private final Api<O> zab;
    @Nullable
    private final O zac;
    @Nullable
    private final String zad;

    private ApiKey(Api<O> api, @Nullable O o, @Nullable String str) {
        this.zab = api;
        this.zac = o;
        this.zad = str;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.internal.ApiKey<O> zaa(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.Api<O> r8, @androidx.annotation.Nullable O r9, @androidx.annotation.Nullable java.lang.String r10) {
        /*
            r0 = r8
            r1 = r9
            r2 = r10
            com.google.android.gms.common.api.internal.ApiKey r4 = new com.google.android.gms.common.api.internal.ApiKey
            r3 = r4
            r4 = r3
            r5 = r0
            r6 = r1
            r7 = r2
            r4.<init>(r5, r6, r7)
            r4 = r3
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ApiKey.zaa(com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, java.lang.String):com.google.android.gms.common.api.internal.ApiKey");
    }

    public final int hashCode() {
        return this.zaa;
    }

    @RecentlyNonNull
    public final String zab() {
        return this.zab.zad();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            if (r2 != 0) goto L_0x0008
            r2 = 0
            r0 = r2
        L_0x0007:
            return r0
        L_0x0008:
            r2 = r1
            r3 = r0
            if (r2 != r3) goto L_0x000f
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x000f:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.api.internal.ApiKey
            if (r2 != 0) goto L_0x0017
            r2 = 0
            r0 = r2
            goto L_0x0007
        L_0x0017:
            r2 = r1
            com.google.android.gms.common.api.internal.ApiKey r2 = (com.google.android.gms.common.api.internal.ApiKey) r2
            r1 = r2
            r2 = r0
            com.google.android.gms.common.api.Api<O> r2 = r2.zab
            r3 = r1
            com.google.android.gms.common.api.Api<O> r3 = r3.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0042
            r2 = r0
            O r2 = r2.zac
            r3 = r1
            O r3 = r3.zac
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0042
            r2 = r0
            java.lang.String r2 = r2.zad
            r3 = r1
            java.lang.String r3 = r3.zad
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x0042
            r2 = 1
            r0 = r2
            goto L_0x0007
        L_0x0042:
            r2 = 0
            r0 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ApiKey.equals(java.lang.Object):boolean");
    }
}
