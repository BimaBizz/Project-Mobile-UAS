package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.DowngradeableSafeParcel */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0430DowngradeableSafeParcel extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    private static final Object zza;
    private boolean zzb = false;

    static {
        Object obj;
        new Object();
        zza = obj;
    }

    public C0430DowngradeableSafeParcel() {
    }

    @C0206KeepForSdk
    protected static boolean canUnparcelSafely(@RecentlyNonNull String str) {
        String str2 = str;
        Object obj = zza;
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return true;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    protected static Integer getUnparcelClientVersion() {
        Object obj = zza;
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public abstract boolean prepareForClientVersion(int i);

    @C0206KeepForSdk
    public void setShouldDowngrade(boolean z) {
        boolean z2 = z;
        this.zzb = z2;
    }

    /* access modifiers changed from: protected */
    @C0206KeepForSdk
    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
