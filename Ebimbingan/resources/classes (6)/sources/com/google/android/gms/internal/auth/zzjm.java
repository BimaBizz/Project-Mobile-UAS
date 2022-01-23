package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzjm extends zzjn<FieldDescriptorType, Object> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzjm(int i) {
        super(i, (zzjm) null);
    }

    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                Map.Entry zzb = zzb(i);
                Map.Entry entry = zzb;
                if (((zzhg) zzb.getKey()).zzd()) {
                    Object value = entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : zzd()) {
                Map.Entry entry3 = entry2;
                if (((zzhg) entry2.getKey()).zzd()) {
                    Object value2 = entry3.setValue(Collections.unmodifiableList((List) entry3.getValue()));
                }
            }
        }
        super.zza();
    }
}
