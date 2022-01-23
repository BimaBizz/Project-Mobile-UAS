package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.C0599DynamiteApi;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.dynamic.C0663ObjectWrapper;
import com.google.android.gms.flags.zzd;

@C0599DynamiteApi
public class FlagProviderImpl extends zzd {
    private boolean zzu = false;
    private SharedPreferences zzv;

    public FlagProviderImpl() {
    }

    public void init(C0661IObjectWrapper iObjectWrapper) {
        String str;
        String str2;
        Context context = (Context) C0663ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzu) {
            try {
                this.zzv = zzj.zza(context.createPackageContext("com.google.android.gms", 0));
                this.zzu = true;
            } catch (PackageManager.NameNotFoundException e) {
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                String str3 = valueOf;
                if (valueOf.length() != 0) {
                    str2 = "Could not retrieve sdk flags, continuing with defaults: ".concat(str3);
                } else {
                    str2 = str;
                    new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
                int w = Log.w("FlagProviderImpl", str2);
            }
        }
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        String str2 = str;
        boolean z2 = z;
        int i2 = i;
        if (!this.zzu) {
            return z2;
        }
        return zzb.zza(this.zzv, str2, Boolean.valueOf(z2)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        if (!this.zzu) {
            return i3;
        }
        return zzd.zza(this.zzv, str2, Integer.valueOf(i3)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        String str2 = str;
        long j2 = j;
        int i2 = i;
        if (!this.zzu) {
            return j2;
        }
        return zzf.zza(this.zzv, str2, Long.valueOf(j2)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (!this.zzu) {
            return str4;
        }
        return zzh.zza(this.zzv, str3, str4);
    }
}
