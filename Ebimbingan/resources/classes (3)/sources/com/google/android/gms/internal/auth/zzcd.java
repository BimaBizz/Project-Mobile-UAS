package com.google.android.gms.internal.auth;

import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public enum zzcd {
    ;
    
    private final String zzbc;

    private zzcd(String str) {
        String str2 = r8;
        int i = r9;
        this.zzbc = str;
    }

    public static final zzcd zza(String str) {
        String str2 = str;
        zzcd zzcd = zzo;
        zzcd[] values = values();
        zzcd[] zzcdArr = values;
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzcd zzcd2 = zzcdArr[i];
            zzcd zzcd3 = zzcd2;
            if (zzcd2.zzbc.equals(str2)) {
                zzcd = zzcd3;
            }
        }
        return zzcd;
    }

    @ShowFirstParty
    public static boolean zza(zzcd zzcd) {
        zzcd zzcd2 = zzcd;
        if (zzj.equals(zzcd2) || zzs.equals(zzcd2) || zzv.equals(zzcd2) || zzw.equals(zzcd2) || zzn.equals(zzcd2) || zzy.equals(zzcd2) || zzg.equals(zzcd2) || zzad.equals(zzcd2) || zzae.equals(zzcd2) || zzaf.equals(zzcd2) || zzag.equals(zzcd2) || zzah.equals(zzcd2) || zzai.equals(zzcd2) || zzak.equals(zzcd2) || zzac.equals(zzcd2) || zzaj.equals(zzcd2)) {
            return true;
        }
        return false;
    }
}
