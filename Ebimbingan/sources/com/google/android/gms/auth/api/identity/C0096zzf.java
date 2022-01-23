package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.auth.api.identity.zzf */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0096zzf implements C0211Api.ApiOptions.Optional {
    private final String zzau;

    /* renamed from: com.google.android.gms.auth.api.identity.zzf$zzc */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class zzc {
        private String zzau;

        private zzc() {
        }

        public static zzc zzc(C0096zzf zzf) {
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
            this.zzau = C0446Preconditions.checkNotEmpty(str);
            return this;
        }

        public final C0096zzf zzi() {
            C0096zzf zzf;
            new C0096zzf(this.zzau);
            return zzf;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzc(C0095zze zze) {
            this();
            C0095zze zze2 = zze;
        }
    }

    public static zzc zzg() {
        zzc zzc2;
        zzc zzc3 = zzc2;
        new zzc((C0095zze) null);
        return zzc3;
    }

    public C0096zzf(String str) {
        this.zzau = str;
    }

    public final String zzh() {
        return this.zzau;
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof C0096zzf;
    }

    public int hashCode() {
        return C0444Objects.hashCode(C0096zzf.class);
    }

    public final Bundle toBundle() {
        Bundle bundle;
        new Bundle();
        Bundle bundle2 = bundle;
        bundle2.putString("session_id", this.zzau);
        return bundle2;
    }
}
