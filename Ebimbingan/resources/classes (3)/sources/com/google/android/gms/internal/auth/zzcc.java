package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzcc extends FastSafeParcelableJsonResponse {
    private static String zza = "AUTH";

    public zzcc() {
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
