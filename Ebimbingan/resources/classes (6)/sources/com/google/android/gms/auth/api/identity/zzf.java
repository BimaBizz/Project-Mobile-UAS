package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class zzf implements Api.ApiOptions.Optional {
    private final String zzau;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class zzc {
        private String zzau;

        private zzc() {
        }

        public static zzc zzc(zzf zzf) {
            zzc zzc;
            new zzc();
            zzc zzc2 = zzc;
            String zzh = zzf.zzh();
            String str = zzh;
            if (zzh != null) {
                zzc zze = zzc2.zze(str);
            }
            return zzc2;
        }

        public final zzc zze(@NonNull String str) {
            this.zzau = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final zzf zzi() {
            zzf zzf;
            new zzf(this.zzau);
            return zzf;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzc(zze zze) {
            this();
            zze zze2 = zze;
        }
    }

    public static zzc zzg() {
        zzc zzc2;
        zzc zzc3 = zzc2;
        new zzc((zze) null);
        return zzc3;
    }

    public zzf(String str) {
        this.zzau = str;
    }

    public final String zzh() {
        return this.zzau;
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof zzf;
    }

    public int hashCode() {
        return Objects.hashCode(zzf.class);
    }

    public final Bundle toBundle() {
        Bundle bundle;
        new Bundle();
        Bundle bundle2 = bundle;
        bundle2.putString("session_id", this.zzau);
        return bundle2;
    }
}
