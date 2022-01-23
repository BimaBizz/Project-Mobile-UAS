package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0544zzx;
import com.google.android.gms.common.internal.C0545zzy;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.dynamic.C0663ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.zzi */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class C0640zzi extends C0544zzx {
    private final int zza;

    protected C0640zzi(byte[] bArr) {
        boolean z;
        byte[] bArr2 = bArr;
        if (bArr2.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C0446Preconditions.checkArgument(z);
        this.zza = Arrays.hashCode(bArr2);
    }

    protected static byte[] zzf(String str) {
        Throwable th;
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            new AssertionError(e);
            throw th;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj2 == null || !(obj2 instanceof C0545zzy)) {
            return false;
        }
        try {
            C0545zzy zzy = (C0545zzy) obj2;
            if (zzy.zze() != this.zza) {
                return false;
            }
            C0661IObjectWrapper zzd = zzy.zzd();
            if (zzd == null) {
                return false;
            }
            return Arrays.equals(zzc(), (byte[]) C0663ObjectWrapper.unwrap(zzd));
        } catch (RemoteException e) {
            int e2 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] zzc();

    public final C0661IObjectWrapper zzd() {
        return C0663ObjectWrapper.wrap(zzc());
    }

    public final int zze() {
        return this.zza;
    }
}
