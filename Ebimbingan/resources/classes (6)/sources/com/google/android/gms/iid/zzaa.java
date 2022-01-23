package com.google.android.gms.iid;

public final class zzaa extends Exception {
    private final int errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaa(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
