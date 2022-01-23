package com.google.android.gms.internal.auth;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.auth.zzhs */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0984zzhs extends IOException {
    private C1011zzis zza = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0984zzhs(String str) {
        super(str);
    }

    public final C0984zzhs zza(C1011zzis zzis) {
        this.zza = zzis;
        return this;
    }

    static C0984zzhs zza() {
        C0984zzhs zzhs;
        C0984zzhs zzhs2 = zzhs;
        new C0984zzhs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return zzhs2;
    }

    static C0984zzhs zzb() {
        C0984zzhs zzhs;
        C0984zzhs zzhs2 = zzhs;
        new C0984zzhs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return zzhs2;
    }

    static C0984zzhs zzc() {
        C0984zzhs zzhs;
        C0984zzhs zzhs2 = zzhs;
        new C0984zzhs("Protocol message contained an invalid tag (zero).");
        return zzhs2;
    }

    static C0987zzhv zzd() {
        C0987zzhv zzhv;
        C0987zzhv zzhv2 = zzhv;
        new C0987zzhv("Protocol message tag had invalid wire type.");
        return zzhv2;
    }

    static C0984zzhs zze() {
        C0984zzhs zzhs;
        C0984zzhs zzhs2 = zzhs;
        new C0984zzhs("Failed to parse the message.");
        return zzhs2;
    }

    static C0984zzhs zzf() {
        C0984zzhs zzhs;
        C0984zzhs zzhs2 = zzhs;
        new C0984zzhs("Protocol message had invalid UTF-8.");
        return zzhs2;
    }
}
