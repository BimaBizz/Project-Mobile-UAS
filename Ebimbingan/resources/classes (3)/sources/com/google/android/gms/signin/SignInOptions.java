package com.google.android.gms.signin;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class SignInOptions implements Api.ApiOptions.Optional {
    @RecentlyNonNull
    public static final SignInOptions zaa;
    private final boolean zab = false;
    private final boolean zac = false;
    @Nullable
    private final String zad = null;
    private final boolean zae = false;
    @Nullable
    private final String zaf = null;
    @Nullable
    private final String zag = null;
    private final boolean zah = false;
    @Nullable
    private final Long zai = null;
    @Nullable
    private final Long zaj = null;

    static {
        SignInOptions signInOptions;
        new SignInOptions(false, false, (String) null, false, (String) null, (String) null, false, (Long) null, (Long) null, (zaf) null);
        zaa = signInOptions;
    }

    /* synthetic */ SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2, zaf zaf2) {
        boolean z5 = z;
        boolean z6 = z2;
        String str4 = str;
        boolean z7 = z3;
        String str5 = str2;
        String str6 = str3;
        boolean z8 = z4;
        Long l3 = l;
        Long l4 = l2;
        zaf zaf3 = zaf2;
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, null, null, null, null, null, null, null);
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
            r3 = r0
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.signin.SignInOptions
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.signin.SignInOptions r2 = (com.google.android.gms.signin.SignInOptions) r2
            r0 = r2
            r2 = r0
            boolean r2 = r2.zab
            r2 = r0
            boolean r2 = r2.zac
            r2 = r0
            java.lang.String r2 = r2.zad
            r2 = 0
            r3 = 0
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x005b
            r2 = r0
            boolean r2 = r2.zae
            r2 = r0
            boolean r2 = r2.zah
            r2 = r0
            java.lang.String r2 = r2.zaf
            r2 = 0
            r3 = 0
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x005b
            r2 = r0
            java.lang.String r2 = r2.zag
            r2 = 0
            r3 = 0
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x005b
            r2 = r0
            java.lang.Long r2 = r2.zai
            r2 = 0
            r3 = 0
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x005b
            r2 = r0
            java.lang.Long r2 = r2.zaj
            r2 = 0
            r3 = 0
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x005b
            r2 = 1
            r0 = r2
            goto L_0x0008
        L_0x005b:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.SignInOptions.equals(java.lang.Object):boolean");
    }
}
