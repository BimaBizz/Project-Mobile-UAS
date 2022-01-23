package com.google.android.gms.internal.firebase_auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzjw extends zzjt<FieldDescriptorType, Object> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzjw(int i) {
        super(i, (zzjw) null);
    }

    public final void zzfy() {
        if (!isImmutable()) {
            for (int i = 0; i < zzjy(); i++) {
                Map.Entry zzbf = zzbf(i);
                Map.Entry entry = zzbf;
                if (((zzhk) zzbf.getKey()).zzhz()) {
                    Object value = entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : zzjz()) {
                Map.Entry entry3 = entry2;
                if (((zzhk) entry2.getKey()).zzhz()) {
                    Object value2 = entry3.setValue(Collections.unmodifiableList((List) entry3.getValue()));
                }
            }
        }
        super.zzfy();
    }
}
