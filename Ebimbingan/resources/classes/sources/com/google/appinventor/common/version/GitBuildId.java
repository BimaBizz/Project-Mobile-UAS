package com.google.appinventor.common.version;

public final class GitBuildId {
    public static final String ANT_BUILD_DATE = "October 3 2021";
    public static final String GIT_BUILD_FINGERPRINT = "a77fd14efadb2781c61772b29ca898d5d5964502";
    public static final String GIT_BUILD_VERSION = "1.5.3-Fenix";

    private GitBuildId() {
    }

    public static String getVersion() {
        String str = GIT_BUILD_VERSION;
        String str2 = str;
        if (str == "" || str2.contains(" ")) {
            return "none";
        }
        return str2;
    }

    public static String getFingerprint() {
        return GIT_BUILD_FINGERPRINT;
    }

    public static String getDate() {
        return ANT_BUILD_DATE;
    }
}
