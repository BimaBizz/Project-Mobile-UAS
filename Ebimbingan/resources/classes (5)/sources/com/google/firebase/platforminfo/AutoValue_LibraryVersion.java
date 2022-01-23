package com.google.firebase.platforminfo;

import javax.annotation.Nonnull;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final class AutoValue_LibraryVersion extends LibraryVersion {
    private final String libraryName;
    private final String version;

    AutoValue_LibraryVersion(String str, String str2) {
        Throwable th;
        Throwable th2;
        String libraryName2 = str;
        String version2 = str2;
        if (libraryName2 == null) {
            Throwable th3 = th2;
            new NullPointerException("Null libraryName");
            throw th3;
        }
        this.libraryName = libraryName2;
        if (version2 == null) {
            Throwable th4 = th;
            new NullPointerException("Null version");
            throw th4;
        }
        this.version = version2;
    }

    @Nonnull
    public String getLibraryName() {
        return this.libraryName;
    }

    @Nonnull
    public String getVersion() {
        return this.version;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("LibraryVersion{libraryName=").append(this.libraryName).append(", version=").append(this.version).append("}").toString();
    }

    public boolean equals(Object obj) {
        Object o = obj;
        if (o == this) {
            return true;
        }
        if (!(o instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion that = (LibraryVersion) o;
        return this.libraryName.equals(that.getLibraryName()) && this.version.equals(that.getVersion());
    }

    public int hashCode() {
        return (((1 * 1000003) ^ this.libraryName.hashCode()) * 1000003) ^ this.version.hashCode();
    }
}
