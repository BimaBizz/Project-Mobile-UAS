package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzhs extends IOException {
    private zzis zza = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzhs(String str) {
        super(str);
    }

    public final zzhs zza(zzis zzis) {
        this.zza = zzis;
        return this;
    }

    static zzhs zza() {
        zzhs zzhs;
        zzhs zzhs2 = zzhs;
        new zzhs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return zzhs2;
    }

    static zzhs zzb() {
        zzhs zzhs;
        zzhs zzhs2 = zzhs;
        new zzhs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return zzhs2;
    }

    static zzhs zzc() {
        zzhs zzhs;
        zzhs zzhs2 = zzhs;
        new zzhs("Protocol message contained an invalid tag (zero).");
        return zzhs2;
    }

    static zzhv zzd() {
        zzhv zzhv;
        zzhv zzhv2 = zzhv;
        new zzhv("Protocol message tag had invalid wire type.");
        return zzhv2;
    }

    static zzhs zze() {
        zzhs zzhs;
        zzhs zzhs2 = zzhs;
        new zzhs("Failed to parse the message.");
        return zzhs2;
    }

    static zzhs zzf() {
        zzhs zzhs;
        zzhs zzhs2 = zzhs;
        new zzhs("Protocol message had invalid UTF-8.");
        return zzhs2;
    }
}
