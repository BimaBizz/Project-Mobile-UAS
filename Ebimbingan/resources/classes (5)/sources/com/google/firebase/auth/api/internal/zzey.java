package com.google.firebase.auth.api.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;

public final class zzey {
    private final String packageName;
    private final String zzqu;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzey(android.content.Context r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r0
            r3 = r1
            r4 = r1
            java.lang.String r4 = r4.getPackageName()
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.internal.zzey.<init>(android.content.Context):void");
    }

    private zzey(Context context, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        Context context2 = context;
        String str6 = str;
        Object checkNotNull = Preconditions.checkNotNull(context2);
        this.packageName = Preconditions.checkNotEmpty(str6);
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context2, this.packageName);
            if (packageCertificateHashBytes == null) {
                String valueOf = String.valueOf(str6);
                String str7 = valueOf;
                if (valueOf.length() != 0) {
                    str5 = "single cert required: ".concat(str7);
                } else {
                    str5 = str4;
                    new String("single cert required: ");
                }
                int e = Log.e("FBA-PackageInfo", str5);
                this.zzqu = null;
                return;
            }
            this.zzqu = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf2 = String.valueOf(str6);
            String str8 = valueOf2;
            if (valueOf2.length() != 0) {
                str3 = "no pkg: ".concat(str8);
            } else {
                str3 = str2;
                new String("no pkg: ");
            }
            int e3 = Log.e("FBA-PackageInfo", str3);
            this.zzqu = null;
        }
    }

    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String zzeo() {
        return this.zzqu;
    }
}
