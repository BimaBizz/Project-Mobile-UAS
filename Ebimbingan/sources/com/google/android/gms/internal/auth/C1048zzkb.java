package com.google.android.gms.internal.auth;

import java.util.List;

/* renamed from: com.google.android.gms.internal.auth.zzkb */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C1048zzkb extends RuntimeException {
    private final List<String> zza = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1048zzkb(C1011zzis zzis) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        C1011zzis zzis2 = zzis;
    }
}
