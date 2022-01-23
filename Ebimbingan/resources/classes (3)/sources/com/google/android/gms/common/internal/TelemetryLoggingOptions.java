package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {
    @RecentlyNonNull
    public static final TelemetryLoggingOptions zaa = builder().build();
    @Nullable
    private final String zab;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class Builder {
        @Nullable
        private String zaa;

        private Builder() {
        }

        /* synthetic */ Builder(zaac zaac) {
            zaac zaac2 = zaac;
        }

        @RecentlyNonNull
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            TelemetryLoggingOptions telemetryLoggingOptions;
            new TelemetryLoggingOptions(this.zaa, (zaac) null);
            return telemetryLoggingOptions;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setApi(@Nullable String str) {
            this.zaa = str;
            return this;
        }
    }

    /* synthetic */ TelemetryLoggingOptions(String str, zaac zaac) {
        zaac zaac2 = zaac;
        this.zab = str;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Builder builder() {
        Builder builder;
        new Builder((zaac) null);
        return builder;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zab);
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
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.TelemetryLoggingOptions
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.common.internal.TelemetryLoggingOptions r2 = (com.google.android.gms.common.internal.TelemetryLoggingOptions) r2
            r1 = r2
            r2 = r0
            java.lang.String r2 = r2.zab
            r3 = r1
            java.lang.String r3 = r3.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.TelemetryLoggingOptions.equals(java.lang.Object):boolean");
    }
}
