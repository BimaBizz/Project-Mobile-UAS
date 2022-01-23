package com.google.android.gms.internal.firebase_auth;

final class zzag extends zzad {
    private final char zzgj;

    zzag(char c) {
        this.zzgj = c;
    }

    public final boolean zza(char c) {
        return c == this.zzgj;
    }

    public final String toString() {
        StringBuilder sb;
        String zzc = zzae.zzb(this.zzgj);
        new StringBuilder(18 + String.valueOf(zzc).length());
        return sb.append("CharMatcher.is('").append(zzc).append("')").toString();
    }
}
