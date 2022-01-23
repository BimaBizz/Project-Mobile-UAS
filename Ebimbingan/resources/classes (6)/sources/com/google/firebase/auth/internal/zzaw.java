package com.google.firebase.auth.internal;

import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;

public final class zzaw {
    @VisibleForTesting
    private static final Map<String, String> zzvc;

    public static void zza(Intent intent, Status status) {
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean zzb(Intent intent) {
        Intent intent2 = intent;
        Object checkNotNull = Preconditions.checkNotNull(intent2);
        return intent2.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static Status zzc(Intent intent) {
        Intent intent2 = intent;
        Object checkNotNull = Preconditions.checkNotNull(intent2);
        Preconditions.checkArgument(zzb(intent2));
        return SafeParcelableSerializer.deserializeFromIntentExtra(intent2, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    static {
        Map<String, String> map;
        new HashMap();
        Map<String, String> map2 = map;
        zzvc = map2;
        String put = map2.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        String put2 = zzvc.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        String put3 = zzvc.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        String put4 = zzvc.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        String put5 = zzvc.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }
}
