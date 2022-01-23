package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set<LibraryVersion> infos;

    GlobalLibraryVersionRegistrar() {
        Set<LibraryVersion> set;
        new HashSet();
        this.infos = set;
    }

    /* JADX INFO: finally extract failed */
    public void registerVersion(String str, String str2) {
        String sdkName = str;
        String version = str2;
        Set<LibraryVersion> set = this.infos;
        Set<LibraryVersion> set2 = set;
        synchronized (set) {
            try {
                boolean add = this.infos.add(LibraryVersion.create(sdkName, version));
            } catch (Throwable th) {
                Throwable th2 = th;
                Set<LibraryVersion> set3 = set2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Set<LibraryVersion> getRegisteredVersions() {
        Set<LibraryVersion> set = this.infos;
        Set<LibraryVersion> set2 = set;
        synchronized (set) {
            try {
                Set<LibraryVersion> unmodifiableSet = Collections.unmodifiableSet(this.infos);
                return unmodifiableSet;
            } catch (Throwable th) {
                Throwable th2 = th;
                Set<LibraryVersion> set3 = set2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar;
        GlobalLibraryVersionRegistrar localRef = INSTANCE;
        if (localRef == null) {
            Class<GlobalLibraryVersionRegistrar> cls = GlobalLibraryVersionRegistrar.class;
            Class<GlobalLibraryVersionRegistrar> cls2 = cls;
            synchronized (cls) {
                try {
                    localRef = INSTANCE;
                    if (localRef == null) {
                        new GlobalLibraryVersionRegistrar();
                        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = globalLibraryVersionRegistrar;
                        localRef = globalLibraryVersionRegistrar2;
                        INSTANCE = globalLibraryVersionRegistrar2;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Class<GlobalLibraryVersionRegistrar> cls3 = cls2;
                    throw th2;
                }
            }
        }
        return localRef;
    }
}
