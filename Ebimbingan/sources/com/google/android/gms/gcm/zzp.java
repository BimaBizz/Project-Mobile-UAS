package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.os.Trace;
import com.google.android.gms.common.util.C0609PlatformVersion;
import com.google.android.gms.iid.zzai;
import com.google.android.gms.iid.zzaj;
import java.io.Closeable;

public final class zzp implements Closeable {
    private static final zzaj<Boolean> zzba = zzai.zzy().zzd("nts.enable_tracing", true);
    private final boolean enabled;

    @TargetApi(18)
    public zzp(String str) {
        String substring;
        String str2 = str;
        this.enabled = C0609PlatformVersion.isAtLeastJellyBeanMR2() && zzba.get().booleanValue();
        if (this.enabled) {
            String str3 = str2;
            String str4 = str3;
            if (str3.length() <= 127) {
                substring = str4;
            } else {
                substring = str4.substring(0, 127);
            }
            Trace.beginSection(substring);
        }
    }

    @TargetApi(18)
    public final void close() {
        if (this.enabled) {
            Trace.endSection();
        }
    }
}
