package com.google.android.gms.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public final class zzd {
    public static KeyPair zzl() {
        Throwable th;
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            NoSuchAlgorithmException noSuchAlgorithmException = e;
            Throwable th2 = th;
            new AssertionError(noSuchAlgorithmException);
            throw th2;
        }
    }
}
