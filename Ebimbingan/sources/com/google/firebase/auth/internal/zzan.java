package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.C0547Logger;
import com.google.android.gms.internal.firebase_auth.zzbl;
import com.google.firebase.auth.GetTokenResult;
import java.util.Collections;
import java.util.Map;

public final class zzan {
    private static final C0547Logger zzjt;

    public static GetTokenResult zzdf(String str) {
        Map<String, Object> map;
        GetTokenResult getTokenResult;
        String str2 = str;
        try {
            map = zzam.zzdd(str2);
        } catch (zzbl e) {
            zzjt.e("Error parsing token claims", e, new Object[0]);
            map = Collections.EMPTY_MAP;
        }
        new GetTokenResult(str2, map);
        return getTokenResult;
    }

    static {
        C0547Logger logger;
        new C0547Logger("GetTokenResultFactory", new String[0]);
        zzjt = logger;
    }
}
