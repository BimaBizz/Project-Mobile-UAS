package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

public class zzic extends IOException {
    private zzjc zzabf = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzic(String str) {
        super(str);
    }

    public final zzic zzh(zzjc zzjc) {
        this.zzabf = zzjc;
        return this;
    }

    static zzic zzir() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return zzic2;
    }

    static zzic zzis() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return zzic2;
    }

    static zzic zzit() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("CodedInputStream encountered a malformed varint.");
        return zzic2;
    }

    static zzic zziu() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("Protocol message contained an invalid tag (zero).");
        return zzic2;
    }

    static zzic zziv() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("Protocol message end-group tag did not match expected tag.");
        return zzic2;
    }

    static zzib zziw() {
        zzib zzib;
        zzib zzib2 = zzib;
        new zzib("Protocol message tag had invalid wire type.");
        return zzib2;
    }

    static zzic zzix() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        return zzic2;
    }

    static zzic zziy() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("Failed to parse the message.");
        return zzic2;
    }

    static zzic zziz() {
        zzic zzic;
        zzic zzic2 = zzic;
        new zzic("Protocol message had invalid UTF-8.");
        return zzic2;
    }
}
