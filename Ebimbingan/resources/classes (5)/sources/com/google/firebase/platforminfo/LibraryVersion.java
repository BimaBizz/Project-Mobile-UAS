package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

@AutoValue
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
abstract class LibraryVersion {
    @Nonnull
    public abstract String getLibraryName();

    @Nonnull
    public abstract String getVersion();

    LibraryVersion() {
    }

    static LibraryVersion create(String name, String version) {
        LibraryVersion libraryVersion;
        new AutoValue_LibraryVersion(name, version);
        return libraryVersion;
    }
}
