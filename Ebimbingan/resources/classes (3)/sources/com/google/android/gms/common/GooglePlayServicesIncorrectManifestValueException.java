package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GooglePlayServicesIncorrectManifestValueException(int r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            int r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r2 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r3 = r4
            r4 = r3
            r5 = 320(0x140, float:4.48E-43)
            r4.<init>(r5)
            r4 = r3
            java.lang.String r5 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            java.lang.StringBuilder r4 = r4.append(r5)
            r4 = r3
            r5 = r2
            java.lang.StringBuilder r4 = r4.append(r5)
            r4 = r3
            java.lang.String r5 = " but found "
            java.lang.StringBuilder r4 = r4.append(r5)
            r4 = r3
            r5 = r1
            java.lang.StringBuilder r4 = r4.append(r5)
            r4 = r3
            java.lang.String r5 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            java.lang.StringBuilder r4 = r4.append(r5)
            r4 = r0
            r5 = r1
            r6 = r3
            java.lang.String r6 = r6.toString()
            r4.<init>(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException.<init>(int):void");
    }
}
