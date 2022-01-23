package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.C0559FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.auth.zzcc */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0833zzcc extends C0559FastSafeParcelableJsonResponse {
    private static String zza = "AUTH";

    public C0833zzcc() {
    }

    public byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            int e2 = Log.e(zza, "Error serializing object.", e);
            return null;
        }
    }
}
