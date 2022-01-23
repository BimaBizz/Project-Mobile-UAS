package com.google.android.gms.internal.auth;

import com.google.android.gms.common.internal.C0452ShowFirstParty;

@C0452ShowFirstParty
/* renamed from: com.google.android.gms.internal.auth.zzcd */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public enum C0834zzcd {
    ;
    
    private final String zzbc;

    private C0834zzcd(String str) {
        String str2 = r8;
        int i = r9;
        this.zzbc = str;
    }

    public static final C0834zzcd zza(String str) {
        String str2 = str;
        C0834zzcd zzcd = zzo;
        C0834zzcd[] values = values();
        C0834zzcd[] zzcdArr = values;
        int length = values.length;
        for (int i = 0; i < length; i++) {
            C0834zzcd zzcd2 = zzcdArr[i];
            C0834zzcd zzcd3 = zzcd2;
            if (zzcd2.zzbc.equals(str2)) {
                zzcd = zzcd3;
            }
        }
        return zzcd;
    }

    @C0452ShowFirstParty
    public static boolean zza(C0834zzcd zzcd) {
        C0834zzcd zzcd2 = zzcd;
        if (zzj.equals(zzcd2) || zzs.equals(zzcd2) || zzv.equals(zzcd2) || zzw.equals(zzcd2) || zzn.equals(zzcd2) || zzy.equals(zzcd2) || zzg.equals(zzcd2) || zzad.equals(zzcd2) || zzae.equals(zzcd2) || zzaf.equals(zzcd2) || zzag.equals(zzcd2) || zzah.equals(zzcd2) || zzai.equals(zzcd2) || zzak.equals(zzcd2) || zzac.equals(zzcd2) || zzaj.equals(zzcd2)) {
            return true;
        }
        return false;
    }
}
