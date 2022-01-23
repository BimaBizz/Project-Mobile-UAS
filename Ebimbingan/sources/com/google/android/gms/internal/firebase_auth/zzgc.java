package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzjc;
import java.io.InputStream;

public abstract class zzgc<MessageType extends zzjc> implements zzjm<MessageType> {
    private static final zzhf zzvq = zzhf.zzhq();

    public zzgc() {
    }

    private final MessageType zza(InputStream inputStream, zzhf zzhf) throws zzic {
        zzgr zzgr;
        zzgr zzgr2;
        zzhf zzhf2 = zzhf;
        InputStream inputStream2 = inputStream;
        InputStream inputStream3 = inputStream2;
        if (inputStream2 == null) {
            byte[] bArr = zzht.EMPTY_BYTE_ARRAY;
            byte[] bArr2 = bArr;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr3;
            zzgr2 = zzgr.zza(bArr2, 0, bArr3.length, false);
        } else {
            zzgr2 = zzgr;
            new zzgw(inputStream3, 4096, (zzgu) null);
        }
        zzgr zzgr3 = zzgr2;
        MessageType messagetype = (zzjc) zza(zzgr3, zzhf2);
        try {
            zzgr3.zzs(0);
            return messagetype;
        } catch (zzic e) {
            throw e.zzh(messagetype);
        }
    }

    public final /* synthetic */ Object zzb(InputStream inputStream, zzhf zzhf) throws zzic {
        zzkl zzkl;
        zzkl zzkl2;
        zzkl zzkl3;
        zzic zzic;
        zzkl zzkl4;
        zzjc zza = zza(inputStream, zzhf);
        zzjc zzjc = zza;
        if (zza == null || zzjc.isInitialized()) {
            return zzjc;
        }
        zzjc zzjc2 = zzjc;
        zzjc zzjc3 = zzjc2;
        if (zzjc2 instanceof zzfx) {
            zzkl2 = zzkl4;
            new zzkl((zzfx) zzjc3);
        } else if (zzjc3 instanceof zzfz) {
            zzkl2 = zzkl3;
            new zzkl((zzfz) zzjc3);
        } else {
            zzkl2 = zzkl;
            new zzkl(zzjc3);
        }
        new zzic(zzkl2.getMessage());
        throw zzic.zzh(zzjc);
    }
}
