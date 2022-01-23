package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

public final class zzee extends zzai implements Api.ApiOptions.HasOptions {
    private final String zzht;

    private zzee(String str) {
        this.zzht = Preconditions.checkNotEmpty(str, "A valid API key must be provided");
    }

    public final String getApiKey() {
        return this.zzht;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r1
            r4 = r0
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof com.google.firebase.auth.api.internal.zzee
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            com.google.firebase.auth.api.internal.zzee r3 = (com.google.firebase.auth.api.internal.zzee) r3
            r2 = r3
            r3 = r0
            java.lang.String r3 = r3.zzht
            r4 = r2
            java.lang.String r4 = r4.zzht
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzee.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzht});
    }

    public final /* synthetic */ zzai zzdt() {
        return (zzee) clone();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzed zzed;
        new zzed(this.zzht);
        return zzed.zzef();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzee(String str, zzeb zzeb) {
        this(str);
        zzeb zzeb2 = zzeb;
    }
}
