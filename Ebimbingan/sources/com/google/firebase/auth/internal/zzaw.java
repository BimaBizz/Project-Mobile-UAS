package com.google.firebase.auth.internal;

import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0464SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;

public final class zzaw {
    @VisibleForTesting
    private static final Map<String, String> zzvc;

    public static void zza(Intent intent, C0236Status status) {
        C0464SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean zzb(Intent intent) {
        Intent intent2 = intent;
        Object checkNotNull = C0446Preconditions.checkNotNull(intent2);
        return intent2.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static C0236Status zzc(Intent intent) {
        Intent intent2 = intent;
        Object checkNotNull = C0446Preconditions.checkNotNull(intent2);
        C0446Preconditions.checkArgument(zzb(intent2));
        return (C0236Status) C0464SafeParcelableSerializer.deserializeFromIntentExtra(intent2, "com.google.firebase.auth.internal.STATUS", C0236Status.CREATOR);
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
