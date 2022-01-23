package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.auth.api.identity.zzl */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0102zzl implements C0211Api.ApiOptions.Optional {
    private final String zzau;

    public static zzc zzj() {
        zzc zzc2;
        zzc zzc3 = zzc2;
        new zzc((C0104zzn) null);
        return zzc3;
    }

    public C0102zzl(String str) {
        this.zzau = str;
    }

    /* renamed from: com.google.android.gms.auth.api.identity.zzl$zzc */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class zzc {
        private String zzau;

        public static zzc zzc(C0102zzl zzl) {
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
            this.zzau = C0446Preconditions.checkNotEmpty(str);
            return this;
        }

        public final C0102zzl zzk() {
            C0102zzl zzl;
            new C0102zzl(this.zzau);
            return zzl;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ zzc(C0104zzn zzn) {
            this();
            C0104zzn zzn2 = zzn;
        }
    }

    public final String zzh() {
        return this.zzau;
    }

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof C0102zzl;
    }

    public final int hashCode() {
        return C0444Objects.hashCode(C0102zzl.class);
    }

    public final Bundle toBundle() {
        Bundle bundle;
        new Bundle();
        Bundle bundle2 = bundle;
        bundle2.putString("session_id", this.zzau);
        return bundle2;
    }
}
