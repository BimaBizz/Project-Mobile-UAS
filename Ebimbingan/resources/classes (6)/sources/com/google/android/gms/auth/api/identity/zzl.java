package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzl implements Api.ApiOptions.Optional {
    private final String zzau;

    public static zzc zzj() {
        zzc zzc2;
        zzc zzc3 = zzc2;
        new zzc((zzn) null);
        return zzc3;
    }

    public zzl(String str) {
        this.zzau = str;
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class zzc {
        private String zzau;

        public static zzc zzc(zzl zzl) {
            zzc zzc;
            new zzc();
            zzc zzc2 = zzc;
            String zzh = zzl.zzh();
            String str = zzh;
            if (zzh != null) {
                zzc zzh2 = zzc2.zzh(str);
            }
            return zzc2;
        }

        private zzc() {
        }

        public final zzc zzh(@NonNull String str) {
            this.zzau = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final zzl zzk() {
            zzl zzl;
            new zzl(this.zzau);
            return zzl;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzc(zzn zzn) {
            this();
            zzn zzn2 = zzn;
        }
    }

    public final String zzh() {
        return this.zzau;
    }

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof zzl;
    }

    public final int hashCode() {
        return Objects.hashCode(zzl.class);
    }

    public final Bundle toBundle() {
        Bundle bundle;
        new Bundle();
        Bundle bundle2 = bundle;
        bundle2.putString("session_id", this.zzau);
        return bundle2;
    }
}
