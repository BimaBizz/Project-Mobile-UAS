package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class zzi extends zzx {
    private final int zza;

    protected zzi(byte[] bArr) {
        boolean z;
        byte[] bArr2 = bArr;
        if (bArr2.length == 25) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
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
        if (obj2 == null || !(obj2 instanceof zzy)) {
            return false;
        }
        try {
            zzy zzy = (zzy) obj2;
            if (zzy.zze() != this.zza) {
                return false;
            }
            IObjectWrapper zzd = zzy.zzd();
            if (zzd == null) {
                return false;
            }
            return Arrays.equals(zzc(), (byte[]) ObjectWrapper.unwrap(zzd));
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

    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(zzc());
    }

    public final int zze() {
        return this.zza;
    }
}
