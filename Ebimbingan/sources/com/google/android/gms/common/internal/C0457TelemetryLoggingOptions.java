package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.TelemetryLoggingOptions */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0457TelemetryLoggingOptions implements C0211Api.ApiOptions.Optional {
    @RecentlyNonNull
    public static final C0457TelemetryLoggingOptions zaa = builder().build();
    @Nullable
    private final String zab;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Builder {
        @Nullable
        private String zaa;

        private Builder() {
        }

        /* synthetic */ Builder(C0485zaac zaac) {
            C0485zaac zaac2 = zaac;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public C0457TelemetryLoggingOptions build() {
            C0457TelemetryLoggingOptions telemetryLoggingOptions;
            new C0457TelemetryLoggingOptions(this.zaa, (C0485zaac) null);
            return telemetryLoggingOptions;
        }

        @RecentlyNonNull
        @C0206KeepForSdk
        public Builder setApi(@Nullable String str) {
            this.zaa = str;
            return this;
        }
    }

    /* synthetic */ C0457TelemetryLoggingOptions(String str, C0485zaac zaac) {
        C0485zaac zaac2 = zaac;
        this.zab = str;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static Builder builder() {
        Builder builder;
        new Builder((C0485zaac) null);
        return builder;
    }

    public final int hashCode() {
        return C0444Objects.hashCode(this.zab);
    }

    @RecentlyNonNull
    public final Bundle zaa() {
        Bundle bundle;
        new Bundle();
        String str = this.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
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
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.C0457TelemetryLoggingOptions
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.common.internal.TelemetryLoggingOptions r2 = (com.google.android.gms.common.internal.C0457TelemetryLoggingOptions) r2
            r1 = r2
            r2 = r0
            java.lang.String r2 = r2.zab
            r3 = r1
            java.lang.String r3 = r3.zab
            boolean r2 = com.google.android.gms.common.internal.C0444Objects.equal(r2, r3)
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0457TelemetryLoggingOptions.equals(java.lang.Object):boolean");
    }
}
