package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzm {
    private static final Uri zzf;
    @Nullable
    private final String zza;
    @Nullable
    private final String zzb;
    @Nullable
    private final ComponentName zzc;
    private final int zzd;
    private final boolean zze;

    static {
        Uri.Builder builder;
        new Uri.Builder();
        zzf = builder.scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public zzm(ComponentName componentName, int i) {
        ComponentName componentName2 = componentName;
        this.zza = null;
        this.zzb = null;
        Object checkNotNull = Preconditions.checkNotNull(componentName2);
        this.zzc = componentName2;
        this.zzd = i;
        this.zze = false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Integer.valueOf(this.zzd), Boolean.valueOf(this.zze));
    }

    public final String toString() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        Object checkNotNull = Preconditions.checkNotNull(this.zzc);
        return this.zzc.flattenToString();
    }

    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Nullable
    public final ComponentName zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final Intent zzd(Context context) {
        Intent intent;
        Intent component;
        Intent intent2;
        Intent intent3;
        Bundle bundle;
        StringBuilder sb;
        Bundle bundle2;
        String str;
        Context context2 = context;
        if (this.zza != null) {
            if (this.zze) {
                new Bundle();
                bundle.putString("serviceActionBundleKey", this.zza);
                try {
                    bundle2 = context2.getContentResolver().call(zzf, "serviceIntentCall", (String) null, bundle);
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(e);
                    new StringBuilder(String.valueOf(valueOf).length() + 34);
                    StringBuilder append = sb.append("Dynamic intent resolution failed: ");
                    StringBuilder append2 = sb.append(valueOf);
                    int w = Log.w("ConnectionStatusConfig", sb.toString());
                    bundle2 = null;
                }
                if (bundle2 == null) {
                    intent2 = null;
                } else {
                    intent2 = (Intent) bundle2.getParcelable("serviceResponseIntentKey");
                }
                if (intent2 == null) {
                    String valueOf2 = String.valueOf(this.zza);
                    String str2 = "Dynamic lookup for intent failed for action: ";
                    if (valueOf2.length() != 0) {
                        str = str2.concat(valueOf2);
                    } else {
                        new String(str2);
                    }
                    int w2 = Log.w("ConnectionStatusConfig", str);
                }
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                component = intent2;
            } else {
                new Intent(this.zza);
                return intent3.setPackage(this.zzb);
            }
        } else {
            new Intent();
            component = intent.setComponent(this.zzc);
        }
        return component;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzm(String str, String str2, int i) {
        this(str, "com.google.android.gms", i, false);
        String str3 = str2;
    }

    public zzm(String str, String str2, int i, boolean z) {
        String str3 = str;
        String str4 = str2;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        this.zza = str3;
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str4);
        this.zzb = str4;
        this.zzc = null;
        this.zzd = i;
        this.zze = z;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r0
            r3 = r1
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = r1
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.zzm
            if (r2 != 0) goto L_0x0011
            r2 = 0
            r0 = r2
            goto L_0x0008
        L_0x0011:
            r2 = r1
            com.google.android.gms.common.internal.zzm r2 = (com.google.android.gms.common.internal.zzm) r2
            r1 = r2
            r2 = r0
            java.lang.String r2 = r2.zza
            r3 = r1
            java.lang.String r3 = r3.zza
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x004c
            r2 = r0
            java.lang.String r2 = r2.zzb
            r3 = r1
            java.lang.String r3 = r3.zzb
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x004c
            r2 = r0
            android.content.ComponentName r2 = r2.zzc
            r3 = r1
            android.content.ComponentName r3 = r3.zzc
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L_0x004c
            r2 = r0
            int r2 = r2.zzd
            r3 = r1
            int r3 = r3.zzd
            if (r2 != r3) goto L_0x004c
            r2 = r0
            boolean r2 = r2.zze
            r3 = r1
            boolean r3 = r3.zze
            if (r2 != r3) goto L_0x004c
            r2 = 1
            r0 = r2
            goto L_0x0008
        L_0x004c:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzm.equals(java.lang.Object):boolean");
    }
}
