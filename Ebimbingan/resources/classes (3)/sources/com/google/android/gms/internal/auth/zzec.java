package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzec {
    static void zza(Object obj, Object obj2) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (obj3 == null) {
            Throwable th3 = th2;
            String valueOf = String.valueOf(obj4);
            new StringBuilder(24 + String.valueOf(valueOf).length());
            new NullPointerException(sb2.append("null key in entry: null=").append(valueOf).toString());
            throw th3;
        } else if (obj4 == null) {
            Throwable th4 = th;
            String valueOf2 = String.valueOf(obj3);
            new StringBuilder(26 + String.valueOf(valueOf2).length());
            new NullPointerException(sb.append("null value in entry: ").append(valueOf2).append("=null").toString());
            throw th4;
        }
    }
}
